/*
 * $Id: DataStatesModel.java,v 1 2015/01/13 13:58:00 Exp $
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
public class DataStatesModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * KEY_WORD.
	 */
	public static final String KEY_WORD = "KEY_WORD";

	/**
	 * FULL_NAME.
	 */
	public static final String FULL_NAME = "FULL_NAME";
	
	private String fullName;

	private String keyWord;
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @return the keyWord
	 */
	public String getKeyWord() {
		return keyWord;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @param keyWord the keyWord to set
	 */
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	

}
