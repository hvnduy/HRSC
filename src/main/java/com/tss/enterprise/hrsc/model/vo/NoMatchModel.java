/*
 * $Id: NoMatchModel.java,v 1 2015/01/13 13:58:00 Exp $
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
 * The order header contains header information.
 *
 * @author khoapkl
 */
public class NoMatchModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String itemSKU;

	private String receivedBy;

	private Date receivedDate;

	private String templateName;

	/**
	 * @return the itemSKU
	 */
	public String getItemSKU() {
		return this.itemSKU;
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
	 * @return the templateName
	 */
	public String getTemplateName() {
		return this.templateName;
	}

	/**
	 * @param itemSKU
	 *            the itemSKU to set
	 */
	public void setItemSKU(String itemSKU) {
		this.itemSKU = itemSKU;
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
	 * @param templateName
	 *            the templateName to set
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
