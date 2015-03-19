/*
 * $Id: ShipCostModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class ShipCostModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String carrier;
	private String zone;

	private int weight;

	private double price;

	public String getCarrier() {
		return this.carrier;
	}

	public double getPrice() {
		return this.price;
	}

	public int getWeight() {
		return this.weight;
	}

	public String getZone() {
		return this.zone;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}

}
