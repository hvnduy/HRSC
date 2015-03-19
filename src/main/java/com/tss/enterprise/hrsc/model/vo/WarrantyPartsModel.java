/*
 * $Id: WarrantyPartsModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class WarrantyPartsModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String partNumber;
	private String description;
	private String mfgSku;
	private Date createdDate;
	private double price;
	private int categoryId;
	private int warrantyCat;
	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return this.categoryId;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return this.createdDate;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * @return the mfgSku
	 */
	public String getMfgSku() {
		return this.mfgSku;
	}
	/**
	 * @return the partNumber
	 */
	public String getPartNumber() {
		return this.partNumber;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return this.price;
	}
	/**
	 * @return the warrantyCat
	 */
	public int getWarrantyCat() {
		return this.warrantyCat;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param mfgSku the mfgSku to set
	 */
	public void setMfgSku(String mfgSku) {
		this.mfgSku = mfgSku;
	}
	/**
	 * @param partNumber the partNumber to set
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @param warrantyCat the warrantyCat to set
	 */
	public void setWarrantyCat(int warrantyCat) {
		this.warrantyCat = warrantyCat;
	}

}
