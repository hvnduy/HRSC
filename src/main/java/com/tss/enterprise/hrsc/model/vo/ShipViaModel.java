/*
 * $Id: ShipViaModel.java,v 1 2015/01/13 13:58:00 Exp $
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
 * The administrator user contains administrator information.
 * 
 * @author khoapkl
 */
public class ShipViaModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private int shipId;
	private String carrier;
	private String service;
	private String mass;
	private String website;
	private int freeCtrl;
	private int available;

	private int isDefault;

	/**
	 * @return the available
	 */
	public int getAvailable() {
		return this.available;
	}

	/**
	 * @return the carrier
	 */
	public String getCarrier() {
		return this.carrier;
	}

	/**
	 * @return the freeCtrl
	 */
	public int getFreeCtrl() {
		return this.freeCtrl;
	}

	/**
	 * @return the isDefault
	 */
	public int getIsDefault() {
		return this.isDefault;
	}

	/**
	 * @return the mass
	 */
	public String getMass() {
		return this.mass;
	}

	/**
	 * @return the service
	 */
	public String getService() {
		return this.service;
	}

	/**
	 * @return the shipId
	 */
	public int getShipId() {
		return this.shipId;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return this.website;
	}

	/**
	 * @param available
	 *            the available to set
	 */
	public void setAvailable(int available) {
		this.available = available;
	}

	/**
	 * @param carrier
	 *            the carrier to set
	 */
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	/**
	 * @param freeCtrl
	 *            the freeCtrl to set
	 */
	public void setFreeCtrl(int freeCtrl) {
		this.freeCtrl = freeCtrl;
	}

	/**
	 * @param isDefault
	 *            the isDefault to set
	 */
	public void setIsDefault(int isDefault) {
		this.isDefault = isDefault;
	}

	/**
	 * @param mass
	 *            the mass to set
	 */
	public void setMass(String mass) {
		this.mass = mass;
	}

	/**
	 * @param service
	 *            the service to set
	 */
	public void setService(String service) {
		this.service = service;
	}

	/**
	 * @param shipId
	 *            the shipId to set
	 */
	public void setShipId(int shipId) {
		this.shipId = shipId;
	}

	/**
	 * @param website
	 *            the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

}
