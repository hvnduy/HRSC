/*
 * $Id: LoginAccountDAO.java,v 1.0 2015/01/20 10:51:03  Exp $
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.tss.enterprise.hrsc.dao.LoginAccountDAO;
import com.tss.enterprise.hrsc.model.vo.LoginAccountModel;
import com.tss.enterprise.hrsc.utils.Constants;
import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * The Class LoginAccountDAOImpl.
 * @author duyhuynh
 */
@Repository
public class LoginAccountDAOImpl implements LoginAccountDAO {
	@Value("${com.mass.sql.getLoginAccountByUserID}")
	private String getLoginAccountByUserID;

	@Override
	public List<LoginAccountModel> getLoginAccountByUserID(String userid) throws MASSException {
		List<LoginAccountModel> result = new ArrayList<LoginAccountModel>();
		List<Map<String, Object>> rows = BaseDAOImpl.jdbcTemplate.queryForList(this.getLoginAccountByUserID, new Object[] { userid });
		LoginAccountModel account = null;
		for (Map<String, Object> row : rows) {
			account = new LoginAccountModel();
			account.setUserid((String) (row.get(Constants.USER_ID)));
			account.setAccountid((String) (row.get(Constants.ACCOUNT_ID)));
			account.setAccessRight((String) (row.get(Constants.ACCESS_RIGHT)));
			result.add(account);
		}
		return result;
	}

}
