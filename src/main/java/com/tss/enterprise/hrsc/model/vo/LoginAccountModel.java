/*
 * $Id: LoginAccountModel.java,v 1 2015/01/20 10:39:00 Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.model.vo;

/**
 * The Class LoginAccountModel.
 * @author duyhuynh
 */
public class LoginAccountModel {

	/** The userid. */
	private String userid;

	/** The accountid. */
	private String accountid;

	/** The Access right. */
	private String AccessRight;

	/**
	 * Gets the userid.
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * Sets the userid.
	 * @param userid
	 *            the new userid
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * Gets the accountid.
	 * @return the accountid
	 */
	public String getAccountid() {
		return accountid;
	}

	/**
	 * Sets the accountid.
	 * @param accountid
	 *            the new accountid
	 */
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	/**
	 * Gets the access right.
	 * @return the access right
	 */
	public String getAccessRight() {
		return AccessRight;
	}

	/**
	 * Sets the access right.
	 * @param accessRight
	 *            the new access right
	 */
	public void setAccessRight(String accessRight) {
		AccessRight = accessRight;
	}
}
