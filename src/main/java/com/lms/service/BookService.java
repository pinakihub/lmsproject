package com.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dao.BookDao;
import com.lms.model.Books;

@Service
public class BookService {
	
	@Autowired
	private BookDao bdao;
	
	public Books addBook(Books book) {
		return bdao.save(book);
	}
	public Long deleteBooks(Long bid) {
		bdao.deleteById(bid);
		return bid;
	}
	public Books updateBooks(Books book) {
		return bdao.save(book);
	}
	public Books getBooks(Long bid) {
		return bdao.getOne(bid);
	}
	public List<Books> getAllBooks(Books book) {
		return bdao.findAll();
	}

}
