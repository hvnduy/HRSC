/*
 * $Id: DataStatesService.java,v 1 2015/01/14 13:58:00  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrscservice;

import java.util.List;

import com.tss.enterprise.hrsc.model.vo.DataStatesModel;
import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * DataStatesService interface.
 * @author
 */

public interface DataStatesService {

	List<DataStatesModel> getStates() throws MASSException;

}
