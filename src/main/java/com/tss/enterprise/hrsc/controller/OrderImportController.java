/*
 * $Id: OrderImportController.java,v 1.0 2014/03/23 09:08:03  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */package com.tss.enterprise.hrsc.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tss.enterprise.hrsc.dao.ContactInfoDAO;
import com.tss.enterprise.hrsc.model.vo.ContactInfoModel;
import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * The Class OrderImportController.
 */
@Controller
public class OrderImportController {
	@Autowired
	ContactInfoDAO contactInfoDAO;
	/** The Constant LOG. */
	public static final Logger LOG = Logger.getLogger(OrderImportController.class);

	/**
	 * Main page.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = "/importOrderCanada", method = RequestMethod.GET)
	public String mainPage(ModelMap model) {
		List<ContactInfoModel> list = new ArrayList<ContactInfoModel>();
		ContactInfoModel model2 = new ContactInfoModel();
		model2.setFmID("38474");
		model2.setShopperId("123123");
		model2.setShipToFname("Nguyen Chi");
		list.add(model2);
		model2 = new ContactInfoModel();
		model2.setFmID("37512");
		model2.setShopperId("456456");
		model2.setShipToFname("haha");
		list.add(model2);
		try {
			int[] t = contactInfoDAO.updateCanadaContactsByFmid(list);
			System.out.println("PPP"+t.length);
		} catch (MASSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "importCanadaOrder.tile";
	}
}
