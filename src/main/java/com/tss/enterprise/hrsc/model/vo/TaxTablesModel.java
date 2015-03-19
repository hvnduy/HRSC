/*
 * $Id: TableTemplateModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class TaxTablesModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String zip;
	private String city;
	private String county;
	private String state;
	private String cntyDef;
	private String defaultTax;
	private String cntyFips;
	private double statesTax;

	private double cntsTax;

	private double cntlclsTax;

	private double ctysTax;

	private double ctylclsTax;

	private double combsTax;

	private double stateuTax;

	private double cntuTax;

	private double cntlcluTax;

	private double ctyuTax;

	private double ctylcluTax;

	private double combuTax;

	private String effDate;

	private String geoCode;

	private String inoutCity;

	/**
	 * @return the city
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 * @return the cntlclsTax
	 */
	public double getCntlclsTax() {
		return this.cntlclsTax;
	}

	/**
	 * @return the cntlcluTax
	 */
	public double getCntlcluTax() {
		return this.cntlcluTax;
	}

	/**
	 * @return the cntsTax
	 */
	public double getCntsTax() {
		return this.cntsTax;
	}

	/**
	 * @return the cntuTax
	 */
	public double getCntuTax() {
		return this.cntuTax;
	}

	/**
	 * @return the cntyDef
	 */
	public String getCntyDef() {
		return this.cntyDef;
	}

	/**
	 * @return the cntyFips
	 */
	public String getCntyFips() {
		return this.cntyFips;
	}

	/**
	 * @return the combsTax
	 */
	public double getCombsTax() {
		return this.combsTax;
	}

	/**
	 * @return the combuTax
	 */
	public double getCombuTax() {
		return this.combuTax;
	}

	/**
	 * @return the county
	 */
	public String getCounty() {
		return this.county;
	}

	/**
	 * @return the ctylclsTax
	 */
	public double getCtylclsTax() {
		return this.ctylclsTax;
	}

	/**
	 * @return the ctylcluTax
	 */
	public double getCtylcluTax() {
		return this.ctylcluTax;
	}

	/**
	 * @return the ctysTax
	 */
	public double getCtysTax() {
		return this.ctysTax;
	}

	/**
	 * @return the ctyuTax
	 */
	public double getCtyuTax() {
		return this.ctyuTax;
	}

	/**
	 * @return the defaultTax
	 */
	public String getDefaultTax() {
		return this.defaultTax;
	}

	/**
	 * @return the effDate
	 */
	public String getEffDate() {
		return this.effDate;
	}

	/**
	 * @return the geoCode
	 */
	public String getGeoCode() {
		return this.geoCode;
	}

	/**
	 * @return the inoutCity
	 */
	public String getInoutCity() {
		return this.inoutCity;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * @return the statesTax
	 */
	public double getStatesTax() {
		return this.statesTax;
	}

	/**
	 * @return the stateuTax
	 */
	public double getStateuTax() {
		return this.stateuTax;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return this.zip;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param cntlclsTax
	 *            the cntlclsTax to set
	 */
	public void setCntlclsTax(double cntlclsTax) {
		this.cntlclsTax = cntlclsTax;
	}

	/**
	 * @param cntlcluTax
	 *            the cntlcluTax to set
	 */
	public void setCntlcluTax(double cntlcluTax) {
		this.cntlcluTax = cntlcluTax;
	}

	/**
	 * @param cntsTax
	 *            the cntsTax to set
	 */
	public void setCntsTax(double cntsTax) {
		this.cntsTax = cntsTax;
	}

	/**
	 * @param cntuTax
	 *            the cntuTax to set
	 */
	public void setCntuTax(double cntuTax) {
		this.cntuTax = cntuTax;
	}

	/**
	 * @param cntyDef
	 *            the cntyDef to set
	 */
	public void setCntyDef(String cntyDef) {
		this.cntyDef = cntyDef;
	}

	/**
	 * @param cntyFips
	 *            the cntyFips to set
	 */
	public void setCntyFips(String cntyFips) {
		this.cntyFips = cntyFips;
	}

	/**
	 * @param combsTax
	 *            the combsTax to set
	 */
	public void setCombsTax(double combsTax) {
		this.combsTax = combsTax;
	}

	/**
	 * @param combuTax
	 *            the combuTax to set
	 */
	public void setCombuTax(double combuTax) {
		this.combuTax = combuTax;
	}
	/**
	 * @param county
	 *            the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}
	/**
	 * @param ctylclsTax
	 *            the ctylclsTax to set
	 */
	public void setCtylclsTax(double ctylclsTax) {
		this.ctylclsTax = ctylclsTax;
	}
	/**
	 * @param ctylcluTax
	 *            the ctylcluTax to set
	 */
	public void setCtylcluTax(double ctylcluTax) {
		this.ctylcluTax = ctylcluTax;
	}
	/**
	 * @param ctysTax
	 *            the ctysTax to set
	 */
	public void setCtysTax(double ctysTax) {
		this.ctysTax = ctysTax;
	}
	/**
	 * @param ctyuTax
	 *            the ctyuTax to set
	 */
	public void setCtyuTax(double ctyuTax) {
		this.ctyuTax = ctyuTax;
	}
	/**
	 * @param defaultTax
	 *            the defaultTax to set
	 */
	public void setDefaultTax(String defaultTax) {
		this.defaultTax = defaultTax;
	}
	/**
	 * @param effDate
	 *            the effDate to set
	 */
	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}
	/**
	 * @param geoCode
	 *            the geoCode to set
	 */
	public void setGeoCode(String geoCode) {
		this.geoCode = geoCode;
	}
	/**
	 * @param inoutCity
	 *            the inoutCity to set
	 */
	public void setInoutCity(String inoutCity) {
		this.inoutCity = inoutCity;
	}
	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @param statesTax
	 *            the statesTax to set
	 */
	public void setStatesTax(double statesTax) {
		this.statesTax = statesTax;
	}
	/**
	 * @param stateuTax
	 *            the stateuTax to set
	 */
	public void setStateuTax(double stateuTax) {
		this.stateuTax = stateuTax;
	}
	/**
	 * @param zip
	 *            the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
}
