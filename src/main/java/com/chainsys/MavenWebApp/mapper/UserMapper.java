package com.chainsys.MavenWebApp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.chainsys.MavenWebApp.model.User;

public class UserMapper implements RowMapper<User>
{
    
	public User mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		User user=new User();
		String name = rs.getString("name");
		user.setName(name);
		
		long phoneNumber = rs.getLong("phone_number");
		user.setPhoneNumber(phoneNumber);
		
		String emailId = rs.getString("email_id");
		user.setEmailId(emailId);
		
		return user;
	}
}
