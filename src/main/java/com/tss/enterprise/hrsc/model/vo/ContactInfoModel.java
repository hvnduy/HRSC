/*
 * $Id: ContactInfoModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class ContactInfoModel implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * TERM_CODE.
	 */
	public static final String TERM_CODE = "TERM_CODE";

	private String shopperId;

	private int shopperNumber;

	private int linkNumber;

	private int billingGrpID;

	private String contactType;

	private String program;

	private String contactStatus;

	private String creditRating;

	private String termCode;

	private double specialtyDiscount;

	private int latPerDiscount;

	private int latAmtDiscount;

	private Date latExpDate;

	private int insPerDiscount;

	private int insAmtDiscount;

	private Date insExpDate;

	private int optPerDiscount;

	private int optAmtDiscount;

	private Date optExpDate;

	private int dimPerDiscount;

	private int dimAmtDiscount;

	private Date dimExpDate;

	private int monPerDiscount;

	private int monAmtDiscount;

	private Date monExpDate;

	private int serPerDiscount;

	private int serAmtDiscount;

	private Date serExpDate;

	private int worPerDiscount;

	private int worAmtDiscount;

	private Date worExpDate;

	private int taxExempt;

	private String taxExemptNumber;

	private Date taxExemptExpire;

	private int promoEmail;

	private int heardAboutSiteFrom;

	private String primUse;

	private int agentId;

	private Date agentIdExp;

	private String shipToFname;

	private String shipToMname;

	private String shipToLname;

	private String shipToFullName;

	private String shipToSalutation;

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

	private String billToFName;

	private String billToMName;

	private String billToLName;

	private String billToSalutation;

	private String billToTitle;

	private String billToCompany;

	private String billToAddress1;

	private String billToAddress2;

	private String billToAddress3;

	private String billToCity;

	private String billToState;

	private String billToPostal;

	private String billToCounty;

	private String billToCountry;

	private String billToFax;

	private String billToPhone;

	private String billToPhoneExt;

	private String billToEmail;

	private String loginID;

	private String password;

	private String hint;

	private String answer;

	private String ccName;

	private String ccNumber;

	private String ccType;

	private int ccExpMonth;

	private int ccExpYear;

	private Date createdDate;

	private Date updatedDate;

	private Date calledDate;

	private Date recallDate;

	private String fmID;

	private String accountType;

	private String loa;

	private double creditLine;

	private String creditExp;

	private double creditAvail;

	private String creditComment;

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return this.accountType;
	}

	/**
	 * @return the agentId
	 */
	public int getAgentId() {
		return this.agentId;
	}

	/**
	 * @return the agentIdExp
	 */
	public Date getAgentIdExp() {
		return this.agentIdExp;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return this.answer;
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
	 * @return the billToAddress3
	 */
	public String getBillToAddress3() {
		return this.billToAddress3;
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
	 * @return the billToFname
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
	 * @return the billToMName
	 */
	public String getBillToMName() {
		return this.billToMName;
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
	 * @return the billToSalutation
	 */
	public String getBillToSalutation() {
		return this.billToSalutation;
	}

	/**
	 * @return the billToState
	 */
	public String getBillToState() {
		return this.billToState;
	}

	/**
	 * @return the billToTitle
	 */
	public String getBillToTitle() {
		return this.billToTitle;
	}

	/**
	 * @return the calledDate
	 */
	public Date getCalledDate() {
		return this.calledDate;
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
	 * @return the contactStatus
	 */
	public String getContactStatus() {
		return this.contactStatus;
	}

	/**
	 * @return the contactType
	 */
	public String getContactType() {
		return this.contactType;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return this.createdDate;
	}

	/**
	 * @return the creditAvail
	 */
	public double getCreditAvail() {
		return this.creditAvail;
	}

	/**
	 * @return the creditComment
	 */
	public String getCreditComment() {
		return this.creditComment;
	}

	/**
	 * @return the creditExp
	 */
	public String getCreditExp() {
		return this.creditExp;
	}

	/**
	 * @return the creditLine
	 */
	public double getCreditLine() {
		return this.creditLine;
	}

	/**
	 * @return the creditRating
	 */
	public String getCreditRating() {
		return this.creditRating;
	}

	/**
	 * @return the dimAmtDiscount
	 */
	public int getDimAmtDiscount() {
		return this.dimAmtDiscount;
	}

	/**
	 * @return the dimExpDate
	 */
	public Date getDimExpDate() {
		return this.dimExpDate;
	}

	/**
	 * @return the dimPerDiscount
	 */
	public int getDimPerDiscount() {
		return this.dimPerDiscount;
	}

	/**
	 * @return the fmID
	 */
	public String getFmID() {
		return this.fmID;
	}

	/**
	 * @return the heardAboutSiteFrom
	 */
	public int getHeardAboutSiteFrom() {
		return this.heardAboutSiteFrom;
	}

	/**
	 * @return the hint
	 */
	public String getHint() {
		return this.hint;
	}

	/**
	 * @return the insAmtDiscount
	 */
	public int getInsAmtDiscount() {
		return this.insAmtDiscount;
	}

	/**
	 * @return the insExpDate
	 */
	public Date getInsExpDate() {
		return this.insExpDate;
	}

	/**
	 * @return the insPerDiscount
	 */
	public int getInsPerDiscount() {
		return this.insPerDiscount;
	}

	/**
	 * @return the latAmtDiscount
	 */
	public int getLatAmtDiscount() {
		return this.latAmtDiscount;
	}

	/**
	 * @return the latExpDate
	 */
	public Date getLatExpDate() {
		return this.latExpDate;
	}

	/**
	 * @return the latPerDiscount
	 */
	public int getLatPerDiscount() {
		return this.latPerDiscount;
	}

	/**
	 * @return the linkNumber
	 */
	public int getLinkNumber() {
		return this.linkNumber;
	}

	/**
	 * @return the loa
	 */
	public String getLoa() {
		return this.loa;
	}

	/**
	 * @return the loginID
	 */
	public String getLoginID() {
		return this.loginID;
	}

	/**
	 * @return the monAmtDiscount
	 */
	public int getMonAmtDiscount() {
		return this.monAmtDiscount;
	}

	/**
	 * @return the monExpDate
	 */
	public Date getMonExpDate() {
		return this.monExpDate;
	}

	/**
	 * @return the monPerDiscount
	 */
	public int getMonPerDiscount() {
		return this.monPerDiscount;
	}

	/**
	 * @return the optAmtDiscount
	 */
	public int getOptAmtDiscount() {
		return this.optAmtDiscount;
	}

	/**
	 * @return the optExpDate
	 */
	public Date getOptExpDate() {
		return this.optExpDate;
	}

	/**
	 * @return the optPerDiscount
	 */
	public int getOptPerDiscount() {
		return this.optPerDiscount;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @return the primUse
	 */
	public String getPrimUse() {
		return this.primUse;
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
	public int getPromoEmail() {
		return this.promoEmail;
	}

	/**
	 * @return the recallDate
	 */
	public Date getRecallDate() {
		return this.recallDate;
	}

	/**
	 * @return the serAmtDiscount
	 */
	public int getSerAmtDiscount() {
		return this.serAmtDiscount;
	}

	/**
	 * @return the serExpDate
	 */
	public Date getSerExpDate() {
		return this.serExpDate;
	}

	/**
	 * @return the serPerDiscount
	 */
	public int getSerPerDiscount() {
		return this.serPerDiscount;
	}

	/**
	 * @return the shipMethod
	 */
	public String getShipMethod() {
		return this.shipMethod;
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
	 * @return the shipToFname
	 */
	public String getShipToFname() {
		return this.shipToFname;
	}

	/**
	 * @return the shipToFullName
	 */
	public String getShipToFullName() {
		return this.shipToFullName;
	}

	/**
	 * @return the shipToLname
	 */
	public String getShipToLname() {
		return this.shipToLname;
	}

	/**
	 * @return the shipToMname
	 */
	public String getShipToMname() {
		return this.shipToMname;
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
	 * @return the shipToSalutation
	 */
	public String getShipToSalutation() {
		return this.shipToSalutation;
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
	 * @return the shopperNumber
	 */
	public int getShopperNumber() {
		return this.shopperNumber;
	}

	/**
	 * @return the specialtyDiscount
	 */
	public double getSpecialtyDiscount() {
		return this.specialtyDiscount;
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
	 * @return the taxExemptNumber
	 */
	public String getTaxExemptNumber() {
		return this.taxExemptNumber;
	}

	/**
	 * @return the termCode
	 */
	public String getTermCode() {
		return this.termCode;
	}

	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	/**
	 * @return the worAmtDiscount
	 */
	public int getWorAmtDiscount() {
		return this.worAmtDiscount;
	}

	/**
	 * @return the worExpDate
	 */
	public Date getWorExpDate() {
		return this.worExpDate;
	}

	/**
	 * @return the worPerDiscount
	 */
	public int getWorPerDiscount() {
		return this.worPerDiscount;
	}

	/**
	 * @param accountType
	 *            the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * @param agentId
	 *            the agentId to set
	 */
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	/**
	 * @param agentIdExp
	 *            the agentIdExp to set
	 */
	public void setAgentIdExp(Date agentIdExp) {
		this.agentIdExp = agentIdExp;
	}
	/**
	 * @param answer
	 *            the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
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
	 * @param billToAddress3
	 *            the billToAddress3 to set
	 */
	public void setBillToAddress3(String billToAddress3) {
		this.billToAddress3 = billToAddress3;
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
	 * @param billToMName
	 *            the billToMName to set
	 */
	public void setBillToMName(String billToMName) {
		this.billToMName = billToMName;
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
	 * @param billToSalutation
	 *            the billToSalutation to set
	 */
	public void setBillToSalutation(String billToSalutation) {
		this.billToSalutation = billToSalutation;
	}
	/**
	 * @param billToState
	 *            the billToState to set
	 */
	public void setBillToState(String billToState) {
		this.billToState = billToState;
	}
	/**
	 * @param billToTitle
	 *            the billToTitle to set
	 */
	public void setBillToTitle(String billToTitle) {
		this.billToTitle = billToTitle;
	}
	/**
	 * @param calledDate
	 *            the calledDate to set
	 */
	public void setCalledDate(Date calledDate) {
		this.calledDate = calledDate;
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
	 * @param contactStatus
	 *            the contactStatus to set
	 */
	public void setContactStatus(String contactStatus) {
		this.contactStatus = contactStatus;
	}
	/**
	 * @param contactType
	 *            the contactType to set
	 */
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @param creditAvail
	 *            the creditAvail to set
	 */
	public void setCreditAvail(double creditAvail) {
		this.creditAvail = creditAvail;
	}
	/**
	 * @param creditComment
	 *            the creditComment to set
	 */
	public void setCreditComment(String creditComment) {
		this.creditComment = creditComment;
	}
	/**
	 * @param creditExp
	 *            the creditExp to set
	 */
	public void setCreditExp(String creditExp) {
		this.creditExp = creditExp;
	}
	/**
	 * @param creditLine
	 *            the creditLine to set
	 */
	public void setCreditLine(double creditLine) {
		this.creditLine = creditLine;
	}
	/**
	 * @param creditRating
	 *            the creditRating to set
	 */
	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}
	/**
	 * @param dimAmtDiscount
	 *            the dimAmtDiscount to set
	 */
	public void setDimAmtDiscount(int dimAmtDiscount) {
		this.dimAmtDiscount = dimAmtDiscount;
	}
	/**
	 * @param dimExpDate
	 *            the dimExpDate to set
	 */
	public void setDimExpDate(Date dimExpDate) {
		this.dimExpDate = dimExpDate;
	}
	/**
	 * @param dimPerDiscount
	 *            the dimPerDiscount to set
	 */
	public void setDimPerDiscount(int dimPerDiscount) {
		this.dimPerDiscount = dimPerDiscount;
	}
	/**
	 * @param fmID
	 *            the fmID to set
	 */
	public void setFmID(String fmID) {
		this.fmID = fmID;
	}
	/**
	 * @param heardAboutSiteFrom
	 *            the heardAboutSiteFrom to set
	 */
	public void setHeardAboutSiteFrom(int heardAboutSiteFrom) {
		this.heardAboutSiteFrom = heardAboutSiteFrom;
	}
	/**
	 * @param hint
	 *            the hint to set
	 */
	public void setHint(String hint) {
		this.hint = hint;
	}
	/**
	 * @param insAmtDiscount
	 *            the insAmtDiscount to set
	 */
	public void setInsAmtDiscount(int insAmtDiscount) {
		this.insAmtDiscount = insAmtDiscount;
	}
	/**
	 * @param insExpDate
	 *            the insExpDate to set
	 */
	public void setInsExpDate(Date insExpDate) {
		this.insExpDate = insExpDate;
	}
	/**
	 * @param insPerDiscount
	 *            the insPerDiscount to set
	 */
	public void setInsPerDiscount(int insPerDiscount) {
		this.insPerDiscount = insPerDiscount;
	}
	/**
	 * @param latAmtDiscount
	 *            the latAmtDiscount to set
	 */
	public void setLatAmtDiscount(int latAmtDiscount) {
		this.latAmtDiscount = latAmtDiscount;
	}
	/**
	 * @param latExpDate
	 *            the latExpDate to set
	 */
	public void setLatExpDate(Date latExpDate) {
		this.latExpDate = latExpDate;
	}
	/**
	 * @param latPerDiscount
	 *            the latPerDiscount to set
	 */
	public void setLatPerDiscount(int latPerDiscount) {
		this.latPerDiscount = latPerDiscount;
	}
	/**
	 * @param linkNumber
	 *            the linkNumber to set
	 */
	public void setLinkNumber(int linkNumber) {
		this.linkNumber = linkNumber;
	}
	/**
	 * @param loa
	 *            the loa to set
	 */
	public void setLoa(String loa) {
		this.loa = loa;
	}
	/**
	 * @param loginID
	 *            the loginID to set
	 */
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	/**
	 * @param monAmtDiscount
	 *            the monAmtDiscount to set
	 */
	public void setMonAmtDiscount(int monAmtDiscount) {
		this.monAmtDiscount = monAmtDiscount;
	}
	/**
	 * @param monExpDate
	 *            the monExpDate to set
	 */
	public void setMonExpDate(Date monExpDate) {
		this.monExpDate = monExpDate;
	}
	/**
	 * @param monPerDiscount
	 *            the monPerDiscount to set
	 */
	public void setMonPerDiscount(int monPerDiscount) {
		this.monPerDiscount = monPerDiscount;
	}
	/**
	 * @param optAmtDiscount
	 *            the optAmtDiscount to set
	 */
	public void setOptAmtDiscount(int optAmtDiscount) {
		this.optAmtDiscount = optAmtDiscount;
	}
	/**
	 * @param optExpDate
	 *            the optExpDate to set
	 */
	public void setOptExpDate(Date optExpDate) {
		this.optExpDate = optExpDate;
	}
	/**
	 * @param optPerDiscount
	 *            the optPerDiscount to set
	 */
	public void setOptPerDiscount(int optPerDiscount) {
		this.optPerDiscount = optPerDiscount;
	}
	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param primUse
	 *            the primUse to set
	 */
	public void setPrimUse(String primUse) {
		this.primUse = primUse;
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
	public void setPromoEmail(int promoEmail) {
		this.promoEmail = promoEmail;
	}
	/**
	 * @param recallDate
	 *            the recallDate to set
	 */
	public void setRecallDate(Date recallDate) {
		this.recallDate = recallDate;
	}
	/**
	 * @param serAmtDiscount
	 *            the serAmtDiscount to set
	 */
	public void setSerAmtDiscount(int serAmtDiscount) {
		this.serAmtDiscount = serAmtDiscount;
	}
	/**
	 * @param serExpDate
	 *            the serExpDate to set
	 */
	public void setSerExpDate(Date serExpDate) {
		this.serExpDate = serExpDate;
	}
	/**
	 * @param serPerDiscount
	 *            the serPerDiscount to set
	 */
	public void setSerPerDiscount(int serPerDiscount) {
		this.serPerDiscount = serPerDiscount;
	}
	/**
	 * @param shipMethod
	 *            the shipMethod to set
	 */
	public void setShipMethod(String shipMethod) {
		this.shipMethod = shipMethod;
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
	 * @param shipToFname
	 *            the shipToFname to set
	 */
	public void setShipToFname(String shipToFname) {
		this.shipToFname = shipToFname;
	}
	/**
	 * @param shipToFullName
	 *            the shipToFullName to set
	 */
	public void setShipToFullName(String shipToFullName) {
		this.shipToFullName = shipToFullName;
	}
	/**
	 * @param shipToLname
	 *            the shipToLname to set
	 */
	public void setShipToLname(String shipToLname) {
		this.shipToLname = shipToLname;
	}
	/**
	 * @param shipToMname
	 *            the shipToMname to set
	 */
	public void setShipToMname(String shipToMname) {
		this.shipToMname = shipToMname;
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
	 * @param shipToSalutation
	 *            the shipToSalutation to set
	 */
	public void setShipToSalutation(String shipToSalutation) {
		this.shipToSalutation = shipToSalutation;
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
	 * @param shopperNumber
	 *            the shopperNumber to set
	 */
	public void setShopperNumber(int shopperNumber) {
		this.shopperNumber = shopperNumber;
	}
	/**
	 * @param specialtyDiscount
	 *            the specialtyDiscount to set
	 */
	public void setSpecialtyDiscount(double specialtyDiscount) {
		this.specialtyDiscount = specialtyDiscount;
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
	 * @param taxExemptNumber
	 *            the taxExemptNumber to set
	 */
	public void setTaxExemptNumber(String taxExemptNumber) {
		this.taxExemptNumber = taxExemptNumber;
	}
	/**
	 * @param termCode
	 *            the termCode to set
	 */
	public void setTermCode(String termCode) {
		this.termCode = termCode;
	}
	/**
	 * @param updatedDate
	 *            the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	/**
	 * @param worAmtDiscount
	 *            the worAmtDiscount to set
	 */
	public void setWorAmtDiscount(int worAmtDiscount) {
		this.worAmtDiscount = worAmtDiscount;
	}
	/**
	 * @param worExpDate
	 *            the worExpDate to set
	 */
	public void setWorExpDate(Date worExpDate) {
		this.worExpDate = worExpDate;
	}
	/**
	 * @param worPerDiscount
	 *            the worPerDiscount to set
	 */
	public void setWorPerDiscount(int worPerDiscount) {
		this.worPerDiscount = worPerDiscount;
	}
}
