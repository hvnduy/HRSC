package com.tss.enterprise.hrsc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tss.enterprise.hrsc.dao.MASSAdminUsersDAO;
import com.tss.enterprise.hrsc.model.vo.MASSadminUsersModel;
import com.tss.enterprise.hrsc.utils.MASSException;
import com.tss.enterprise.hrscservice.MASSAdminUsersService;
@Service
public class MASSAdminUsersServiceImpl implements MASSAdminUsersService {
	@Autowired
	private MASSAdminUsersDAO adminUsersDAO;
	
	@Override
	public MASSadminUsersModel getMASSadminUsers(String userName) throws MASSException {
		return adminUsersDAO.getMASSadminUsers(userName);
	}

}
