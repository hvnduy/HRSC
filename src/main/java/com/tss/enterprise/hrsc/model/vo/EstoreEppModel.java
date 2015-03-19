/*
 * $Id: EstoreEppModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class EstoreEppModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String eppId;
	private String description;
	private Date startDate;
	private Date endDate;
	private int dfsPContrib;
	private int dfsDContrib;
	private int corPContrib;
	private int corDContrib;
	private int freeShipping;
	private int deleted;

	/**
	 * @return the corDContrib
	 */
	public int getCorDContrib() {
		return this.corDContrib;
	}

	/**
	 * @return the corPContrib
	 */
	public int getCorPContrib() {
		return this.corPContrib;
	}

	/**
	 * @return the deleted
	 */
	public int getDeleted() {
		return this.deleted;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @return the dfsDContrib
	 */
	public int getDfsDContrib() {
		return this.dfsDContrib;
	}

	/**
	 * @return the dfsPContrib
	 */
	public int getDfsPContrib() {
		return this.dfsPContrib;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return this.endDate;
	}

	/**
	 * @return the eppId
	 */
	public String getEppId() {
		return this.eppId;
	}

	/**
	 * @return the freeShipping
	 */
	public int getFreeShipping() {
		return this.freeShipping;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return this.startDate;
	}

	/**
	 * @param corDContrib
	 *            the corDContrib to set
	 */
	public void setCorDContrib(int corDContrib) {
		this.corDContrib = corDContrib;
	}

	/**
	 * @param corPContrib
	 *            the corPContrib to set
	 */
	public void setCorPContrib(int corPContrib) {
		this.corPContrib = corPContrib;
	}

	/**
	 * @param deleted
	 *            the deleted to set
	 */
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param dfsDContrib
	 *            the dfsDContrib to set
	 */
	public void setDfsDContrib(int dfsDContrib) {
		this.dfsDContrib = dfsDContrib;
	}

	/**
	 * @param dfsPContrib
	 *            the dfsPContrib to set
	 */
	public void setDfsPContrib(int dfsPContrib) {
		this.dfsPContrib = dfsPContrib;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @param eppId
	 *            the eppId to set
	 */
	public void setEppId(String eppId) {
		this.eppId = eppId;
	}

	/**
	 * @param freeShipping
	 *            the freeShipping to set
	 */
	public void setFreeShipping(int freeShipping) {
		this.freeShipping = freeShipping;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}
