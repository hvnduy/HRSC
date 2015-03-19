/*
 * $Id: TrackExportModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class TransferRptModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String accessMod;
	private String userName;
	private String itemSku;
	private String orderNumber;
	private int updatedStatus;
	private Date createdDate;
	/**
	 * @return the accessMod
	 */
	public String getAccessMod() {
		return this.accessMod;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return this.createdDate;
	}
	/**
	 * @return the itemSku
	 */
	public String getItemSku() {
		return this.itemSku;
	}
	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return this.orderNumber;
	}
	/**
	 * @return the updatedStatus
	 */
	public int getUpdatedStatus() {
		return this.updatedStatus;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * @param accessMod the accessMod to set
	 */
	public void setAccessMod(String accessMod) {
		this.accessMod = accessMod;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @param itemSku the itemSku to set
	 */
	public void setItemSku(String itemSku) {
		this.itemSku = itemSku;
	}
	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @param updatedStatus the updatedStatus to set
	 */
	public void setUpdatedStatus(int updatedStatus) {
		this.updatedStatus = updatedStatus;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}


}
