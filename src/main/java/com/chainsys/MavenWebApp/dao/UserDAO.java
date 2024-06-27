package com.chainsys.MavenWebApp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.chainsys.MavenWebApp.model.User;

@Repository
public interface UserDAO
{
	public void saveDetails(User user);
	public List<User> retrive();
	public void delete(User user);
	public List<User> search(String name);
	public void update(User user);
}
