package com.lms.service;

import java.util.Date;
import java.util.List;

import com.lms.model.Book;
import com.lms.model.IssueBook;

public interface IssueBookService {

	public List<IssueBook> getAllIssuedBook();

	public IssueBook getFilteredIssueBook(Long issueId);

	public IssueBook addNewBook(IssueBook issuedBook);

	public List<IssueBook> todayIssuedBook(Date today);
	public List<IssueBook> todayReturnedBook(Date today);
	public List<IssueBook> todayDueBook(Date today);

	public Book addBook(Book book);

}
