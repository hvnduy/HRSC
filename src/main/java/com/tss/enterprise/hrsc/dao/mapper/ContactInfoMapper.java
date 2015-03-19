/*
 * $Id: ContactInfoMapper.java,v 1.0 2015/01/13 11:08:03  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tss.enterprise.hrsc.model.vo.ContactInfoModel;

/**
 * ContactInfoMapper.
 * 
 * @author
 */
public final class ContactInfoMapper {

	public static RowMapper<ContactInfoModel> getListContactInfoDetails() {
		RowMapper<ContactInfoModel> orderMapper = new RowMapper<ContactInfoModel>() {
			@Override
			public ContactInfoModel mapRow(ResultSet rs, int arg1)
			throws SQLException {
				ContactInfoModel model = new ContactInfoModel();
				model.setTermCode(ContactInfoModel.TERM_CODE);
				return model;
			}
		};
		return orderMapper;
	}

	/**
	 * ContactInfoMapper.
	 */
	private ContactInfoMapper() {
	}

}
