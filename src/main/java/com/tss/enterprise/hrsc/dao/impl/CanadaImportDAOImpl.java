/*
 * $Id: CanadaImportDAOImpl.java,v 1 2015/01/23 13:58:00  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.tss.enterprise.hrsc.dao.CanadaImportDAO;
import com.tss.enterprise.hrsc.model.vo.ContactInfoModel;

/**
 * The Class CanadaImportDAOImpl.
 * @author duyhuynh
 */
@Repository
public class CanadaImportDAOImpl implements CanadaImportDAO {
	private static final Logger LOG = Logger.getLogger(CanadaImportDAOImpl.class);

	@Override
	public int updateContactBatch(List<ContactInfoModel> contactInfoModelList) {
		// TODO Auto-generated method stub
		return 0;
	}

}
