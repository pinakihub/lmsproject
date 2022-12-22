package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lms.model.User;
import com.lms.service.UserService;

@Controller
public class UserController {

	@Autowired(required = false)
	private UserService us;
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUser(){
		return this.us.getAllUser();
	}

	@GetMapping("/getuser/{sid}")
	public User getUser(@PathVariable String sid) {
		return this.us.getUser(Long.parseLong(sid));
	}
	
	@PostMapping("/add")
	public User addUser(@RequestBody User usobj) {
		
		return this.us.addUser(usobj);
	}
	

}
