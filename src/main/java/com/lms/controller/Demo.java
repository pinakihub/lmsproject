package com.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class Demo {
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
}
