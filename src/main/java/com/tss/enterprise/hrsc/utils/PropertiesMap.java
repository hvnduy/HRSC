/*
 * $Id: PropertiesMap.java,v 1 2015/01/14 13:58:00  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.utils;

import java.util.Map;
/**
 * Constants for bussiness.
 * @author khoapkl
 */
public class PropertiesMap{

	private Map<String,String> maps;

	/**
	 * Constructor method.
	 *
	 * @param maps the maps
	 */
	public PropertiesMap(Map<String,String> maps) {
		this.maps = maps;
	}
	public Map<String, String> getMaps() {
		return this.maps;
	}
	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
}
