package com.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@PostMapping(path="/home",consumes="application/json")
	public Suggest addNewSuggestions(@RequestBody Suggest sobj)
	{
		return this.ss.addSuggest(sobj);
	}
	@PutMapping("/home")
	public Suggest updateSuggestions(@RequestBody Suggest s)
	{
		return this.ss.updateSuggest(s);
	}
	@DeleteMapping("/home/{sid}")
	public ResponseEntity deleteSuggestion(@PathVariable String sid)
	{
		try {
			this.ss.deleteSuggest(Long.parseLong(sid));
			return new ResponseEntity<>(HttpStatus.OK);                                                                                                                                                                                                                                                                                                                                                                       
		}
		catch(Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
