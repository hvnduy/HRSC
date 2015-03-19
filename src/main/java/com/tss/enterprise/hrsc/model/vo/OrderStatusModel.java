/*
 * $Id: OrderStatusModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class OrderStatusModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String status;
	private String attribute;

	private int statusID;

	/**
	 * @return the attribute
	 */
	public String getAttribute() {
		return this.attribute;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * @return the statusID
	 */
	public int getStatusID() {
		return this.statusID;
	}

	/**
	 * @param attribute
	 *            the attribute to set
	 */
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param statusID
	 *            the statusID to set
	 */
	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}

}
