/*
 * $Id: MASSadminUsersModel.java,v 1 2015/01/13 13:58:00 Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.model.vo;

import java.io.Serializable;

/**
 * The administrator user contains administrator information.
 * 
 * @author khoapkl
 */
public class MASSadminUsersModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private int agentId;
	private String userName;
	private String password;

	private String ddmin;

	private String loc;

	private int batchId;

	private String orderEntry;

	/**
	 * @return the agentId
	 */
	public int getAgentId() {
		return this.agentId;
	}

	/**
	 * @return the batchId
	 */
	public int getBatchId() {
		return this.batchId;
	}

	/**
	 * @return the ddmin
	 */
	public String getDdmin() {
		return this.ddmin;
	}

	/**
	 * @return the loc
	 */
	public String getLoc() {
		return this.loc;
	}

	/**
	 * @return the orderEntry
	 */
	public String getOrderEntry() {
		return this.orderEntry;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * @param agentId
	 *            the agentId to set
	 */
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	/**
	 * @param batchId
	 *            the batchId to set
	 */
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	/**
	 * @param ddmin
	 *            the ddmin to set
	 */
	public void setDdmin(String ddmin) {
		this.ddmin = ddmin;
	}

	/**
	 * @param loc
	 *            the loc to set
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}
	/**
	 * @param orderEntry
	 *            the orderEntry to set
	 */
	public void setOrderEntry(String orderEntry) {
		this.orderEntry = orderEntry;
	}
	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
