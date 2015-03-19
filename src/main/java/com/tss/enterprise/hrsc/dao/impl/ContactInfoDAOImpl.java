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

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.tss.enterprise.hrsc.dao.ContactInfoDAO;
import com.tss.enterprise.hrsc.dao.mapper.ContactInfoMapper;
import com.tss.enterprise.hrsc.model.vo.ContactInfoModel;
import com.tss.enterprise.hrsc.utils.AntiMagicNumber;
import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * 
 * @author 
 */
@Repository
public class ContactInfoDAOImpl implements ContactInfoDAO {

	private static final Logger LOG = Logger.getLogger(ContactInfoDAOImpl.class);
	/**
	 * get Contact Info
	 */
	@Value("${com.mass.sql.getContactInfos}")
	private String getContactInfos;	
		
	/**
	 * count  Contact Info
	 */
	@Value("${com.mass.sql.countContactInfo }")
	private String countContactInfos;	
	
	/**
	 * insert Contact Info
	 */
	@Value("${com.mass.sql.insertContactInfo}")
	private String insertContactInfo;
	
	/**
	 * update Contact Info
	 */
	@Value("${com.mass.sql.updateContactInfo}")
	private String updateContactInfo;
	
	/**
	 * update Contact Info
	 */
	@Value("${com.mass.sql.deleteContactInfo}")
	private String deleteContactInfo;
	
	@Value("${com.mass.sql.update.canada.contacts.by.fmid}")
	private String updateCanadaContactsByFmid;
	
	@Override
	public List<ContactInfoModel> getContactInfoDetails(int shopperId) throws MASSException {
		List<ContactInfoModel> result = null;
		try {
			result = BaseDAOImpl.jdbcTemplate.query(this.getContactInfos, new Object[] { shopperId }, ContactInfoMapper.getListContactInfoDetails());
		} catch (DataAccessException e) {
			LOG.error(e.getMessage(), e);
			throw new MASSException(e);
		}
		return result;
	}


	@Override
	public void updateContactInfo(final String billToAddress1, final int shopperId) throws MASSException {
		try {
			BaseDAOImpl.jdbcTemplate.update(this.updateContactInfo, new PreparedStatementSetter() {
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setString(AntiMagicNumber.ONE, billToAddress1);
					ps.setInt(AntiMagicNumber.TWO, shopperId);
				}
			});
		} catch (DataAccessException e) {
			LOG.error(e.getMessage(), e);
			throw new MASSException(e);
		}
	}


	@Override
	public void delete(int shopperId) throws MASSException {
		try {
			BaseDAOImpl.jdbcTemplate.update(this.deleteContactInfo,
					new PreparedStatementSetter() {
						@Override
						public void setValues(PreparedStatement ps)
								throws SQLException {
							//set parameter in where condition
						}
					});
		} catch (DataAccessException e) {
			LOG.error(e.getMessage(), e);
			throw new MASSException(e);
		}
	}


	@Override
	public void inserContactInfo(int shopperId) throws MASSException {
		try {
			BaseDAOImpl.jdbcTemplate.update(this.insertContactInfo,
					new PreparedStatementSetter() {
						@Override
						public void setValues(PreparedStatement ps)
								throws SQLException {
							//set parameter in VALUES condition
						}
					});
		} catch (DataAccessException e) {
			LOG.error(e.getMessage(), e);
			throw new MASSException(e);
		}
	}


	@Override
	public int countContactInfo() throws MASSException {
		int total = 0;
		try {
			total = BaseDAOImpl.jdbcTemplate.queryForInt(this.countContactInfos);
		} catch (DataAccessException e) {
			LOG.error(e.getMessage(), e);
			throw new MASSException(e);
		}
		return total;
	}


	@Override
	public int[] updateCanadaContactsByFmid(final List<ContactInfoModel> contactInfoModelList) throws MASSException {
		int[] updateCnt = null; 
		try {
			updateCnt = BaseDAOImpl.jdbcTemplate.batchUpdate(this.updateCanadaContactsByFmid, new BatchPreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps, int i) throws SQLException {
					ps.setString(1, contactInfoModelList.get(i).getShopperId());
					ps.setString(2, contactInfoModelList.get(i).getShipToFname());
					ps.setString(3, contactInfoModelList.get(i).getFmID());
					
				}
				
				@Override
				public int getBatchSize() {
					return contactInfoModelList.size();
				}
			});
		} catch (DataAccessException e) {
			LOG.error(e.getMessage(), e);
			throw new MASSException(e);
		}
		return updateCnt;
	}
	
}
