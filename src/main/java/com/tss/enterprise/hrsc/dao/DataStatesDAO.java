/*
 * $Id: DataStatesDAO.java,v 1.0 2015/01/13 11:08:03  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.dao;

import java.util.List;

import com.tss.enterprise.hrsc.model.vo.DataStatesModel;
import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * @author khoapkl
 */
public interface DataStatesDAO {

	List<DataStatesModel> getStates() throws MASSException;
}
