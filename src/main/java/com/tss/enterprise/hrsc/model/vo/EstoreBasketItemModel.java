/*
 * $Id: EstoreBasketItemModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class EstoreBasketItemModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String shopperId;
	private Date created;
	private Date modified;
	private long itemId;
	private String itemSku;
	private String mfgPartNumber;
	private int quantity;
	private int placedPrice;
	private String name;
	private String shortDescription;
	private double weight;
	private int byAgent;
	private int categoryId;

	/**
	 * @return the byAgent
	 */
	public int getByAgent() {
		return this.byAgent;
	}

	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return this.categoryId;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return this.created;
	}

	/**
	 * @return the itemId
	 */
	public long getItemId() {
		return this.itemId;
	}

	/**
	 * @return the itemSku
	 */
	public String getItemSku() {
		return this.itemSku;
	}

	/**
	 * @return the mfgPartNumber
	 */
	public String getMfgPartNumber() {
		return this.mfgPartNumber;
	}

	/**
	 * @return the modified
	 */
	public Date getModified() {
		return this.modified;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the placedPrice
	 */
	public int getPlacedPrice() {
		return this.placedPrice;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return this.quantity;
	}

	/**
	 * @return the shopperId
	 */
	public String getShopperId() {
		return this.shopperId;
	}

	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return this.shortDescription;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return this.weight;
	}

	/**
	 * @param byAgent
	 *            the byAgent to set
	 */
	public void setByAgent(int byAgent) {
		this.byAgent = byAgent;
	}

	/**
	 * @param categoryId
	 *            the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @param created
	 *            the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @param itemId
	 *            the itemId to set
	 */
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	/**
	 * @param itemSku
	 *            the itemSku to set
	 */
	public void setItemSku(String itemSku) {
		this.itemSku = itemSku;
	}

	/**
	 * @param mfgPartNumber
	 *            the mfgPartNumber to set
	 */
	public void setMfgPartNumber(String mfgPartNumber) {
		this.mfgPartNumber = mfgPartNumber;
	}

	/**
	 * @param modified
	 *            the modified to set
	 */
	public void setModified(Date modified) {
		this.modified = modified;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param placedPrice
	 *            the placedPrice to set
	 */
	public void setPlacedPrice(int placedPrice) {
		this.placedPrice = placedPrice;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param shopperId
	 *            the shopperId to set
	 */
	public void setShopperId(String shopperId) {
		this.shopperId = shopperId;
	}

	/**
	 * @param shortDescription
	 *            the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
