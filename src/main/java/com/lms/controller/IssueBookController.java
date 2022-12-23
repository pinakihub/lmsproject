package com.lms.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.model.Book;
import com.lms.model.IssueBook;
import com.lms.service.IssueBookService;

@RestController
public class IssueBookController {
	
	@Autowired
	private IssueBookService isb;
	
	@GetMapping("/allIssueBooks")
	public List<IssueBook> allIsssuedBook(){
		return this.isb.getAllIssuedBook();
	}
	
	@GetMapping("/issueBooks/{issueId}")
	public IssueBook filteredIssuedBook(long issueId){
		return this.isb.getFilteredIssueBook(issueId);
	}
	
	@PostMapping("/addIssuebooks")
	public IssueBook addIssueBook(@RequestBody IssueBook issuebook) {
		return this.isb.addNewBook(issuebook);
	}
	
	@GetMapping("/issuedBooks")
	public List<IssueBook> showIssuedBooks(String today){
		
		
		try {
			Date issueDate = new SimpleDateFormat("yyyy-MM-dd").parse(today);
			return this.isb.todayIssuedBook(issueDate);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/returnedBooks")
	public List<IssueBook> showReturnedBooks(String today){
		try {
			Date returnDate = new SimpleDateFormat("yyyy-MM-dd").parse(today);
			return this.isb.todayReturnedBook(returnDate);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/dueBooks")
	public List<IssueBook> showDueBooks(String today){
		try {
			Date dueDate = new SimpleDateFormat("yyyy-MM-dd").parse(today);
			return this.isb.todayReturnedBook(dueDate);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@PostMapping("/addbooks")
	public Book addBook(@RequestBody Book book) {
		return this.isb.addBook(book);
	}
	
	

}
