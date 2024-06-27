package com.chainsys.MavenWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.MavenWebApp.dao.UserDAO;
import com.chainsys.MavenWebApp.model.User;

@Controller
public class MyController
{
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/home")
	public String home()
	{        
		return "home.jsp";
	} 
	
	@RequestMapping("/success")
	public String success()
	{
		return "success.jsp";
	}
	
	@PostMapping("/register")
	public String saveDetails(@RequestParam ("name") String name, @RequestParam ("phoneNumber") long phoneNumber, @RequestParam ("emailId") String emailId, @RequestParam ("password") String password)
	{
		User user = new User();
		
		user.setName(name);
		user.setPhoneNumber(phoneNumber);
		user.setEmailId(emailId);
		user.setPassword(password);
		userDAO.saveDetails(user);
		
		return "success.jsp";
	}
	
	@GetMapping("/listOfUsers")
	public String getAllUsers(Model model)
	{
		List<User> users = userDAO.retrive();
		model.addAttribute("list", users);
		return "userTable.jsp";
	}
	
	
	@PostMapping("/update")
	public String update(@RequestParam ("phoneNumber") long phoneNumber, @RequestParam ("password") String password, @RequestParam ("name") String name, Model model)
	{
		User user = new User();
		
		user.setPhoneNumber(phoneNumber);
		user.setPassword(password);
		user.setName(name);
		
		userDAO.update(user);
		
		List<User> users = userDAO.retrive();
		model.addAttribute("list", users);
		
		return "userTable.jsp";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam ("name") String name, Model model)
	{
		User user = new User();
		user.setName(name);
		
		userDAO.delete(user);
		
		List<User> users = userDAO.retrive();
		model.addAttribute("list", users);
		
		return "userTable.jsp";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam ("name") String name, Model model)
	{
		
		List<User> list = userDAO.search(name);
		model.addAttribute("list", list);
		return "searchedList.jsp";
	}	
}