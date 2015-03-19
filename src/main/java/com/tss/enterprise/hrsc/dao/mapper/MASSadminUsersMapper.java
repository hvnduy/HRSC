package com.tss.enterprise.hrsc.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tss.enterprise.hrsc.model.vo.MASSadminUsersModel;

/**
 * The Class MASSadminUsersMapper.
 * @author duyhuynh
 */
public class MASSadminUsersMapper {

	/**
	 * Gets the MAS sadmin user mapper.
	 * @return the MAS sadmin user mapper
	 * @author duyhuynh
	 */
	public static RowMapper<MASSadminUsersModel> getMASSadminUserMapper() {
		RowMapper<MASSadminUsersModel> mapper = new RowMapper<MASSadminUsersModel>() {

			@Override
			public MASSadminUsersModel mapRow(ResultSet rs, int arg1) throws SQLException {
				MASSadminUsersModel model = new MASSadminUsersModel();
				model.setUserName(rs.getString("userName"));
				model.setPassword(rs.getString("password"));
				model.setDdmin(rs.getString("admin"));
				model.setAgentId(rs.getInt("agent_id"));
				model.setBatchId(rs.getInt("batch_id"));
				model.setLoc(rs.getString("loc"));
				model.setOrderEntry(rs.getString("orderEntry"));
				return model;
			}
		};
		return mapper;
	}

}
