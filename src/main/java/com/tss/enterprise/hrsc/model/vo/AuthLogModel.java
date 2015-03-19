/*
 * $Id: AuthLogModel.java,v 1 2015/01/13 13:58:00 Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.model.vo;

import java.io.Serializable;

/**
 * The order header contains header information.
 * 
 * @author khoapkl
 */
public class AuthLogModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int authID;
	private String paymentAuthCode;
	private String paymentRequest;
	private int orderId;
	private String paymentResponse;
	private String popAuthCode;
	private String popActionCode;
	private String popAvsCode;
	private String popCustomerId;
	private String popErrorCode;

	private String popMerchantId;

	private String popOrderId;

	private String popOrderValidTil;

	private String popPayload;

	private String popPrice;

	private String popProductDescr;

	private String popRefCode;

	private String popSaleDate;

	private String popSign;

	private String popStatus;

	private String popTxnId;

	private String popErrorMessage;

	/**
	 * @return the authID
	 */
	public int getAuthID() {
		return this.authID;
	}

	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return this.orderId;
	}

	/**
	 * @return the paymentAuthCode
	 */
	public String getPaymentAuthCode() {
		return this.paymentAuthCode;
	}

	/**
	 * @return the paymentRequest
	 */
	public String getPaymentRequest() {
		return this.paymentRequest;
	}

	/**
	 * @return the paymentResponse
	 */
	public String getPaymentResponse() {
		return this.paymentResponse;
	}

	/**
	 * @return the popActionCode
	 */
	public String getPopActionCode() {
		return this.popActionCode;
	}

	/**
	 * @return the popAuthCode
	 */
	public String getPopAuthCode() {
		return this.popAuthCode;
	}

	/**
	 * @return the popAvsCode
	 */
	public String getPopAvsCode() {
		return this.popAvsCode;
	}

	/**
	 * @return the popCustomerId
	 */
	public String getPopCustomerId() {
		return this.popCustomerId;
	}

	/**
	 * @return the popErrorCode
	 */
	public String getPopErrorCode() {
		return this.popErrorCode;
	}

	/**
	 * @return the popErrorMessage
	 */
	public String getPopErrorMessage() {
		return this.popErrorMessage;
	}

	/**
	 * @return the popMerchantId
	 */
	public String getPopMerchantId() {
		return this.popMerchantId;
	}

	/**
	 * @return the popOrderId
	 */
	public String getPopOrderId() {
		return this.popOrderId;
	}

	/**
	 * @return the popOrderValidTil
	 */
	public String getPopOrderValidTil() {
		return this.popOrderValidTil;
	}

	/**
	 * @return the popPayload
	 */
	public String getPopPayload() {
		return this.popPayload;
	}

	/**
	 * @return the popPrice
	 */
	public String getPopPrice() {
		return this.popPrice;
	}

	/**
	 * @return the popProductDescr
	 */
	public String getPopProductDescr() {
		return this.popProductDescr;
	}

	/**
	 * @return the popRefCode
	 */
	public String getPopRefCode() {
		return this.popRefCode;
	}

	/**
	 * @return the popSaleDate
	 */
	public String getPopSaleDate() {
		return this.popSaleDate;
	}

	/**
	 * @return the popSign
	 */
	public String getPopSign() {
		return this.popSign;
	}

	/**
	 * @return the popStatus
	 */
	public String getPopStatus() {
		return this.popStatus;
	}

	/**
	 * @return the popTxnId
	 */
	public String getPopTxnId() {
		return this.popTxnId;
	}

	/**
	 * @param authID
	 *            the authID to set
	 */
	public void setAuthID(int authID) {
		this.authID = authID;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @param paymentAuthCode
	 *            the paymentAuthCode to set
	 */
	public void setPaymentAuthCode(String paymentAuthCode) {
		this.paymentAuthCode = paymentAuthCode;
	}

	/**
	 * @param paymentRequest
	 *            the paymentRequest to set
	 */
	public void setPaymentRequest(String paymentRequest) {
		this.paymentRequest = paymentRequest;
	}

	/**
	 * @param paymentResponse
	 *            the paymentResponse to set
	 */
	public void setPaymentResponse(String paymentResponse) {
		this.paymentResponse = paymentResponse;
	}

	/**
	 * @param popActionCode
	 *            the popActionCode to set
	 */
	public void setPopActionCode(String popActionCode) {
		this.popActionCode = popActionCode;
	}

	/**
	 * @param popAuthCode
	 *            the popAuthCode to set
	 */
	public void setPopAuthCode(String popAuthCode) {
		this.popAuthCode = popAuthCode;
	}

	/**
	 * @param popAvsCode
	 *            the popAvsCode to set
	 */
	public void setPopAvsCode(String popAvsCode) {
		this.popAvsCode = popAvsCode;
	}

	/**
	 * @param popCustomerId
	 *            the popCustomerId to set
	 */
	public void setPopCustomerId(String popCustomerId) {
		this.popCustomerId = popCustomerId;
	}

	/**
	 * @param popErrorCode
	 *            the popErrorCode to set
	 */
	public void setPopErrorCode(String popErrorCode) {
		this.popErrorCode = popErrorCode;
	}

	/**
	 * @param popErrorMessage
	 *            the popErrorMessage to set
	 */
	public void setPopErrorMessage(String popErrorMessage) {
		this.popErrorMessage = popErrorMessage;
	}

	/**
	 * @param popMerchantId
	 *            the popMerchantId to set
	 */
	public void setPopMerchantId(String popMerchantId) {
		this.popMerchantId = popMerchantId;
	}

	/**
	 * @param popOrderId
	 *            the popOrderId to set
	 */
	public void setPopOrderId(String popOrderId) {
		this.popOrderId = popOrderId;
	}

	/**
	 * @param popOrderValidTil
	 *            the popOrderValidTil to set
	 */
	public void setPopOrderValidTil(String popOrderValidTil) {
		this.popOrderValidTil = popOrderValidTil;
	}

	/**
	 * @param popPayload
	 *            the popPayload to set
	 */
	public void setPopPayload(String popPayload) {
		this.popPayload = popPayload;
	}

	/**
	 * @param popPrice
	 *            the popPrice to set
	 */
	public void setPopPrice(String popPrice) {
		this.popPrice = popPrice;
	}

	/**
	 * @param popProductDescr
	 *            the popProductDescr to set
	 */
	public void setPopProductDescr(String popProductDescr) {
		this.popProductDescr = popProductDescr;
	}

	/**
	 * @param popRefCode
	 *            the popRefCode to set
	 */
	public void setPopRefCode(String popRefCode) {
		this.popRefCode = popRefCode;
	}

	/**
	 * @param popSaleDate
	 *            the popSaleDate to set
	 */
	public void setPopSaleDate(String popSaleDate) {
		this.popSaleDate = popSaleDate;
	}

	/**
	 * @param popSign
	 *            the popSign to set
	 */
	public void setPopSign(String popSign) {
		this.popSign = popSign;
	}

	/**
	 * @param popStatus
	 *            the popStatus to set
	 */
	public void setPopStatus(String popStatus) {
		this.popStatus = popStatus;
	}

	/**
	 * @param popTxnId
	 *            the popTxnId to set
	 */
	public void setPopTxnId(String popTxnId) {
		this.popTxnId = popTxnId;
	}

}
