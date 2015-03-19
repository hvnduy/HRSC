/*
 * $Id: JDERptRFModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class JDERptRFModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String typeSale;
	private String saleRep;
	private String ccType;
	private String ccNumber;
	private String avsCode;
	private String ipAddress;
	private String userId;
	private String itemSku;
	private String mfgSku;
	private String orderNumber;
	private String shipToCompany;
	private String shipToLName;
	private String shipToFName;
	private String shipToAddress1;
	private String shipToAddress2;
	private String shipToCity;
	private String shipToState;
	private String shipToPostal;
	private String shipToPhone;
	private double listPrice;
	private double salePrice;
	private double discount;
	private double stateTax;
	private double countyTax;
	private double countyTrans;
	private double localTax;
	private double localTrans;
	private double taxTotal;
	private String countyName;
	private double shippingTotal;
	private String shippingMethod;
	private double edealsRf;
	private double rfTotal;
	private String screenSize;
	private Date rfDate;
	private String resellerCode;
	private String loa;
	private String taxExempt;
	private String taxExemptNo;
	private Date taxExemptExpire;
	private String taxExemptState;
	private String taxExemptMult;
	private String mriCustomer;
	private String shipToEmail;
	private String discountPromoCode;
	private String transType;
	private String billToCompany;
	private String billToLName;
	private String billToFName;
	private String billToAddress1;
	private String billToAddress2;
	private String billToCity;
	private String billToState;
	private String billToPostal;
	private String po;
	private String categoryId;
	private int shipCode;
	private int dtPack;
	private int nbPack;
	private String rfreference;
	private int qty;

	/**
	 * @return the avsCode
	 */
	public String getAvsCode() {
		return this.avsCode;
	}

	/**
	 * @return the billToAddress1
	 */
	public String getBillToAddress1() {
		return this.billToAddress1;
	}

	/**
	 * @return the billToAddress2
	 */
	public String getBillToAddress2() {
		return this.billToAddress2;
	}

	/**
	 * @return the billToCity
	 */
	public String getBillToCity() {
		return this.billToCity;
	}

	/**
	 * @return the billToCompany
	 */
	public String getBillToCompany() {
		return this.billToCompany;
	}

	/**
	 * @return the billToFName
	 */
	public String getBillToFName() {
		return this.billToFName;
	}

	/**
	 * @return the billToLName
	 */
	public String getBillToLName() {
		return this.billToLName;
	}

	/**
	 * @return the billToPostal
	 */
	public String getBillToPostal() {
		return this.billToPostal;
	}

	/**
	 * @return the billToState
	 */
	public String getBillToState() {
		return this.billToState;
	}

	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return this.categoryId;
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
	 * @return the countyName
	 */
	public String getCountyName() {
		return this.countyName;
	}

	/**
	 * @return the countyTax
	 */
	public double getCountyTax() {
		return this.countyTax;
	}

	/**
	 * @return the countyTrans
	 */
	public double getCountyTrans() {
		return this.countyTrans;
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return this.discount;
	}

	/**
	 * @return the discountPromoCode
	 */
	public String getDiscountPromoCode() {
		return this.discountPromoCode;
	}

	/**
	 * @return the dtPack
	 */
	public int getDtPack() {
		return this.dtPack;
	}

	/**
	 * @return the edealsRf
	 */
	public double getEdealsRf() {
		return this.edealsRf;
	}

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return this.ipAddress;
	}

	/**
	 * @return the itemSku
	 */
	public String getItemSku() {
		return this.itemSku;
	}

	/**
	 * @return the listPrice
	 */
	public double getListPrice() {
		return this.listPrice;
	}

	/**
	 * @return the loa
	 */
	public String getLoa() {
		return this.loa;
	}

	/**
	 * @return the localTax
	 */
	public double getLocalTax() {
		return this.localTax;
	}

	/**
	 * @return the localTrans
	 */
	public double getLocalTrans() {
		return this.localTrans;
	}

	/**
	 * @return the mfgSku
	 */
	public String getMfgSku() {
		return this.mfgSku;
	}

	/**
	 * @return the mriCustomer
	 */
	public String getMriCustomer() {
		return this.mriCustomer;
	}

	/**
	 * @return the nbPack
	 */
	public int getNbPack() {
		return this.nbPack;
	}

	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return this.orderNumber;
	}

	/**
	 * @return the po
	 */
	public String getPo() {
		return this.po;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return this.qty;
	}

	/**
	 * @return the resellerCode
	 */
	public String getResellerCode() {
		return this.resellerCode;
	}

	/**
	 * @return the rfDate
	 */
	public Date getRfDate() {
		return this.rfDate;
	}

	/**
	 * @return the rfreference
	 */
	public String getRfreference() {
		return this.rfreference;
	}

	/**
	 * @return the rfTotal
	 */
	public double getRfTotal() {
		return this.rfTotal;
	}

	/**
	 * @return the salePrice
	 */
	public double getSalePrice() {
		return this.salePrice;
	}

	/**
	 * @return the saleRep
	 */
	public String getSaleRep() {
		return this.saleRep;
	}

	/**
	 * @return the screenSize
	 */
	public String getScreenSize() {
		return this.screenSize;
	}

	/**
	 * @return the shipCode
	 */
	public int getShipCode() {
		return this.shipCode;
	}

	/**
	 * @return the shippingMethod
	 */
	public String getShippingMethod() {
		return this.shippingMethod;
	}

	/**
	 * @return the shippingTotal
	 */
	public double getShippingTotal() {
		return this.shippingTotal;
	}

	/**
	 * @return the shipToAddress1
	 */
	public String getShipToAddress1() {
		return this.shipToAddress1;
	}

	/**
	 * @return the shipToAddress2
	 */
	public String getShipToAddress2() {
		return this.shipToAddress2;
	}

	/**
	 * @return the shipToCity
	 */
	public String getShipToCity() {
		return this.shipToCity;
	}

	/**
	 * @return the shipToCompany
	 */
	public String getShipToCompany() {
		return this.shipToCompany;
	}

	/**
	 * @return the shipToEmail
	 */
	public String getShipToEmail() {
		return this.shipToEmail;
	}

	/**
	 * @return the shipToFName
	 */
	public String getShipToFName() {
		return this.shipToFName;
	}

	/**
	 * @return the shipToLName
	 */
	public String getShipToLName() {
		return this.shipToLName;
	}

	/**
	 * @return the shipToPhone
	 */
	public String getShipToPhone() {
		return this.shipToPhone;
	}

	/**
	 * @return the shipToPostal
	 */
	public String getShipToPostal() {
		return this.shipToPostal;
	}

	/**
	 * @return the shipToState
	 */
	public String getShipToState() {
		return this.shipToState;
	}

	/**
	 * @return the stateTax
	 */
	public double getStateTax() {
		return this.stateTax;
	}

	/**
	 * @return the taxExempt
	 */
	public String getTaxExempt() {
		return this.taxExempt;
	}

	/**
	 * @return the taxExemptExpire
	 */
	public Date getTaxExemptExpire() {
		return this.taxExemptExpire;
	}

	/**
	 * @return the taxExemptMult
	 */
	public String getTaxExemptMult() {
		return this.taxExemptMult;
	}

	/**
	 * @return the taxExemptNo
	 */
	public String getTaxExemptNo() {
		return this.taxExemptNo;
	}

	/**
	 * @return the taxExemptState
	 */
	public String getTaxExemptState() {
		return this.taxExemptState;
	}

	/**
	 * @return the taxTotal
	 */
	public double getTaxTotal() {
		return this.taxTotal;
	}

	/**
	 * @return the transType
	 */
	public String getTransType() {
		return this.transType;
	}

	/**
	 * @return the typeSale
	 */
	public String getTypeSale() {
		return this.typeSale;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * @param avsCode
	 *            the avsCode to set
	 */
	public void setAvsCode(String avsCode) {
		this.avsCode = avsCode;
	}

	/**
	 * @param billToAddress1
	 *            the billToAddress1 to set
	 */
	public void setBillToAddress1(String billToAddress1) {
		this.billToAddress1 = billToAddress1;
	}

	/**
	 * @param billToAddress2
	 *            the billToAddress2 to set
	 */
	public void setBillToAddress2(String billToAddress2) {
		this.billToAddress2 = billToAddress2;
	}

	/**
	 * @param billToCity
	 *            the billToCity to set
	 */
	public void setBillToCity(String billToCity) {
		this.billToCity = billToCity;
	}

	/**
	 * @param billToCompany
	 *            the billToCompany to set
	 */
	public void setBillToCompany(String billToCompany) {
		this.billToCompany = billToCompany;
	}

	/**
	 * @param billToFName
	 *            the billToFName to set
	 */
	public void setBillToFName(String billToFName) {
		this.billToFName = billToFName;
	}

	/**
	 * @param billToLName
	 *            the billToLName to set
	 */
	public void setBillToLName(String billToLName) {
		this.billToLName = billToLName;
	}

	/**
	 * @param billToPostal
	 *            the billToPostal to set
	 */
	public void setBillToPostal(String billToPostal) {
		this.billToPostal = billToPostal;
	}

	/**
	 * @param billToState
	 *            the billToState to set
	 */
	public void setBillToState(String billToState) {
		this.billToState = billToState;
	}

	/**
	 * @param categoryId
	 *            the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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
	 * @param countyName
	 *            the countyName to set
	 */
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	/**
	 * @param countyTax
	 *            the countyTax to set
	 */
	public void setCountyTax(double countyTax) {
		this.countyTax = countyTax;
	}

	/**
	 * @param countyTrans
	 *            the countyTrans to set
	 */
	public void setCountyTrans(double countyTrans) {
		this.countyTrans = countyTrans;
	}

	/**
	 * @param discount
	 *            the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	/**
	 * @param discountPromoCode
	 *            the discountPromoCode to set
	 */
	public void setDiscountPromoCode(String discountPromoCode) {
		this.discountPromoCode = discountPromoCode;
	}

	/**
	 * @param dtPack
	 *            the dtPack to set
	 */
	public void setDtPack(int dtPack) {
		this.dtPack = dtPack;
	}

	/**
	 * @param edealsRf
	 *            the edealsRf to set
	 */
	public void setEdealsRf(double edealsRf) {
		this.edealsRf = edealsRf;
	}

	/**
	 * @param ipAddress
	 *            the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @param itemSku
	 *            the itemSku to set
	 */
	public void setItemSku(String itemSku) {
		this.itemSku = itemSku;
	}

	/**
	 * @param listPrice
	 *            the listPrice to set
	 */
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	/**
	 * @param loa
	 *            the loa to set
	 */
	public void setLoa(String loa) {
		this.loa = loa;
	}

	/**
	 * @param localTax
	 *            the localTax to set
	 */
	public void setLocalTax(double localTax) {
		this.localTax = localTax;
	}

	/**
	 * @param localTrans
	 *            the localTrans to set
	 */
	public void setLocalTrans(double localTrans) {
		this.localTrans = localTrans;
	}

	/**
	 * @param mfgSku
	 *            the mfgSku to set
	 */
	public void setMfgSku(String mfgSku) {
		this.mfgSku = mfgSku;
	}

	/**
	 * @param mriCustomer
	 *            the mriCustomer to set
	 */
	public void setMriCustomer(String mriCustomer) {
		this.mriCustomer = mriCustomer;
	}

	/**
	 * @param nbPack
	 *            the nbPack to set
	 */
	public void setNbPack(int nbPack) {
		this.nbPack = nbPack;
	}

	/**
	 * @param orderNumber
	 *            the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @param po
	 *            the po to set
	 */
	public void setPo(String po) {
		this.po = po;
	}

	/**
	 * @param qty
	 *            the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

	/**
	 * @param resellerCode
	 *            the resellerCode to set
	 */
	public void setResellerCode(String resellerCode) {
		this.resellerCode = resellerCode;
	}

	/**
	 * @param rfDate
	 *            the rfDate to set
	 */
	public void setRfDate(Date rfDate) {
		this.rfDate = rfDate;
	}

	/**
	 * @param rfreference
	 *            the rfreference to set
	 */
	public void setRfreference(String rfreference) {
		this.rfreference = rfreference;
	}

	/**
	 * @param rfTotal
	 *            the rfTotal to set
	 */
	public void setRfTotal(double rfTotal) {
		this.rfTotal = rfTotal;
	}

	/**
	 * @param salePrice
	 *            the salePrice to set
	 */
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * @param saleRep
	 *            the saleRep to set
	 */
	public void setSaleRep(String saleRep) {
		this.saleRep = saleRep;
	}

	/**
	 * @param screenSize
	 *            the screenSize to set
	 */
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	/**
	 * @param shipCode
	 *            the shipCode to set
	 */
	public void setShipCode(int shipCode) {
		this.shipCode = shipCode;
	}

	/**
	 * @param shippingMethod
	 *            the shippingMethod to set
	 */
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	/**
	 * @param shippingTotal
	 *            the shippingTotal to set
	 */
	public void setShippingTotal(double shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

	/**
	 * @param shipToAddress1
	 *            the shipToAddress1 to set
	 */
	public void setShipToAddress1(String shipToAddress1) {
		this.shipToAddress1 = shipToAddress1;
	}

	/**
	 * @param shipToAddress2
	 *            the shipToAddress2 to set
	 */
	public void setShipToAddress2(String shipToAddress2) {
		this.shipToAddress2 = shipToAddress2;
	}

	/**
	 * @param shipToCity
	 *            the shipToCity to set
	 */
	public void setShipToCity(String shipToCity) {
		this.shipToCity = shipToCity;
	}

	/**
	 * @param shipToCompany
	 *            the shipToCompany to set
	 */
	public void setShipToCompany(String shipToCompany) {
		this.shipToCompany = shipToCompany;
	}

	/**
	 * @param shipToEmail
	 *            the shipToEmail to set
	 */
	public void setShipToEmail(String shipToEmail) {
		this.shipToEmail = shipToEmail;
	}

	/**
	 * @param shipToFName
	 *            the shipToFName to set
	 */
	public void setShipToFName(String shipToFName) {
		this.shipToFName = shipToFName;
	}

	/**
	 * @param shipToLName
	 *            the shipToLName to set
	 */
	public void setShipToLName(String shipToLName) {
		this.shipToLName = shipToLName;
	}

	/**
	 * @param shipToPhone
	 *            the shipToPhone to set
	 */
	public void setShipToPhone(String shipToPhone) {
		this.shipToPhone = shipToPhone;
	}

	/**
	 * @param shipToPostal
	 *            the shipToPostal to set
	 */
	public void setShipToPostal(String shipToPostal) {
		this.shipToPostal = shipToPostal;
	}

	/**
	 * @param shipToState
	 *            the shipToState to set
	 */
	public void setShipToState(String shipToState) {
		this.shipToState = shipToState;
	}

	/**
	 * @param stateTax
	 *            the stateTax to set
	 */
	public void setStateTax(double stateTax) {
		this.stateTax = stateTax;
	}

	/**
	 * @param taxExempt
	 *            the taxExempt to set
	 */
	public void setTaxExempt(String taxExempt) {
		this.taxExempt = taxExempt;
	}

	/**
	 * @param taxExemptExpire
	 *            the taxExemptExpire to set
	 */
	public void setTaxExemptExpire(Date taxExemptExpire) {
		this.taxExemptExpire = taxExemptExpire;
	}

	/**
	 * @param taxExemptMult
	 *            the taxExemptMult to set
	 */
	public void setTaxExemptMult(String taxExemptMult) {
		this.taxExemptMult = taxExemptMult;
	}

	/**
	 * @param taxExemptNo
	 *            the taxExemptNo to set
	 */
	public void setTaxExemptNo(String taxExemptNo) {
		this.taxExemptNo = taxExemptNo;
	}

	/**
	 * @param taxExemptState
	 *            the taxExemptState to set
	 */
	public void setTaxExemptState(String taxExemptState) {
		this.taxExemptState = taxExemptState;
	}

	/**
	 * @param taxTotal
	 *            the taxTotal to set
	 */
	public void setTaxTotal(double taxTotal) {
		this.taxTotal = taxTotal;
	}

	/**
	 * @param transType
	 *            the transType to set
	 */
	public void setTransType(String transType) {
		this.transType = transType;
	}

	/**
	 * @param typeSale
	 *            the typeSale to set
	 */
	public void setTypeSale(String typeSale) {
		this.typeSale = typeSale;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
