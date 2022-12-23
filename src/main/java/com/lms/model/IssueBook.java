package com.lms.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tblIssueBook")
public class IssueBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long issueId;
	
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "book_id")
	private Book bookId;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date issuedate;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date returnDate;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date dueDate;
	
	@Column
	private Boolean isReturned = false;
	
	public IssueBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IssueBook(long issueId, Book bookId, Date issuedate, Date returnDate, Date dueDate) {
		super();
		this.issueId = issueId;
		this.bookId = bookId;
		this.issuedate = issuedate;
		this.returnDate = returnDate;
		this.dueDate = dueDate;
//		this.isReturned = isReturned;
	}

	public long getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public Book getBookId() {
		return bookId;
	}

	public void setBookId(Book bookId) {
		this.bookId = bookId;
	}

	public Date getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Boolean getIsReturned() {
		return isReturned;
	}

	public void setIsReturned(Boolean isReturned) {
		this.isReturned = isReturned;
	}
		
}
