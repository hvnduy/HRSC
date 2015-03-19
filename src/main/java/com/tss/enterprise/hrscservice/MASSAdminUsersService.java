package com.tss.enterprise.hrscservice;

import com.tss.enterprise.hrsc.model.vo.MASSadminUsersModel;
import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * The Interface MASSadminUsersService.
 * @author duyhuynh
 */
public interface MASSAdminUsersService {
	MASSadminUsersModel getMASSadminUsers(String userName) throws MASSException;
}
