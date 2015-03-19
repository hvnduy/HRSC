/*
 * $Id: LoginServiceImpl.java,v 1 2015/01/14 13:58:00 Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tss.enterprise.hrsc.dao.LoginDAO;
import com.tss.enterprise.hrsc.dao.impl.LoginAccountDAOImpl;
import com.tss.enterprise.hrsc.model.vo.LoginAccountModel;
import com.tss.enterprise.hrsc.model.vo.MASSadminUsersModel;
import com.tss.enterprise.hrsc.utils.CommonFunction;
import com.tss.enterprise.hrsc.utils.MASSException;
import com.tss.enterprise.hrscservice.MASSAdminUsersService;

/**
 * The LoginServiceImpl Class.
 * @author
 */
@Service("loginUserDetailsService")
public class LoginServiceImpl implements UserDetailsService {

	/** The Constant LOG. */
	public static final Logger LOG = Logger.getLogger(LoginServiceImpl.class);

	/** The login dao. */
	@Autowired
	private LoginDAO loginDao;

	/** The admin users service. */
	@Autowired
	private MASSAdminUsersService adminUsersService;

	/** The login account dao impl. */
	@Autowired
	private LoginAccountDAOImpl loginAccountDAOImpl;

	/**
	 * Builds the user authority.
	 * @param userid
	 *            the userid
	 * @return the list
	 */
	private List<GrantedAuthority> buildUserAuthority(String userid) {

		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
		List<LoginAccountModel> lst = null;
		try {
			lst = this.loginAccountDAOImpl.getLoginAccountByUserID(userid);
		} catch (MASSException e) {
			LoginServiceImpl.LOG.info(e.getMessage());
		}

		// Build user's authorities
		for (LoginAccountModel loginAccountModel : lst) {
			setAuths.add(new SimpleGrantedAuthority(loginAccountModel.getAccountid()));
		}
		List<GrantedAuthority> result = new ArrayList<GrantedAuthority>(setAuths);

		return result;
	}

	/**
	 * Converts com.tss.enterprise.hrsc.model.vo.MASSadminUsersModel org.springframework.security.core.userdetails.User.
	 * @param model
	 *            the model
	 * @param authorities
	 *            the authorities
	 * @return the user
	 */
	private User buildUserForAuthentication(MASSadminUsersModel model,
			List<GrantedAuthority> authorities) {
		return new User(model.getUserName(), model.getPassword(),
				true, true, true, true, authorities);
	}

	/**
	 * Gets the login dao.
	 * @return the loginDao
	 */
	public LoginDAO getLoginDao() {
		return this.loginDao;
	}

	@Transactional(readOnly = true)
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		MASSadminUsersModel usersModel = null;
		try {
			usersModel = this.adminUsersService.getMASSadminUsers(userName);
		} catch (MASSException e) {
			e.printStackTrace();
		}
		LoginServiceImpl.LOG.info("user name: " + userName);
		User user = null;
		if(!CommonFunction.isEmpty(usersModel)){
			List<GrantedAuthority> authorities = this.buildUserAuthority(usersModel.getUserName());
			user = this.buildUserForAuthentication(usersModel, authorities);
		}
		return user;
	}

	/**
	 * Sets the login dao.
	 * @param loginDao
	 *            the loginDao to set
	 */
	public void setLoginDao(LoginDAO loginDao) {
		this.loginDao = loginDao;
	}

}
