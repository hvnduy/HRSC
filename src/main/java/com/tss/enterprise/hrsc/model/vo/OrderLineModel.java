/*
 * $Id: OrderLineModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class OrderLineModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String orderNumber;
	private String shopperId;
	private Date created;
	private Date modified;
	private long itemId;

	private String itemSku;

	private String mfgPartNumber;

	private String description;

	private String shortDescription;

	private double weight;

	private int quantity;

	private int qtyPicked;

	private int qtyShipped;

	private double productListPrice;

	private Date lastChangeDate;

	private String lastChangeBy;

	private Date dateShipped;

	private String lineFlag;

	private double iadjustRegularprice;

	private double iadjustCurrentprice;

	private double oadjustAdjustedprice;

	private String trackingNumber;

	private int priKey;

	private String location;

	private String auction;

	private double screenSize;

	private String shipmentId;

	private int export;

	private double discount;

	private double discountedPrice;

	private String cosmeticGrade;

	/**
	 * @return the auction
	 */
	public String getAuction() {
		return this.auction;
	}

	/**
	 * @return the cosmeticGrade
	 */
	public String getCosmeticGrade() {
		return this.cosmeticGrade;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return this.created;
	}

	/**
	 * @return the dateShipped
	 */
	public Date getDateShipped() {
		return this.dateShipped;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return this.discount;
	}

	/**
	 * @return the discountedPrice
	 */
	public double getDiscountedPrice() {
		return this.discountedPrice;
	}

	/**
	 * @return the export
	 */
	public int getExport() {
		return this.export;
	}

	/**
	 * @return the iadjustCurrentprice
	 */
	public double getIadjustCurrentprice() {
		return this.iadjustCurrentprice;
	}

	/**
	 * @return the iadjustRegularprice
	 */
	public double getIadjustRegularprice() {
		return this.iadjustRegularprice;
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
	 * @return the lastChangeBy
	 */
	public String getLastChangeBy() {
		return this.lastChangeBy;
	}

	/**
	 * @return the lastChangeDate
	 */
	public Date getLastChangeDate() {
		return this.lastChangeDate;
	}

	/**
	 * @return the lineFlag
	 */
	public String getLineFlag() {
		return this.lineFlag;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return this.location;
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
	 * @return the oadjustAdjustedprice
	 */
	public double getOadjustAdjustedprice() {
		return this.oadjustAdjustedprice;
	}

	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return this.orderNumber;
	}

	/**
	 * @return the priKey
	 */
	public int getPriKey() {
		return this.priKey;
	}

	/**
	 * @return the productListPrice
	 */
	public double getProductListPrice() {
		return this.productListPrice;
	}

	/**
	 * @return the qtyPicked
	 */
	public int getQtyPicked() {
		return this.qtyPicked;
	}

	/**
	 * @return the qtyShipped
	 */
	public int getQtyShipped() {
		return this.qtyShipped;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return this.quantity;
	}

	/**
	 * @return the screenSize
	 */
	public double getScreenSize() {
		return this.screenSize;
	}

	/**
	 * @return the shipmentId
	 */
	public String getShipmentId() {
		return this.shipmentId;
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
	 * @return the trackingNumber
	 */
	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return this.weight;
	}

	/**
	 * @param auction
	 *            the auction to set
	 */
	public void setAuction(String auction) {
		this.auction = auction;
	}

	/**
	 * @param cosmeticGrade
	 *            the cosmeticGrade to set
	 */
	public void setCosmeticGrade(String cosmeticGrade) {
		this.cosmeticGrade = cosmeticGrade;
	}

	/**
	 * @param created
	 *            the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @param dateShipped
	 *            the dateShipped to set
	 */
	public void setDateShipped(Date dateShipped) {
		this.dateShipped = dateShipped;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param discount
	 *            the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	/**
	 * @param discountedPrice
	 *            the discountedPrice to set
	 */
	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	/**
	 * @param export
	 *            the export to set
	 */
	public void setExport(int export) {
		this.export = export;
	}
	/**
	 * @param iadjustCurrentprice
	 *            the iadjustCurrentprice to set
	 */
	public void setIadjustCurrentprice(double iadjustCurrentprice) {
		this.iadjustCurrentprice = iadjustCurrentprice;
	}
	/**
	 * @param iadjustRegularprice
	 *            the iadjustRegularprice to set
	 */
	public void setIadjustRegularprice(double iadjustRegularprice) {
		this.iadjustRegularprice = iadjustRegularprice;
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
	 * @param lastChangeBy
	 *            the lastChangeBy to set
	 */
	public void setLastChangeBy(String lastChangeBy) {
		this.lastChangeBy = lastChangeBy;
	}
	/**
	 * @param lastChangeDate
	 *            the lastChangeDate to set
	 */
	public void setLastChangeDate(Date lastChangeDate) {
		this.lastChangeDate = lastChangeDate;
	}
	/**
	 * @param lineFlag
	 *            the lineFlag to set
	 */
	public void setLineFlag(String lineFlag) {
		this.lineFlag = lineFlag;
	}
	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
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
	 * @param oadjustAdjustedprice
	 *            the oadjustAdjustedprice to set
	 */
	public void setOadjustAdjustedprice(double oadjustAdjustedprice) {
		this.oadjustAdjustedprice = oadjustAdjustedprice;
	}
	/**
	 * @param orderNumber
	 *            the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @param priKey
	 *            the priKey to set
	 */
	public void setPriKey(int priKey) {
		this.priKey = priKey;
	}
	/**
	 * @param productListPrice
	 *            the productListPrice to set
	 */
	public void setProductListPrice(double productListPrice) {
		this.productListPrice = productListPrice;
	}
	/**
	 * @param qtyPicked
	 *            the qtyPicked to set
	 */
	public void setQtyPicked(int qtyPicked) {
		this.qtyPicked = qtyPicked;
	}
	/**
	 * @param qtyShipped
	 *            the qtyShipped to set
	 */
	public void setQtyShipped(int qtyShipped) {
		this.qtyShipped = qtyShipped;
	}
	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @param screenSize
	 *            the screenSize to set
	 */
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	/**
	 * @param shipmentId
	 *            the shipmentId to set
	 */
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
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
	 * @param trackingNumber
	 *            the trackingNumber to set
	 */
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
