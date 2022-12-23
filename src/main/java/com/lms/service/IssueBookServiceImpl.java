package com.lms.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dao.BookDao;
import com.lms.dao.IssueBookDao;
import com.lms.model.Book;
import com.lms.model.IssueBook;

@Service
public class IssueBookServiceImpl implements IssueBookService{
	
	@Autowired
	private IssueBookDao isdao;
	
	@Autowired
	private BookDao bdao;
	
	@Override
	public List<IssueBook> getAllIssuedBook() {
		return isdao.findAll();
	}
	
	@Override
	public IssueBook getFilteredIssueBook(Long issueId) {
		return isdao.findById(issueId).get();
	}
	
	
	@Override
	public IssueBook addNewBook(IssueBook issuedBook) {
		return isdao.save(issuedBook);
	}

	
	 @Override 
	 public List<IssueBook> todayIssuedBook(Date today) {
		 return isdao.findAllByIssuedate(today);
	}
	 
	 
	@Override
	public List<IssueBook> todayReturnedBook(Date today) {
		return isdao.findAllByReturnedDate(today);
	}

	@Override
	public List<IssueBook> todayDueBook(Date today) {
		return isdao.findAllByDueDate(today);
	}

	@Override
	public Book addBook(Book book) {
		return bdao.save(book);
	}
	
	
}
