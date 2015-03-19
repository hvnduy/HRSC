/*
 * $Id: AdminUsersModel.java,v 1 2015/01/13 13:58:00 Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.model.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * The administrator user contains administrator information.
 * 
 * @author khoapkl
 */
public class AdminUsersModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private int active;
	private int admin;
	private int agentId;
	private String email;
	private String fullName;
	private int loginCount;
	private Date loginTime;

	private String password;

	private Date passWordDate;

	private int report;

	private String userLevel;

	private String userName;

	private int userType;

	/**
	 * @return the active
	 */
	public int getActive() {
		return this.active;
	}

	/**
	 * @return the admin
	 */
	public int getAdmin() {
		return this.admin;
	}

	/**
	 * @return the agentId
	 */
	public int getAgentId() {
		return this.agentId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return this.fullName;
	}

	/**
	 * @return the loginCount
	 */
	public int getLoginCount() {
		return this.loginCount;
	}

	/**
	 * @return the loginTime
	 */
	public Date getLoginTime() {
		return this.loginTime;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @return the passWordDate
	 */
	public Date getPassWordDate() {
		return this.passWordDate;
	}

	/**
	 * @return the report
	 */
	public int getReport() {
		return this.report;
	}

	/**
	 * @return the userLevel
	 */
	public String getUserLevel() {
		return this.userLevel;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * @return the userType
	 */
	public int getUserType() {
		return this.userType;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(int active) {
		this.active = active;
	}

	/**
	 * @param admin
	 *            the admin to set
	 */
	public void setAdmin(int admin) {
		this.admin = admin;
	}

	/**
	 * @param agentId
	 *            the agentId to set
	 */
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @param loginCount
	 *            the loginCount to set
	 */
	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}

	/**
	 * @param loginTime
	 *            the loginTime to set
	 */
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param passWordDate
	 *            the passWordDate to set
	 */
	public void setPassWordDate(Date passWordDate) {
		this.passWordDate = passWordDate;
	}
	/**
	 * @param report
	 *            the report to set
	 */
	public void setReport(int report) {
		this.report = report;
	}
	/**
	 * @param userLevel
	 *            the userLevel to set
	 */
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @param userType
	 *            the userType to set
	 */
	public void setUserType(int userType) {
		this.userType = userType;
	}

}
