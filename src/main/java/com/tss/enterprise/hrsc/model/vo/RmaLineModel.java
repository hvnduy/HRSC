/*
 * $Id: RmaLineModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class RmaLineModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String rmaNumber;
	private int lineNumber;
	private String partNumber;
	private String description;
	private String condition;
	private int qty;
	private String box;
	private String soft;
	private String miss;
	private Date dateCreated;

	private double refundAmt;

	private Date dateClosed;

	private int partialFlag;

	private String location;

	private String component;

	private double unitPrice;

	private double tax;

	private double freight;

	public String getBox() {
		return this.box;
	}

	public String getComponent() {
		return this.component;
	}

	public String getCondition() {
		return this.condition;
	}

	public Date getDateClosed() {
		return this.dateClosed;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public String getDescription() {
		return this.description;
	}

	public double getFreight() {
		return this.freight;
	}

	public int getLineNumber() {
		return this.lineNumber;
	}

	public String getLocation() {
		return this.location;
	}

	public String getMiss() {
		return this.miss;
	}

	public int getPartialFlag() {
		return this.partialFlag;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public int getQty() {
		return this.qty;
	}

	public double getRefundAmt() {
		return this.refundAmt;
	}

	public String getRmaNumber() {
		return this.rmaNumber;
	}

	public String getSoft() {
		return this.soft;
	}

	public double getTax() {
		return this.tax;
	}

	public double getUnitPrice() {
		return this.unitPrice;
	}

	public void setBox(String box) {
		this.box = box;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public void setDateClosed(Date dateClosed) {
		this.dateClosed = dateClosed;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFreight(double freight) {
		this.freight = freight;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setMiss(String miss) {
		this.miss = miss;
	}

	public void setPartialFlag(int partialFlag) {
		this.partialFlag = partialFlag;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setRefundAmt(double refundAmt) {
		this.refundAmt = refundAmt;
	}
	public void setRmaNumber(String rmaNumber) {
		this.rmaNumber = rmaNumber;
	}
	public void setSoft(String soft) {
		this.soft = soft;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
