package com.tss.enterprise.hrsc.dao;

import com.tss.enterprise.hrsc.model.vo.MASSadminUsersModel;
import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * The Interface MASSAdminUsersDAO.
 */
public interface MASSAdminUsersDAO {

	/**
	 * Gets the MAS sadmin users.
	 * @param userName
	 *            the user name
	 * @return the MAS sadmin users
	 */
	MASSadminUsersModel getMASSadminUsers(String userName) throws MASSException;
}
