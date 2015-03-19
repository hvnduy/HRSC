/*
 * $Id: TableTemplateModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class TableTemplateModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private int templateQty;
	private String templateName;

	private String status;

	private Date dateOpen;

	private Date lastDateScanned;

	private int receivedQty;

	private Date dateDropped;

	/**
	 * @return the dateDropped
	 */
	public Date getDateDropped() {
		return this.dateDropped;
	}

	/**
	 * @return the dateOpen
	 */
	public Date getDateOpen() {
		return this.dateOpen;
	}

	/**
	 * @return the lastDateScanned
	 */
	public Date getLastDateScanned() {
		return this.lastDateScanned;
	}

	/**
	 * @return the receivedQty
	 */
	public int getReceivedQty() {
		return this.receivedQty;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * @return the templateName
	 */
	public String getTemplateName() {
		return this.templateName;
	}

	/**
	 * @return the templateQty
	 */
	public int getTemplateQty() {
		return this.templateQty;
	}

	/**
	 * @param dateDropped
	 *            the dateDropped to set
	 */
	public void setDateDropped(Date dateDropped) {
		this.dateDropped = dateDropped;
	}

	/**
	 * @param dateOpen
	 *            the dateOpen to set
	 */
	public void setDateOpen(Date dateOpen) {
		this.dateOpen = dateOpen;
	}

	/**
	 * @param lastDateScanned
	 *            the lastDateScanned to set
	 */
	public void setLastDateScanned(Date lastDateScanned) {
		this.lastDateScanned = lastDateScanned;
	}
	/**
	 * @param receivedQty
	 *            the receivedQty to set
	 */
	public void setReceivedQty(int receivedQty) {
		this.receivedQty = receivedQty;
	}
	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @param templateName
	 *            the templateName to set
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	/**
	 * @param templateQty
	 *            the templateQty to set
	 */
	public void setTemplateQty(int templateQty) {
		this.templateQty = templateQty;
	}

}
