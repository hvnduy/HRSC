/*
 * $Id: OrderImportService.java,v 1 2015/01/23 13:58:00  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrscservice;

import java.util.List;

import com.tss.enterprise.hrsc.model.vo.ContactInfoModel;

/**
 * The Interface OrderImportService.
 */
public interface OrderImportService {

	/**
	 * Read csv file.
	 */
	void readCSVFile();

	/**
	 * Import contact.
	 * @param contactInfoModelList
	 *            the contact info model list
	 * @return the int
	 */
	int importContact(List<ContactInfoModel> contactInfoModelList);
}
