/*
 * $Id: GlobalExceptionController.java,v 1.0 2014/03/13 11:08:03  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.controller;

import java.io.StringWriter;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * Global Exception handling.
 * 
 * @author khoapkl
 */
@ControllerAdvice
public class GlobalExceptionController {
	private static final Logger LOG = Logger.getLogger(GlobalExceptionController.class);

	/**
	 * Handle all exception.
	 *
	 * @param ex the ex
	 * @return the model and view
	 */
	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {
		// ModelAndView model = new ModelAndView("common/generic_error");
		ModelAndView model = new ModelAndView("genericError.tile");
		LOG.error(ex.getMessage(), ex);
		// model.addObject("errMsg", "this is Exception.class");
		model.addObject("errMsg", ex.getMessage());
		model.addObject("errDetal", ex.getStackTrace());
		return model;
	}

	/**
	 * Handle custom exception.
	 *
	 * @param ex the ex
	 * @return the model and view
	 */
	@ExceptionHandler(MASSException.class)
	public ModelAndView handleCustomException(MASSException ex) {
		// ModelAndView model = new ModelAndView("common/generic_error");
		ModelAndView model = new ModelAndView("genericError.tile");
		model.addObject("errMsg", ex.getMessage());
		StringWriter sw = new StringWriter();
		//		ex.printStackTrace(new PrintWriter(sw));
		LOG.info(sw.toString());
		model.addObject("errDetal", sw.toString());
		LOG.error(ex.getMessage(), ex);
		return model;
	}
}
