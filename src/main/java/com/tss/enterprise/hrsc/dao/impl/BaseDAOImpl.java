/*
 * $Id.: $BaseDAOImpl.java
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * @author khoapkl
 */
public class BaseDAOImpl {

	protected static JdbcTemplate jdbcTemplate;
	protected static NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	protected static DataSourceTransactionManager transactionManager;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		BaseDAOImpl.jdbcTemplate = jdbcTemplate;
	}
	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		BaseDAOImpl.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public void setTransactionManager(
			DataSourceTransactionManager transactionManager) {
		BaseDAOImpl.transactionManager = transactionManager;
	}
}
