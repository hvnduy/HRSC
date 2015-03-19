/*
 * $Id: OpenRptModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class OrderHeaderModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String orderNumber;
	private String orderBarCode;
	private String shopperId;
	private int billingGrpID;
	private String purchOrdNum;
	private String approvalNumber;
	private String program;
	private String dataSource;
	private String shipToName;
	private String shipToTitle;
	private String shipToCompany;
	private String shipToAddress1;
	private String shipToAddress2;
	private String shipToAddress3;
	private String shipToCity;
	private String shipToState;
	private String shipToPostal;
	private String shipToCounty;
	private String shipToCountry;
	private String shipToFax;
	private String shipToPhone;
	private String shipToPhoneExt;
	private String shipToEmail;
	private String shipMethod;
	private String shipTerms;
	private String billToName;
	private String billToCompany;
	private String billToAddress1;
	private String billToAddress2;
	private String billToCity;
	private String billToState;
	private String billToPostal;
	private String billToCounty;
	private String billToCountry;
	private String billToFax;
	private String billToPhone;
	private String billToPhoneExt;
	private String billToEmail;
	private double oadjustSubtotal;
	private double discountTotal;
	private double shippingTotal;
	private double handlingTotal;
	private int taxExempt;
	private String taxExemptNumber;
	private Date taxExemptExpire;
	private double taxTotal;
	private double taxIncluded;
	private double totalTotal;
	private double weight;
	private String paymentTerms;
	private String ccName;
	private String ccNumber;
	private String ccType;
	private int ccExpMonth;
	private int ccExpYear;
	private String trackingNumber;
	private String orderStatus;
	private Date createdDate;
	private Date updatedDate;
	private int taxable;
	private String TaxExemptNum;
	private String TermCode;
	private Date dateRequested;
	private Date datePrinted;
	private Date dateCompleted;
	private Date dateInvoiced;
	private Date dateReturned;
	private int partialShipAllow;
	private int backOrderAllow;
	private int substituteAllow;
	private String shipCode;
	private String addFreightFlag;
	private String shipAcctNum;
	private String dhlAirportCode;
	private double discPerc;
	private double freightTax;
	private double stateTaxPerc;
	private double countyTaxPerc;
	private double countyTranTaxPerc;
	private double cityTaxPerc;
	private double cityTranTaxPerc;
	private double freightTaxPerc;
	private String shipInstruct1;
	private Date dateEdit;
	private int agentIDEnter;
	private String editAgent;
	private int email;
	private int rePrint;
	private String notes;
	private String countyName;
	private double edealRf;
	private String userName;
	private String ipAddress;
	private String accountType;
	private Date rfDate;
	private String directFrom;
	private int discountFlag;
	private double totalList;
	private double totalDisc;
	private String promoEmail;
	private int jde;
	private String userId;
	private String referenceNum;
	private String shipmentId;
	private String listingType;
	private String discountCode;
	private String venueType;
	private String listing;
	private String avsAddress;
	private String avsZip;
	private String avsCountry;
	private String encryptCard;

	private int nbPack;

	private int dtPack;

	private int exported;

	private double subtotal;

	private int byAgent;

	private Date exportedDate;

	private double warrantyTotal;

	private int jdeExported;

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return this.accountType;
	}

	/**
	 * @return the addFreightFlag
	 */
	public String getAddFreightFlag() {
		return this.addFreightFlag;
	}

	/**
	 * @return the agentIDEnter
	 */
	public int getAgentIDEnter() {
		return this.agentIDEnter;
	}

	/**
	 * @return the approvalNumber
	 */
	public String getApprovalNumber() {
		return this.approvalNumber;
	}

	/**
	 * @return the avsAddress
	 */
	public String getAvsAddress() {
		return this.avsAddress;
	}

	/**
	 * @return the avsCountry
	 */
	public String getAvsCountry() {
		return this.avsCountry;
	}

	/**
	 * @return the avsZip
	 */
	public String getAvsZip() {
		return this.avsZip;
	}

	/**
	 * @return the backOrderAllow
	 */
	public int getBackOrderAllow() {
		return this.backOrderAllow;
	}

	/**
	 * @return the billingGrpID
	 */
	public int getBillingGrpID() {
		return this.billingGrpID;
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
	 * @return the billToCountry
	 */
	public String getBillToCountry() {
		return this.billToCountry;
	}

	/**
	 * @return the billToCounty
	 */
	public String getBillToCounty() {
		return this.billToCounty;
	}

	/**
	 * @return the billToEmail
	 */
	public String getBillToEmail() {
		return this.billToEmail;
	}

	/**
	 * @return the billToFax
	 */
	public String getBillToFax() {
		return this.billToFax;
	}

	/**
	 * @return the billToName
	 */
	public String getBillToName() {
		return this.billToName;
	}

	/**
	 * @return the billToPhone
	 */
	public String getBillToPhone() {
		return this.billToPhone;
	}

	/**
	 * @return the billToPhoneExt
	 */
	public String getBillToPhoneExt() {
		return this.billToPhoneExt;
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
	 * @return the byAgent
	 */
	public int getByAgent() {
		return this.byAgent;
	}

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
	 * @return the cityTaxPerc
	 */
	public double getCityTaxPerc() {
		return this.cityTaxPerc;
	}

	/**
	 * @return the cityTranTaxPerc
	 */
	public double getCityTranTaxPerc() {
		return this.cityTranTaxPerc;
	}

	/**
	 * @return the countyName
	 */
	public String getCountyName() {
		return this.countyName;
	}

	/**
	 * @return the countyTaxPerc
	 */
	public double getCountyTaxPerc() {
		return this.countyTaxPerc;
	}

	/**
	 * @return the countyTranTaxPerc
	 */
	public double getCountyTranTaxPerc() {
		return this.countyTranTaxPerc;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return this.createdDate;
	}

	/**
	 * @return the dataSource
	 */
	public String getDataSource() {
		return this.dataSource;
	}

	/**
	 * @return the dateCompleted
	 */
	public Date getDateCompleted() {
		return this.dateCompleted;
	}

	/**
	 * @return the dateEdit
	 */
	public Date getDateEdit() {
		return this.dateEdit;
	}

	/**
	 * @return the dateInvoiced
	 */
	public Date getDateInvoiced() {
		return this.dateInvoiced;
	}

	/**
	 * @return the datePrinted
	 */
	public Date getDatePrinted() {
		return this.datePrinted;
	}

	/**
	 * @return the dateRequested
	 */
	public Date getDateRequested() {
		return this.dateRequested;
	}

	/**
	 * @return the dateReturned
	 */
	public Date getDateReturned() {
		return this.dateReturned;
	}

	/**
	 * @return the dhlAirportCode
	 */
	public String getDhlAirportCode() {
		return this.dhlAirportCode;
	}

	/**
	 * @return the directFrom
	 */
	public String getDirectFrom() {
		return this.directFrom;
	}

	/**
	 * @return the discountCode
	 */
	public String getDiscountCode() {
		return this.discountCode;
	}

	/**
	 * @return the discountFlag
	 */
	public int getDiscountFlag() {
		return this.discountFlag;
	}

	/**
	 * @return the discountTotal
	 */
	public double getDiscountTotal() {
		return this.discountTotal;
	}

	/**
	 * @return the discPerc
	 */
	public double getDiscPerc() {
		return this.discPerc;
	}

	/**
	 * @return the dtPack
	 */
	public int getDtPack() {
		return this.dtPack;
	}

	/**
	 * @return the edealRf
	 */
	public double getEdealRf() {
		return this.edealRf;
	}

	/**
	 * @return the editAgent
	 */
	public String getEditAgent() {
		return this.editAgent;
	}

	/**
	 * @return the email
	 */
	public int getEmail() {
		return this.email;
	}

	/**
	 * @return the encryptCard
	 */
	public String getEncryptCard() {
		return this.encryptCard;
	}

	/**
	 * @return the exported
	 */
	public int getExported() {
		return this.exported;
	}

	/**
	 * @return the exportedDate
	 */
	public Date getExportedDate() {
		return this.exportedDate;
	}

	/**
	 * @return the freightTax
	 */
	public double getFreightTax() {
		return this.freightTax;
	}

	/**
	 * @return the freightTaxPerc
	 */
	public double getFreightTaxPerc() {
		return this.freightTaxPerc;
	}

	/**
	 * @return the handlingTotal
	 */
	public double getHandlingTotal() {
		return this.handlingTotal;
	}

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return this.ipAddress;
	}

	/**
	 * @return the jde
	 */
	public int getJde() {
		return this.jde;
	}

	/**
	 * @return the jdeExported
	 */
	public int getJdeExported() {
		return this.jdeExported;
	}

	/**
	 * @return the listing
	 */
	public String getListing() {
		return this.listing;
	}

	/**
	 * @return the listingType
	 */
	public String getListingType() {
		return this.listingType;
	}

	/**
	 * @return the nbPack
	 */
	public int getNbPack() {
		return this.nbPack;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return this.notes;
	}

	/**
	 * @return the oadjustSubtotal
	 */
	public double getOadjustSubtotal() {
		return this.oadjustSubtotal;
	}

	/**
	 * @return the orderBarCode
	 */
	public String getOrderBarCode() {
		return this.orderBarCode;
	}

	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return this.orderNumber;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return this.orderStatus;
	}

	/**
	 * @return the partialShipAllow
	 */
	public int getPartialShipAllow() {
		return this.partialShipAllow;
	}

	/**
	 * @return the paymentTerms
	 */
	public String getPaymentTerms() {
		return this.paymentTerms;
	}

	/**
	 * @return the program
	 */
	public String getProgram() {
		return this.program;
	}

	/**
	 * @return the promoEmail
	 */
	public String getPromoEmail() {
		return this.promoEmail;
	}

	/**
	 * @return the purchOrdNum
	 */
	public String getPurchOrdNum() {
		return this.purchOrdNum;
	}

	/**
	 * @return the referenceNum
	 */
	public String getReferenceNum() {
		return this.referenceNum;
	}

	/**
	 * @return the rePrint
	 */
	public int getRePrint() {
		return this.rePrint;
	}

	/**
	 * @return the rfDate
	 */
	public Date getRfDate() {
		return this.rfDate;
	}

	/**
	 * @return the shipAcctNum
	 */
	public String getShipAcctNum() {
		return this.shipAcctNum;
	}

	/**
	 * @return the shipCode
	 */
	public String getShipCode() {
		return this.shipCode;
	}

	/**
	 * @return the shipInstruct1
	 */
	public String getShipInstruct1() {
		return this.shipInstruct1;
	}

	/**
	 * @return the shipmentId
	 */
	public String getShipmentId() {
		return this.shipmentId;
	}

	/**
	 * @return the shipMethod
	 */
	public String getShipMethod() {
		return this.shipMethod;
	}

	/**
	 * @return the shippingTotal
	 */
	public double getShippingTotal() {
		return this.shippingTotal;
	}

	/**
	 * @return the shipTerms
	 */
	public String getShipTerms() {
		return this.shipTerms;
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
	 * @return the shipToAddress3
	 */
	public String getShipToAddress3() {
		return this.shipToAddress3;
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
	 * @return the shipToCountry
	 */
	public String getShipToCountry() {
		return this.shipToCountry;
	}

	/**
	 * @return the shipToCounty
	 */
	public String getShipToCounty() {
		return this.shipToCounty;
	}

	/**
	 * @return the shipToEmail
	 */
	public String getShipToEmail() {
		return this.shipToEmail;
	}

	/**
	 * @return the shipToFax
	 */
	public String getShipToFax() {
		return this.shipToFax;
	}

	/**
	 * @return the shipToName
	 */
	public String getShipToName() {
		return this.shipToName;
	}

	/**
	 * @return the shipToPhone
	 */
	public String getShipToPhone() {
		return this.shipToPhone;
	}

	/**
	 * @return the shipToPhoneExt
	 */
	public String getShipToPhoneExt() {
		return this.shipToPhoneExt;
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
	 * @return the shipToTitle
	 */
	public String getShipToTitle() {
		return this.shipToTitle;
	}

	/**
	 * @return the shopperId
	 */
	public String getShopperId() {
		return this.shopperId;
	}

	/**
	 * @return the stateTaxPerc
	 */
	public double getStateTaxPerc() {
		return this.stateTaxPerc;
	}

	/**
	 * @return the substituteAllow
	 */
	public int getSubstituteAllow() {
		return this.substituteAllow;
	}

	/**
	 * @return the subtotal
	 */
	public double getSubtotal() {
		return this.subtotal;
	}

	/**
	 * @return the taxable
	 */
	public int getTaxable() {
		return this.taxable;
	}

	/**
	 * @return the taxExempt
	 */
	public int getTaxExempt() {
		return this.taxExempt;
	}

	/**
	 * @return the taxExemptExpire
	 */
	public Date getTaxExemptExpire() {
		return this.taxExemptExpire;
	}

	/**
	 * @return the taxExemptNum
	 */
	public String getTaxExemptNum() {
		return this.TaxExemptNum;
	}

	/**
	 * @return the taxExemptNumber
	 */
	public String getTaxExemptNumber() {
		return this.taxExemptNumber;
	}

	/**
	 * @return the taxIncluded
	 */
	public double getTaxIncluded() {
		return this.taxIncluded;
	}

	/**
	 * @return the taxTotal
	 */
	public double getTaxTotal() {
		return this.taxTotal;
	}

	/**
	 * @return the termCode
	 */
	public String getTermCode() {
		return this.TermCode;
	}

	/**
	 * @return the totalDisc
	 */
	public double getTotalDisc() {
		return this.totalDisc;
	}

	/**
	 * @return the totalList
	 */
	public double getTotalList() {
		return this.totalList;
	}

	/**
	 * @return the totalTotal
	 */
	public double getTotalTotal() {
		return this.totalTotal;
	}

	/**
	 * @return the trackingNumber
	 */
	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * @return the venueType
	 */
	public String getVenueType() {
		return this.venueType;
	}

	/**
	 * @return the warrantyTotal
	 */
	public double getWarrantyTotal() {
		return this.warrantyTotal;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return this.weight;
	}

	/**
	 * @param accountType
	 *            the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @param addFreightFlag
	 *            the addFreightFlag to set
	 */
	public void setAddFreightFlag(String addFreightFlag) {
		this.addFreightFlag = addFreightFlag;
	}

	/**
	 * @param agentIDEnter
	 *            the agentIDEnter to set
	 */
	public void setAgentIDEnter(int agentIDEnter) {
		this.agentIDEnter = agentIDEnter;
	}

	/**
	 * @param approvalNumber
	 *            the approvalNumber to set
	 */
	public void setApprovalNumber(String approvalNumber) {
		this.approvalNumber = approvalNumber;
	}

	/**
	 * @param avsAddress
	 *            the avsAddress to set
	 */
	public void setAvsAddress(String avsAddress) {
		this.avsAddress = avsAddress;
	}

	/**
	 * @param avsCountry
	 *            the avsCountry to set
	 */
	public void setAvsCountry(String avsCountry) {
		this.avsCountry = avsCountry;
	}

	/**
	 * @param avsZip
	 *            the avsZip to set
	 */
	public void setAvsZip(String avsZip) {
		this.avsZip = avsZip;
	}

	/**
	 * @param backOrderAllow
	 *            the backOrderAllow to set
	 */
	public void setBackOrderAllow(int backOrderAllow) {
		this.backOrderAllow = backOrderAllow;
	}

	/**
	 * @param billingGrpID
	 *            the billingGrpID to set
	 */
	public void setBillingGrpID(int billingGrpID) {
		this.billingGrpID = billingGrpID;
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
	 * @param billToCountry
	 *            the billToCountry to set
	 */
	public void setBillToCountry(String billToCountry) {
		this.billToCountry = billToCountry;
	}

	/**
	 * @param billToCounty
	 *            the billToCounty to set
	 */
	public void setBillToCounty(String billToCounty) {
		this.billToCounty = billToCounty;
	}

	/**
	 * @param billToEmail
	 *            the billToEmail to set
	 */
	public void setBillToEmail(String billToEmail) {
		this.billToEmail = billToEmail;
	}

	/**
	 * @param billToFax
	 *            the billToFax to set
	 */
	public void setBillToFax(String billToFax) {
		this.billToFax = billToFax;
	}

	/**
	 * @param billToName
	 *            the billToName to set
	 */
	public void setBillToName(String billToName) {
		this.billToName = billToName;
	}

	/**
	 * @param billToPhone
	 *            the billToPhone to set
	 */
	public void setBillToPhone(String billToPhone) {
		this.billToPhone = billToPhone;
	}

	/**
	 * @param billToPhoneExt
	 *            the billToPhoneExt to set
	 */
	public void setBillToPhoneExt(String billToPhoneExt) {
		this.billToPhoneExt = billToPhoneExt;
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
	 * @param byAgent
	 *            the byAgent to set
	 */
	public void setByAgent(int byAgent) {
		this.byAgent = byAgent;
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
	 * @param cityTaxPerc
	 *            the cityTaxPerc to set
	 */
	public void setCityTaxPerc(double cityTaxPerc) {
		this.cityTaxPerc = cityTaxPerc;
	}

	/**
	 * @param cityTranTaxPerc
	 *            the cityTranTaxPerc to set
	 */
	public void setCityTranTaxPerc(double cityTranTaxPerc) {
		this.cityTranTaxPerc = cityTranTaxPerc;
	}

	/**
	 * @param countyName
	 *            the countyName to set
	 */
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	/**
	 * @param countyTaxPerc
	 *            the countyTaxPerc to set
	 */
	public void setCountyTaxPerc(double countyTaxPerc) {
		this.countyTaxPerc = countyTaxPerc;
	}

	/**
	 * @param countyTranTaxPerc
	 *            the countyTranTaxPerc to set
	 */
	public void setCountyTranTaxPerc(double countyTranTaxPerc) {
		this.countyTranTaxPerc = countyTranTaxPerc;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @param dataSource
	 *            the dataSource to set
	 */
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * @param dateCompleted
	 *            the dateCompleted to set
	 */
	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	/**
	 * @param dateEdit
	 *            the dateEdit to set
	 */
	public void setDateEdit(Date dateEdit) {
		this.dateEdit = dateEdit;
	}

	/**
	 * @param dateInvoiced
	 *            the dateInvoiced to set
	 */
	public void setDateInvoiced(Date dateInvoiced) {
		this.dateInvoiced = dateInvoiced;
	}

	/**
	 * @param datePrinted
	 *            the datePrinted to set
	 */
	public void setDatePrinted(Date datePrinted) {
		this.datePrinted = datePrinted;
	}

	/**
	 * @param dateRequested
	 *            the dateRequested to set
	 */
	public void setDateRequested(Date dateRequested) {
		this.dateRequested = dateRequested;
	}

	/**
	 * @param dateReturned
	 *            the dateReturned to set
	 */
	public void setDateReturned(Date dateReturned) {
		this.dateReturned = dateReturned;
	}

	/**
	 * @param dhlAirportCode
	 *            the dhlAirportCode to set
	 */
	public void setDhlAirportCode(String dhlAirportCode) {
		this.dhlAirportCode = dhlAirportCode;
	}

	/**
	 * @param directFrom
	 *            the directFrom to set
	 */
	public void setDirectFrom(String directFrom) {
		this.directFrom = directFrom;
	}

	/**
	 * @param discountCode
	 *            the discountCode to set
	 */
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	/**
	 * @param discountFlag
	 *            the discountFlag to set
	 */
	public void setDiscountFlag(int discountFlag) {
		this.discountFlag = discountFlag;
	}

	/**
	 * @param discountTotal
	 *            the discountTotal to set
	 */
	public void setDiscountTotal(double discountTotal) {
		this.discountTotal = discountTotal;
	}

	/**
	 * @param discPerc
	 *            the discPerc to set
	 */
	public void setDiscPerc(double discPerc) {
		this.discPerc = discPerc;
	}

	/**
	 * @param dtPack
	 *            the dtPack to set
	 */
	public void setDtPack(int dtPack) {
		this.dtPack = dtPack;
	}

	/**
	 * @param edealRf
	 *            the edealRf to set
	 */
	public void setEdealRf(double edealRf) {
		this.edealRf = edealRf;
	}

	/**
	 * @param editAgent
	 *            the editAgent to set
	 */
	public void setEditAgent(String editAgent) {
		this.editAgent = editAgent;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(int email) {
		this.email = email;
	}

	/**
	 * @param encryptCard
	 *            the encryptCard to set
	 */
	public void setEncryptCard(String encryptCard) {
		this.encryptCard = encryptCard;
	}

	/**
	 * @param exported
	 *            the exported to set
	 */
	public void setExported(int exported) {
		this.exported = exported;
	}

	/**
	 * @param exportedDate
	 *            the exportedDate to set
	 */
	public void setExportedDate(Date exportedDate) {
		this.exportedDate = exportedDate;
	}

	/**
	 * @param freightTax
	 *            the freightTax to set
	 */
	public void setFreightTax(double freightTax) {
		this.freightTax = freightTax;
	}

	/**
	 * @param freightTaxPerc
	 *            the freightTaxPerc to set
	 */
	public void setFreightTaxPerc(double freightTaxPerc) {
		this.freightTaxPerc = freightTaxPerc;
	}

	/**
	 * @param handlingTotal
	 *            the handlingTotal to set
	 */
	public void setHandlingTotal(double handlingTotal) {
		this.handlingTotal = handlingTotal;
	}

	/**
	 * @param ipAddress
	 *            the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @param jde
	 *            the jde to set
	 */
	public void setJde(int jde) {
		this.jde = jde;
	}

	/**
	 * @param jdeExported
	 *            the jdeExported to set
	 */
	public void setJdeExported(int jdeExported) {
		this.jdeExported = jdeExported;
	}

	/**
	 * @param listing
	 *            the listing to set
	 */
	public void setListing(String listing) {
		this.listing = listing;
	}

	/**
	 * @param listingType
	 *            the listingType to set
	 */
	public void setListingType(String listingType) {
		this.listingType = listingType;
	}

	/**
	 * @param nbPack
	 *            the nbPack to set
	 */
	public void setNbPack(int nbPack) {
		this.nbPack = nbPack;
	}

	/**
	 * @param notes
	 *            the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * @param oadjustSubtotal
	 *            the oadjustSubtotal to set
	 */
	public void setOadjustSubtotal(double oadjustSubtotal) {
		this.oadjustSubtotal = oadjustSubtotal;
	}

	/**
	 * @param orderBarCode
	 *            the orderBarCode to set
	 */
	public void setOrderBarCode(String orderBarCode) {
		this.orderBarCode = orderBarCode;
	}

	/**
	 * @param orderNumber
	 *            the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @param orderStatus
	 *            the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @param partialShipAllow
	 *            the partialShipAllow to set
	 */
	public void setPartialShipAllow(int partialShipAllow) {
		this.partialShipAllow = partialShipAllow;
	}

	/**
	 * @param paymentTerms
	 *            the paymentTerms to set
	 */
	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	/**
	 * @param program
	 *            the program to set
	 */
	public void setProgram(String program) {
		this.program = program;
	}

	/**
	 * @param promoEmail
	 *            the promoEmail to set
	 */
	public void setPromoEmail(String promoEmail) {
		this.promoEmail = promoEmail;
	}

	/**
	 * @param purchOrdNum
	 *            the purchOrdNum to set
	 */
	public void setPurchOrdNum(String purchOrdNum) {
		this.purchOrdNum = purchOrdNum;
	}

	/**
	 * @param referenceNum
	 *            the referenceNum to set
	 */
	public void setReferenceNum(String referenceNum) {
		this.referenceNum = referenceNum;
	}

	/**
	 * @param rePrint
	 *            the rePrint to set
	 */
	public void setRePrint(int rePrint) {
		this.rePrint = rePrint;
	}

	/**
	 * @param rfDate
	 *            the rfDate to set
	 */
	public void setRfDate(Date rfDate) {
		this.rfDate = rfDate;
	}

	/**
	 * @param shipAcctNum
	 *            the shipAcctNum to set
	 */
	public void setShipAcctNum(String shipAcctNum) {
		this.shipAcctNum = shipAcctNum;
	}

	/**
	 * @param shipCode
	 *            the shipCode to set
	 */
	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}

	/**
	 * @param shipInstruct1
	 *            the shipInstruct1 to set
	 */
	public void setShipInstruct1(String shipInstruct1) {
		this.shipInstruct1 = shipInstruct1;
	}

	/**
	 * @param shipmentId
	 *            the shipmentId to set
	 */
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	/**
	 * @param shipMethod
	 *            the shipMethod to set
	 */
	public void setShipMethod(String shipMethod) {
		this.shipMethod = shipMethod;
	}

	/**
	 * @param shippingTotal
	 *            the shippingTotal to set
	 */
	public void setShippingTotal(double shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

	/**
	 * @param shipTerms
	 *            the shipTerms to set
	 */
	public void setShipTerms(String shipTerms) {
		this.shipTerms = shipTerms;
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
	 * @param shipToAddress3
	 *            the shipToAddress3 to set
	 */
	public void setShipToAddress3(String shipToAddress3) {
		this.shipToAddress3 = shipToAddress3;
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
	 * @param shipToCountry
	 *            the shipToCountry to set
	 */
	public void setShipToCountry(String shipToCountry) {
		this.shipToCountry = shipToCountry;
	}

	/**
	 * @param shipToCounty
	 *            the shipToCounty to set
	 */
	public void setShipToCounty(String shipToCounty) {
		this.shipToCounty = shipToCounty;
	}

	/**
	 * @param shipToEmail
	 *            the shipToEmail to set
	 */
	public void setShipToEmail(String shipToEmail) {
		this.shipToEmail = shipToEmail;
	}

	/**
	 * @param shipToFax
	 *            the shipToFax to set
	 */
	public void setShipToFax(String shipToFax) {
		this.shipToFax = shipToFax;
	}

	/**
	 * @param shipToName
	 *            the shipToName to set
	 */
	public void setShipToName(String shipToName) {
		this.shipToName = shipToName;
	}

	/**
	 * @param shipToPhone
	 *            the shipToPhone to set
	 */
	public void setShipToPhone(String shipToPhone) {
		this.shipToPhone = shipToPhone;
	}

	/**
	 * @param shipToPhoneExt
	 *            the shipToPhoneExt to set
	 */
	public void setShipToPhoneExt(String shipToPhoneExt) {
		this.shipToPhoneExt = shipToPhoneExt;
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
	 * @param shipToTitle
	 *            the shipToTitle to set
	 */
	public void setShipToTitle(String shipToTitle) {
		this.shipToTitle = shipToTitle;
	}

	/**
	 * @param shopperId
	 *            the shopperId to set
	 */
	public void setShopperId(String shopperId) {
		this.shopperId = shopperId;
	}

	/**
	 * @param stateTaxPerc
	 *            the stateTaxPerc to set
	 */
	public void setStateTaxPerc(double stateTaxPerc) {
		this.stateTaxPerc = stateTaxPerc;
	}

	/**
	 * @param substituteAllow
	 *            the substituteAllow to set
	 */
	public void setSubstituteAllow(int substituteAllow) {
		this.substituteAllow = substituteAllow;
	}

	/**
	 * @param subtotal
	 *            the subtotal to set
	 */
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * @param taxable
	 *            the taxable to set
	 */
	public void setTaxable(int taxable) {
		this.taxable = taxable;
	}

	/**
	 * @param taxExempt
	 *            the taxExempt to set
	 */
	public void setTaxExempt(int taxExempt) {
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
	 * @param taxExemptNum
	 *            the taxExemptNum to set
	 */
	public void setTaxExemptNum(String taxExemptNum) {
		this.TaxExemptNum = taxExemptNum;
	}

	/**
	 * @param taxExemptNumber
	 *            the taxExemptNumber to set
	 */
	public void setTaxExemptNumber(String taxExemptNumber) {
		this.taxExemptNumber = taxExemptNumber;
	}

	/**
	 * @param taxIncluded
	 *            the taxIncluded to set
	 */
	public void setTaxIncluded(double taxIncluded) {
		this.taxIncluded = taxIncluded;
	}

	/**
	 * @param taxTotal
	 *            the taxTotal to set
	 */
	public void setTaxTotal(double taxTotal) {
		this.taxTotal = taxTotal;
	}

	/**
	 * @param termCode
	 *            the termCode to set
	 */
	public void setTermCode(String termCode) {
		this.TermCode = termCode;
	}

	/**
	 * @param totalDisc
	 *            the totalDisc to set
	 */
	public void setTotalDisc(double totalDisc) {
		this.totalDisc = totalDisc;
	}

	/**
	 * @param totalList
	 *            the totalList to set
	 */
	public void setTotalList(double totalList) {
		this.totalList = totalList;
	}

	/**
	 * @param totalTotal
	 *            the totalTotal to set
	 */
	public void setTotalTotal(double totalTotal) {
		this.totalTotal = totalTotal;
	}
	/**
	 * @param trackingNumber
	 *            the trackingNumber to set
	 */
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	/**
	 * @param updatedDate
	 *            the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @param venueType
	 *            the venueType to set
	 */
	public void setVenueType(String venueType) {
		this.venueType = venueType;
	}
	/**
	 * @param warrantyTotal
	 *            the warrantyTotal to set
	 */
	public void setWarrantyTotal(double warrantyTotal) {
		this.warrantyTotal = warrantyTotal;
	}
	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
