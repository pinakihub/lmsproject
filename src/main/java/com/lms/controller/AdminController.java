package com.lms.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.lms.model.Admin;
import com.lms.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService as;
	
	@GetMapping("/adminlogin")
	public String login(){
		return "adminlogin";
	}
	
	@GetMapping("/adminregister")
	public String register(){
		//model.addAttribute("msg","success");
		return "adminregister";
	}
	
	@GetMapping("/admin")
	public String dashboard() {
		return "admindashboard";
	}
	
	@PostMapping(path="/doadminregister")
	public String doregister( @RequestParam Map<String, String> body, Model model) {
		try {		
			Admin adminuser=new Admin();
			adminuser.setAdminName(body.get("adminName"));
			adminuser.setAdminEmail(body.get("adminEmail"));
			adminuser.setAdminPassword(body.get("adminPassword"));
			adminuser.setAdminContact(body.get("adminContact"));
			this.as.addNew(adminuser);
			model.addAttribute("msg","success");
			//System.out.println(body);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "adminregister";
	}
	
	@PostMapping(path="/doadminlogin")
	public String dologin(@RequestParam Map<String, String> body, Model model) {
		//have to enter login logic
		return "admindashboard";
	}
	

}
