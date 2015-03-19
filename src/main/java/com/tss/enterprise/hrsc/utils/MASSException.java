/*
 * $Id: MASSException.java,v 1 2015/01/14 13:58:00 Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.utils;

/**
 * MASSException class.
 * @author
 */
public class MASSException extends Exception {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * MASSException constructor method.
	 * @param e
	 *            Exception
	 * @author Hai.Ngo
	 */
	public MASSException(Exception e) {
		super(e);
	}

	/**
	 * Instantiates a new MASS exception.
	 *
	 * @param arg0 the arg0
	 */
	public MASSException(String arg0) {
		super(arg0);
	}
}
