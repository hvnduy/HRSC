/*
 * $Id: ReconTempModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class ReconTempModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String serviceTag;

	private String location;

	private String attribute26;

	private String receivedBy;

	private Date receivedDate;

	/**
	 * @return the attribute26
	 */
	public String getAttribute26() {
		return this.attribute26;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return this.location;
	}

	/**
	 * @return the receivedBy
	 */
	public String getReceivedBy() {
		return this.receivedBy;
	}

	/**
	 * @return the receivedDate
	 */
	public Date getReceivedDate() {
		return this.receivedDate;
	}

	/**
	 * @return the serviceTag
	 */
	public String getServiceTag() {
		return this.serviceTag;
	}

	/**
	 * @param attribute26
	 *            the attribute26 to set
	 */
	public void setAttribute26(String attribute26) {
		this.attribute26 = attribute26;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @param receivedBy
	 *            the receivedBy to set
	 */
	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}

	/**
	 * @param receivedDate
	 *            the receivedDate to set
	 */
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	/**
	 * @param serviceTag
	 *            the serviceTag to set
	 */
	public void setServiceTag(String serviceTag) {
		this.serviceTag = serviceTag;
	}

}
