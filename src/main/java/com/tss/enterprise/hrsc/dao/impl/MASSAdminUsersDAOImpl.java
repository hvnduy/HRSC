package com.tss.enterprise.hrsc.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.tss.enterprise.hrsc.dao.MASSAdminUsersDAO;
import com.tss.enterprise.hrsc.dao.mapper.MASSadminUsersMapper;
import com.tss.enterprise.hrsc.model.vo.MASSadminUsersModel;
import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * The Class MASSadminUsersDAOImpl.
 * @author duyhuynh
 */
@Repository
public class MASSAdminUsersDAOImpl implements MASSAdminUsersDAO {

	/** The Constant LOG. */
	private static final Logger LOG = Logger.getLogger(MASSAdminUsersDAOImpl.class);

	/** The get mass admin users. */
	@Value("${com.mass.sql.GetMASSAdminUsers}")
	private String getMASSAdminUsers;

	@Override
	public MASSadminUsersModel getMASSadminUsers(String userName) throws MASSException {
		MASSadminUsersModel result = null;
		try {
			result = BaseDAOImpl.jdbcTemplate.queryForObject(this.getMASSAdminUsers, new Object[] { userName }, MASSadminUsersMapper.getMASSadminUserMapper());
		} catch (DataAccessException e) {
			LOG.error(e.getMessage(), e);
			throw new MASSException(e);
		}
		return result;
	}

}
