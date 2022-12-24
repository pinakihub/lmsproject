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

import com.lms.constants.UserDept;
import com.lms.constants.UserRoles;
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

	@GetMapping("/user/register")
	public String register(Model model) {
		// System.out.println(UserDept.fromString("CSE"));
		
		/*
		 * model.addAttribute("departments",UserDept.values());
		 * model.addAttribute("roles",UserRoles.values());
		 */
		 
		return "user/register";
	}

	@PostMapping(path = "/userregister")
	public String doregister(@RequestParam Map<String, String> body, Model model) {
		try {
			User user = new User();
			// System.out.println(body);

			user.setUserName(body.get("username"));
			user.setUserPassword(body.get("password"));
			user.setUserAddress(body.get("address"));
			user.setUserContact(Long.parseLong(body.get("contact")));
			 user.setDept(UserDept.fromString(body.get("role")));
			if (body.get("batch") != null) {
				user.setUserBatch(body.get("batch"));
			}
			

			// System.out.println(UserDept.fromString(body.get("dept")));

			user.setDept(UserDept.fromString(body.get("dept")));

			
			System.out.println(user);
			this.us.addUser(user);
			model.addAttribute("msg", "success");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "userlogin";

	}
}
