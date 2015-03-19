/*
 * $Id: LoginAccountDAO.java,v 1.0 2015/01/20 10:51:03  Exp $
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.dao;

import java.util.List;

import com.tss.enterprise.hrsc.model.vo.LoginAccountModel;
import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * The Interface LoginAccountDAO.
 * @author duyhuynh
 */
public interface LoginAccountDAO {

	/**
	 * Gets the login account by user id.
	 * @param userid
	 *            the userid
	 * @return the login account by user id
	 * @author duyhuynh
	 */
	List<LoginAccountModel> getLoginAccountByUserID(String userid) throws MASSException;
}
