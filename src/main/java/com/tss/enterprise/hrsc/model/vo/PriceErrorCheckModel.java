/*
 * $Id: PayMethodsModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class PriceErrorCheckModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String orderNumber;
	private double showPrice;
	private double calPrice;

	private Date createdDate;

	/**
	 * @return the calPrice
	 */
	public double getCalPrice() {
		return this.calPrice;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return this.createdDate;
	}

	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return this.orderNumber;
	}

	/**
	 * @return the showPrice
	 */
	public double getShowPrice() {
		return this.showPrice;
	}

	/**
	 * @param calPrice
	 *            the calPrice to set
	 */
	public void setCalPrice(double calPrice) {
		this.calPrice = calPrice;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @param orderNumber
	 *            the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @param showPrice
	 *            the showPrice to set
	 */
	public void setShowPrice(double showPrice) {
		this.showPrice = showPrice;
	}

}
