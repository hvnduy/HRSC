/*
 * $Id: EstoreBasketModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class EstoreBasketModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String shopperId;
	private int orderId;
	private Date created;
	private Date modified;
	private String shipMethod;
	private String shipTerms;

	private double shipCos;

	private String ccName;

	private String ccNumber;

	private String ccType;

	private int ccExpMonth;

	private int ccExpYear;

	private String eppId;

	private String userHold;

	private int discountType;

	private double discountValue;

	/**
	 * @return the ccExpMonth
	 */
	public int getCcExpMonth() {
		return this.ccExpMonth;
	}

	/**
	 * @return the ccExpYear
	 */
	public int getCcExpYear() {
		return this.ccExpYear;
	}

	/**
	 * @return the ccName
	 */
	public String getCcName() {
		return this.ccName;
	}

	/**
	 * @return the ccNumber
	 */
	public String getCcNumber() {
		return this.ccNumber;
	}

	/**
	 * @return the ccType
	 */
	public String getCcType() {
		return this.ccType;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return this.created;
	}

	/**
	 * @return the discountType
	 */
	public int getDiscountType() {
		return this.discountType;
	}

	/**
	 * @return the discountValue
	 */
	public double getDiscountValue() {
		return this.discountValue;
	}

	/**
	 * @return the eppId
	 */
	public String getEppId() {
		return this.eppId;
	}

	/**
	 * @return the modified
	 */
	public Date getModified() {
		return this.modified;
	}

	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return this.orderId;
	}

	/**
	 * @return the shipCos
	 */
	public double getShipCos() {
		return this.shipCos;
	}

	/**
	 * @return the shipMethod
	 */
	public String getShipMethod() {
		return this.shipMethod;
	}

	/**
	 * @return the shipTerms
	 */
	public String getShipTerms() {
		return this.shipTerms;
	}

	/**
	 * @return the shopperId
	 */
	public String getShopperId() {
		return this.shopperId;
	}

	/**
	 * @return the userHold
	 */
	public String getUserHold() {
		return this.userHold;
	}

	/**
	 * @param ccExpMonth
	 *            the ccExpMonth to set
	 */
	public void setCcExpMonth(int ccExpMonth) {
		this.ccExpMonth = ccExpMonth;
	}

	/**
	 * @param ccExpYear
	 *            the ccExpYear to set
	 */
	public void setCcExpYear(int ccExpYear) {
		this.ccExpYear = ccExpYear;
	}

	/**
	 * @param ccName
	 *            the ccName to set
	 */
	public void setCcName(String ccName) {
		this.ccName = ccName;
	}

	/**
	 * @param ccNumber
	 *            the ccNumber to set
	 */
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	/**
	 * @param ccType
	 *            the ccType to set
	 */
	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

	/**
	 * @param created
	 *            the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @param discountType
	 *            the discountType to set
	 */
	public void setDiscountType(int discountType) {
		this.discountType = discountType;
	}
	/**
	 * @param discountValue
	 *            the discountValue to set
	 */
	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}
	/**
	 * @param eppId
	 *            the eppId to set
	 */
	public void setEppId(String eppId) {
		this.eppId = eppId;
	}
	/**
	 * @param modified
	 *            the modified to set
	 */
	public void setModified(Date modified) {
		this.modified = modified;
	}
	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	/**
	 * @param shipCos
	 *            the shipCos to set
	 */
	public void setShipCos(double shipCos) {
		this.shipCos = shipCos;
	}
	/**
	 * @param shipMethod
	 *            the shipMethod to set
	 */
	public void setShipMethod(String shipMethod) {
		this.shipMethod = shipMethod;
	}
	/**
	 * @param shipTerms
	 *            the shipTerms to set
	 */
	public void setShipTerms(String shipTerms) {
		this.shipTerms = shipTerms;
	}
	/**
	 * @param shopperId
	 *            the shopperId to set
	 */
	public void setShopperId(String shopperId) {
		this.shopperId = shopperId;
	}
	/**
	 * @param userHold
	 *            the userHold to set
	 */
	public void setUserHold(String userHold) {
		this.userHold = userHold;
	}

}
