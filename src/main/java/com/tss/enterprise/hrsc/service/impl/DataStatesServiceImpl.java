/*
 * $Id: DataStatesServiceImpl.java,v 1 2015/01/14 13:58:00 Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tss.enterprise.hrsc.dao.DataStatesDAO;
import com.tss.enterprise.hrsc.model.vo.DataStatesModel;
import com.tss.enterprise.hrsc.utils.MASSException;
import com.tss.enterprise.hrscservice.DataStatesService;
/**
 * The DataStatesServiceImpl Class.
 * @author
 */
@Service
public class DataStatesServiceImpl implements DataStatesService {

	public static final Logger LOG = Logger.getLogger(DataStatesServiceImpl.class);

	@Autowired
	private DataStatesDAO dataStatesDAO;

	public List<DataStatesModel> getStates() throws MASSException {
		return this.dataStatesDAO.getStates();
	}

}
