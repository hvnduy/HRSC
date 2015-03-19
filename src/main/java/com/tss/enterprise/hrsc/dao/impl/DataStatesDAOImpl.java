/*
 * $Id: DataStatesDAOImpl.java,v 1 2015/01/13 13:58:00  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.tss.enterprise.hrsc.dao.DataStatesDAO;
import com.tss.enterprise.hrsc.model.vo.DataStatesModel;
import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * 
 * @author 
 */
@Repository
public class DataStatesDAOImpl implements DataStatesDAO {

	private static final Logger LOG = Logger.getLogger(DataStatesDAOImpl.class);
	/**
	 * get Setting
	 */
	@Value("${com.mass.sql.getStates}")
	private String getStates;
	

	@Override
	public List<DataStatesModel> getStates() throws MASSException {
		List<DataStatesModel> result = null;
		try {
			result = BaseDAOImpl.jdbcTemplate.query(this.getStates, new ResultSetExtractor<List<DataStatesModel>>() {
				@Override
				public List<DataStatesModel> extractData(ResultSet rs) throws SQLException {
					List<DataStatesModel> list = new ArrayList<DataStatesModel>();
					while (rs.next()) {
						DataStatesModel e = new DataStatesModel();
						e.setFullName(DataStatesModel.KEY_WORD);
						e.setKeyWord(DataStatesModel.FULL_NAME);
						list.add(e);
					}
					return list;
				}
			});
		} catch (DataAccessException e) {
			LOG.error(e.getMessage(), e);
			throw new MASSException(e);
		}
		return result;		
	}
	
	
	
}
