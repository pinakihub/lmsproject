package com.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lms.dao.SuggestDao;
import com.lms.model.Suggest;
import com.lms.service.SuggestService;

@Controller
public class SuggestController {
	@Autowired(required = false)
	private SuggestService ss;

	@RequestMapping("/home")
	public String getSuggestion() {
		return "register";
	}

}
