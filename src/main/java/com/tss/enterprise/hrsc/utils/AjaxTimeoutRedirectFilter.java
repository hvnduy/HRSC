/*
 * $Id: AjaxTimeoutRedirectFilter.java,v 1.16 2013/10/29 13:58:02  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.utils;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.util.ThrowableAnalyzer;
import org.springframework.security.web.util.ThrowableCauseExtractor;
import org.springframework.web.filter.GenericFilterBean;

/**
 * @author khoapkl
 */
public class AjaxTimeoutRedirectFilter extends GenericFilterBean {

	/**
	 * @author khoapkl
	 */
	private static final class DefaultThrowableAnalyzer extends ThrowableAnalyzer {
		/**
		 * @author khoapkl
		 */
		@Override
		protected void initExtractorMap() {
			super.initExtractorMap();
			this.registerExtractor(ServletException.class, new ThrowableCauseExtractor() {
				public Throwable extractCause(Throwable throwable) {
					ThrowableAnalyzer.verifyThrowableHierarchy(throwable, ServletException.class);
					ServletException ex = new ServletException(throwable);
					//					return ((ServletException) throwable).getRootCause();
					return ex.getRootCause();
				}
			});
		}
	}
	private static final Logger LOG = Logger.getLogger(AjaxTimeoutRedirectFilter.class);
	private ThrowableAnalyzer throwableAnalyzer = new DefaultThrowableAnalyzer();
	private AuthenticationTrustResolver authenticationTrustResolver = new AuthenticationTrustResolverImpl();

	private int customSessionExpiredErrorCode = AntiMagicNumber.NINE_HUNDRED_AND_ONE;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		try {
			chain.doFilter(request, response);

			LOG.debug("Chain processed normally");
			// } catch (IOException ex) {
			// throw ex;
		} catch (Exception ex) {
			LOG.error(ex.getMessage(), ex);
			Throwable[] causeChain = this.throwableAnalyzer.determineCauseChain(ex);
			RuntimeException ase = (AuthenticationException) this.throwableAnalyzer.getFirstThrowableOfType(AuthenticationException.class, causeChain);

			if (ase == null) {
				ase = (AccessDeniedException) this.throwableAnalyzer.getFirstThrowableOfType(AccessDeniedException.class, causeChain);
			}

			if (ase != null) {
				if (ase instanceof AuthenticationException) {
					throw ase;
				} else if (ase instanceof AccessDeniedException) {

					if (this.authenticationTrustResolver.isAnonymous(SecurityContextHolder.getContext().getAuthentication())) {
						LOG.info("User session expired or not logged in yet");
						String ajaxHeader = ((HttpServletRequest) request).getHeader("X-Requested-With");

						if ("XMLHttpRequest".equals(ajaxHeader)) {
							LOG.info("Ajax call detected, send {} error code");// , this.customSessionExpiredErrorCode);
							HttpServletResponse resp = (HttpServletResponse) response;
							resp.sendError(this.customSessionExpiredErrorCode);
						} else {
							LOG.info("Redirect to login page");
							throw ase;
						}
					} else {
						throw ase;
					}
				}
			}
		}
	}

	public void setCustomSessionExpiredErrorCode(int customSessionExpiredErrorCode) {
		this.customSessionExpiredErrorCode = customSessionExpiredErrorCode;
	}
}
