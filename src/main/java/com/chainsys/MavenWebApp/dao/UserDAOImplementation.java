package com.chainsys.MavenWebApp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chainsys.MavenWebApp.mapper.UserMapper;
import com.chainsys.MavenWebApp.model.User;

@Repository
public class UserDAOImplementation implements UserDAO
{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	UserMapper mapper;

	@Override
	public void saveDetails(User user)
	{
		String insert = "insert into demo (name, email_id, phone_number, password) values (?,?,?,?)";
		Object[] params = {user.getName(), user.getEmailId(), user.getPhoneNumber(), user.getPassword()};
		jdbcTemplate.update(insert, params);
	}

	@Override
	public List<User> retrive() 
	{
		String retrive = "select name, email_id, phone_number from demo";
		List<User> list = jdbcTemplate.query(retrive, new UserMapper());
		return list;
	}

	public void update(User user)
	{
		String update = "update demo set phone_number=?, password=? where name=?";
		Object[] name = {user.getPhoneNumber(), user.getPassword(), user.getName()};
		jdbcTemplate.update(update, name);			
	}

	public void delete(User user) 
	{
		String delete = "delete from demo where name=?";
		Object[] name = {user.getName()};
		jdbcTemplate.update(delete, name);
		
	}

	public String search(String name) 
	{
		String retrive = "select name, email_id, phone_number from demo where name=?";
		String getList = null;
		try
		{
			getList = jdbcTemplate.queryForObject(retrive, String.class, name);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return getList;
	}
}
