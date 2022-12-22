package com.lms.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lms.model.User;
import com.lms.service.UserService;

@Controller
public class UserController {

	@Autowired(required = false)
	private UserService us;

	@GetMapping("/userlogin")
	public String login() {
		return "userlogin";
	}

	/*
	 * @GetMapping("/userprofile") public String profile() { return "userprofile"; }
	 */

	@PostMapping(path = "/userregister")
	public String doregister(@RequestParam Map<String, String> body, Model model) {
		try {
			User user = new User();

			user.setUserName(body.get("userName"));
			user.setUserPassword(body.get("userPassword"));
			user.setUserAddress(body.get("userAddress"));
			user.setActive(Boolean.parseBoolean(body.get("isActive")));
			user.setUserId(Long.parseLong(body.get("userId")));
            user.setUserBatch(body.get("userBatch"));
            user.setUserContact(Long.parseLong(body.get("userContact")));
			 this.us.addUser(user);
			 model.addAttribute("msg","success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "register";

	}
}
