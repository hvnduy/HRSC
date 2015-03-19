/*
 * $Id: LoginService.java,v 1 2015/01/14 13:58:00  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrscservice;

import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * LoginService interface.
 * @author
 */

public interface LoginService {

	String validateUser(String userName, String password) throws MASSException;

}
