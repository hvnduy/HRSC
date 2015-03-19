/*
 * $Id: CreditFormModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class CreditFormModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String account;
	private double amount;
	private String approval;
	private double cntTransUTax;
	private double cntUTax;
	private String comment;
	private String contactName;
	private int credit;
	private String creditCard;
	private Date creditDate;
	private String creditNumber;
	private double ctyTransUTax;
	private double ctyUTax;
	private Date dateRequest;
	private String encryptCard;
	private double eqAmt;
	private String expired;
	private String exported;
	private double frAmt;
	private int indexRequest;
	private String itemSku;
	private int jde;
	private String manager;
	private String modifiedBy;
	private Date modifiedDate;
	private String orderNumber;
	private double originalAmt;
	private int qty;
	private String reason;
	private String requestBy;
	private double reTax;
	private double rf;
	private String rmaNumber;
	private Date shipDate;
	private String state;
	private double stateUTax;
	private double tax;
	private String teamLead;
	private Date updatedDate;
	private String zip;
	/**
	 * @return the account
	 */
	public String getAccount() {
		return this.account;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return this.amount;
	}
	/**
	 * @return the approval
	 */
	public String getApproval() {
		return this.approval;
	}
	/**
	 * @return the cntTransUTax
	 */
	public double getCntTransUTax() {
		return this.cntTransUTax;
	}
	/**
	 * @return the cntUTax
	 */
	public double getCntUTax() {
		return this.cntUTax;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return this.comment;
	}
	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return this.contactName;
	}
	/**
	 * @return the credit
	 */
	public int getCredit() {
		return this.credit;
	}
	/**
	 * @return the creditCard
	 */
	public String getCreditCard() {
		return this.creditCard;
	}
	/**
	 * @return the creditDate
	 */
	public Date getCreditDate() {
		return this.creditDate;
	}
	/**
	 * @return the creditNumber
	 */
	public String getCreditNumber() {
		return this.creditNumber;
	}
	/**
	 * @return the ctyTransUTax
	 */
	public double getCtyTransUTax() {
		return this.ctyTransUTax;
	}
	/**
	 * @return the ctyUTax
	 */
	public double getCtyUTax() {
		return this.ctyUTax;
	}
	/**
	 * @return the dateRequest
	 */
	public Date getDateRequest() {
		return this.dateRequest;
	}
	/**
	 * @return the encryptCard
	 */
	public String getEncryptCard() {
		return this.encryptCard;
	}
	/**
	 * @return the eqAmt
	 */
	public double getEqAmt() {
		return this.eqAmt;
	}
	/**
	 * @return the expired
	 */
	public String getExpired() {
		return this.expired;
	}
	/**
	 * @return the exported
	 */
	public String getExported() {
		return this.exported;
	}
	/**
	 * @return the frAmt
	 */
	public double getFrAmt() {
		return this.frAmt;
	}
	/**
	 * @return the indexRequest
	 */
	public int getIndexRequest() {
		return this.indexRequest;
	}
	/**
	 * @return the itemSku
	 */
	public String getItemSku() {
		return this.itemSku;
	}
	/**
	 * @return the jde
	 */
	public int getJde() {
		return this.jde;
	}
	/**
	 * @return the manager
	 */
	public String getManager() {
		return this.manager;
	}
	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy() {
		return this.modifiedBy;
	}
	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return this.modifiedDate;
	}
	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return this.orderNumber;
	}
	/**
	 * @return the originalAmt
	 */
	public double getOriginalAmt() {
		return this.originalAmt;
	}
	/**
	 * @return the qty
	 */
	public int getQty() {
		return this.qty;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return this.reason;
	}
	/**
	 * @return the requestBy
	 */
	public String getRequestBy() {
		return this.requestBy;
	}
	/**
	 * @return the reTax
	 */
	public double getReTax() {
		return this.reTax;
	}
	/**
	 * @return the rf
	 */
	public double getRf() {
		return this.rf;
	}
	/**
	 * @return the rmaNumber
	 */
	public String getRmaNumber() {
		return this.rmaNumber;
	}
	/**
	 * @return the shipDate
	 */
	public Date getShipDate() {
		return this.shipDate;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return this.state;
	}
	/**
	 * @return the stateUTax
	 */
	public double getStateUTax() {
		return this.stateUTax;
	}
	/**
	 * @return the tax
	 */
	public double getTax() {
		return this.tax;
	}
	/**
	 * @return the teamLead
	 */
	public String getTeamLead() {
		return this.teamLead;
	}
	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return this.updatedDate;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return this.zip;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @param approval the approval to set
	 */
	public void setApproval(String approval) {
		this.approval = approval;
	}
	/**
	 * @param cntTransUTax the cntTransUTax to set
	 */
	public void setCntTransUTax(double cntTransUTax) {
		this.cntTransUTax = cntTransUTax;
	}
	/**
	 * @param cntUTax the cntUTax to set
	 */
	public void setCntUTax(double cntUTax) {
		this.cntUTax = cntUTax;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	/**
	 * @param credit the credit to set
	 */
	public void setCredit(int credit) {
		this.credit = credit;
	}
	/**
	 * @param creditCard the creditCard to set
	 */
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	/**
	 * @param creditDate the creditDate to set
	 */
	public void setCreditDate(Date creditDate) {
		this.creditDate = creditDate;
	}
	/**
	 * @param creditNumber the creditNumber to set
	 */
	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}
	/**
	 * @param ctyTransUTax the ctyTransUTax to set
	 */
	public void setCtyTransUTax(double ctyTransUTax) {
		this.ctyTransUTax = ctyTransUTax;
	}
	/**
	 * @param ctyUTax the ctyUTax to set
	 */
	public void setCtyUTax(double ctyUTax) {
		this.ctyUTax = ctyUTax;
	}
	/**
	 * @param dateRequest the dateRequest to set
	 */
	public void setDateRequest(Date dateRequest) {
		this.dateRequest = dateRequest;
	}
	/**
	 * @param encryptCard the encryptCard to set
	 */
	public void setEncryptCard(String encryptCard) {
		this.encryptCard = encryptCard;
	}
	/**
	 * @param eqAmt the eqAmt to set
	 */
	public void setEqAmt(double eqAmt) {
		this.eqAmt = eqAmt;
	}
	/**
	 * @param expired the expired to set
	 */
	public void setExpired(String expired) {
		this.expired = expired;
	}
	/**
	 * @param exported the exported to set
	 */
	public void setExported(String exported) {
		this.exported = exported;
	}
	/**
	 * @param frAmt the frAmt to set
	 */
	public void setFrAmt(double frAmt) {
		this.frAmt = frAmt;
	}
	/**
	 * @param indexRequest the indexRequest to set
	 */
	public void setIndexRequest(int indexRequest) {
		this.indexRequest = indexRequest;
	}
	/**
	 * @param itemSku the itemSku to set
	 */
	public void setItemSku(String itemSku) {
		this.itemSku = itemSku;
	}
	/**
	 * @param jde the jde to set
	 */
	public void setJde(int jde) {
		this.jde = jde;
	}
	/**
	 * @param manager the manager to set
	 */
	public void setManager(String manager) {
		this.manager = manager;
	}
	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @param originalAmt the originalAmt to set
	 */
	public void setOriginalAmt(double originalAmt) {
		this.originalAmt = originalAmt;
	}
	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * @param requestBy the requestBy to set
	 */
	public void setRequestBy(String requestBy) {
		this.requestBy = requestBy;
	}
	/**
	 * @param reTax the reTax to set
	 */
	public void setReTax(double reTax) {
		this.reTax = reTax;
	}
	/**
	 * @param rf the rf to set
	 */
	public void setRf(double rf) {
		this.rf = rf;
	}
	/**
	 * @param rmaNumber the rmaNumber to set
	 */
	public void setRmaNumber(String rmaNumber) {
		this.rmaNumber = rmaNumber;
	}
	/**
	 * @param shipDate the shipDate to set
	 */
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @param stateUTax the stateUTax to set
	 */
	public void setStateUTax(double stateUTax) {
		this.stateUTax = stateUTax;
	}
	/**
	 * @param tax the tax to set
	 */
	public void setTax(double tax) {
		this.tax = tax;
	}
	/**
	 * @param teamLead the teamLead to set
	 */
	public void setTeamLead(String teamLead) {
		this.teamLead = teamLead;
	}
	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

}
