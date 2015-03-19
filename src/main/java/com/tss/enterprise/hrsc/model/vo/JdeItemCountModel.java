/*
 * $Id: JdeItemCountModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class JdeItemCountModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private int qty;
	private String orderNumber;
	private String mfgSku;

	/**
	 * @return the mfgSku
	 */
	public String getMfgSku() {
		return this.mfgSku;
	}

	/**
	 * @return the orderNumber
	 */
	public String getOrdernNumber() {
		return this.orderNumber;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return this.qty;
	}

	/**
	 * @param mfgSku
	 *            the mfgSku to set
	 */
	public void setMfgSku(String mfgSku) {
		this.mfgSku = mfgSku;
	}

	/**
	 * @param orderNumber
	 *            the orderNumber to set
	 */
	public void setOrdernNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @param qty
	 *            the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

}
