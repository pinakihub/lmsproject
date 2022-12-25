package com.lms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblBook")
public class Books {
	@Id
	@Column(name="BookId")
	private Long bookId;
	@Column(name="BookTitle")
	private String bookTitle;
	@Column(name="BookAuthor")
	private String bookAuthor;
	@Column(name="BookCount")
	private Long bookCount;
	@Column(name="BookSubject")
	private String bookSubject;
	@Column(name="BookGenre")
	private String bookGenre;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(Long bookId, String bookTitle, String bookAuthor, Long bookCount, String bookSubject,
			String bookGenre) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookCount = bookCount;
		this.bookSubject = bookSubject;
		this.bookGenre = bookGenre;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Long getBookCount() {
		return bookCount;
	}

	public void setBookCount(Long bookCount) {
		this.bookCount = bookCount;
	}

	public String getBookSubject() {
		return bookSubject;
	}

	public void setBookSubject(String bookSubject) {
		this.bookSubject = bookSubject;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookCount="
				+ bookCount + ", bookSubject=" + bookSubject + ", bookGenre=" + bookGenre + "]";
	}

}
