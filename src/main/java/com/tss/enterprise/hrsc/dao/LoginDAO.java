/*
 * $Id: LoginDAO.java,v 1.0 2015/01/13 11:08:03  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.dao;

import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * @author khoapkl
 */
public interface LoginDAO {

	String validateUser(String userName, String password) throws MASSException;
}
