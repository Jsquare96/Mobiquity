package com.mobiquity.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mobiquity.bean.User;

/**
 * For find functionality of NotificationDao class
 */

public class UserMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		User usr = new User();
		usr.setUserName(rs.getString(1));
		usr.setEmail(rs.getString(3));
		usr.setPassword(rs.getString(4));
		usr.setMobile(rs.getString(2));
		usr.setLevel(rs.getString(5));
		usr.setApproval(rs.getBoolean(6));
		return usr;
	}
	
}
