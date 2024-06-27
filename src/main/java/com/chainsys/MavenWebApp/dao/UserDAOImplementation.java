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
		String retrive = "select name, email_id, phone_number from demo where deleted_user=0";
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
		String delete = "update demo set deleted_user=1 where name=?";
		Object[] name = {user.getName()};
		jdbcTemplate.update(delete, name);
	}

	public List<User> search(String name) 
	{
		String retrive = String.format 
				(
		            "SELECT name, email_id, phone_number FROM demo " +
		            "WHERE (name LIKE '%%%s%%' OR email_id LIKE '%%%s%%' OR phone_number LIKE '%%%s%%') " +
		            "AND deleted_user=0",
		            name, name,name
		        );
		        return jdbcTemplate.query(retrive, new UserMapper());		
	}
}