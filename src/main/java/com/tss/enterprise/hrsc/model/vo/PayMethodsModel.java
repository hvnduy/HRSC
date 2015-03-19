/*
 * $Id: PayMethodsModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class PayMethodsModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int available;
	private int creditCard;

	private int mass;

	private int code;

	/**
	 * @return the available
	 */
	public int getAvailable() {
		return this.available;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return this.code;
	}

	/**
	 * @return the creditCard
	 */
	public int getCreditCard() {
		return this.creditCard;
	}

	/**
	 * @return the mass
	 */
	public int getMass() {
		return this.mass;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param available
	 *            the available to set
	 */
	public void setAvailable(int available) {
		this.available = available;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @param creditCard
	 *            the creditCard to set
	 */
	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}

	/**
	 * @param mass
	 *            the mass to set
	 */
	public void setMass(int mass) {
		this.mass = mass;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
