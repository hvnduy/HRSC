/*
 * $Id: EstoreEppModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class EstoreEppOrderModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String eppId;
	private String orderNumber;
	private String shopperId;

	private double estSubTotal;

	private double dfsDiscount;

	private double corDiscount;

	private double shippingDiscount;

	/**
	 * @return the corDiscount
	 */
	public double getCorDiscount() {
		return this.corDiscount;
	}

	/**
	 * @return the dfsDiscount
	 */
	public double getDfsDiscount() {
		return this.dfsDiscount;
	}

	/**
	 * @return the eppId
	 */
	public String getEppId() {
		return this.eppId;
	}

	/**
	 * @return the estSubTotal
	 */
	public double getEstSubTotal() {
		return this.estSubTotal;
	}

	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return this.orderNumber;
	}

	/**
	 * @return the shippingDiscount
	 */
	public double getShippingDiscount() {
		return this.shippingDiscount;
	}

	/**
	 * @return the shopperId
	 */
	public String getShopperId() {
		return this.shopperId;
	}

	/**
	 * @param corDiscount
	 *            the corDiscount to set
	 */
	public void setCorDiscount(double corDiscount) {
		this.corDiscount = corDiscount;
	}

	/**
	 * @param dfsDiscount
	 *            the dfsDiscount to set
	 */
	public void setDfsDiscount(double dfsDiscount) {
		this.dfsDiscount = dfsDiscount;
	}

	/**
	 * @param eppId
	 *            the eppId to set
	 */
	public void setEppId(String eppId) {
		this.eppId = eppId;
	}

	/**
	 * @param estSubTotal
	 *            the estSubTotal to set
	 */
	public void setEstSubTotal(double estSubTotal) {
		this.estSubTotal = estSubTotal;
	}
	/**
	 * @param orderNumber
	 *            the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @param shippingDiscount
	 *            the shippingDiscount to set
	 */
	public void setShippingDiscount(double shippingDiscount) {
		this.shippingDiscount = shippingDiscount;
	}
	/**
	 * @param shopperId
	 *            the shopperId to set
	 */
	public void setShopperId(String shopperId) {
		this.shopperId = shopperId;
	}
}
