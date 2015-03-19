/*
 * $Id: DataStatesDAOImpl.java,v 1 2015/01/13 13:58:00  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.tss.enterprise.hrsc.dao.LoginDAO;
import com.tss.enterprise.hrsc.utils.MASSException;

/**
 *
 * @author
 */
@Repository
public class LoginDAOImpl implements LoginDAO {

	private static final Logger LOG = Logger.getLogger(LoginDAOImpl.class);
	/**
	 * get Setting
	 */
	@Value("${com.mass.sql.getStates}")
	private String getStates;

	private String userName;
	private String passWord;

	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return this.passWord;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String validateUser(String userName, String password)
			throws MASSException {
		// TODO Auto-generated method stub
		return null;
	}



}
