package com.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dao.BookDao;
import com.lms.model.Book;

@Service
public class BookService {
	
	@Autowired
	private BookDao bdao;
	
	public Book addBook(Book book) {
		return bdao.save(book);
	}
	public Long deleteBooks(Long bid) {
		bdao.deleteById(bid);
		return bid;
	}
	public Book updateBooks(Book book) {
		return bdao.save(book);
	}
	public Book getBooks(Long bid) {
		return bdao.getOne(bid);
	}
	public List<Book> getAllBooks(Book book) {
		return bdao.findAll();
	}

}
