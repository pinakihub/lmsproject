package com.lms.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lms.model.Books;
import com.lms.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookservice;

	@GetMapping("/addbook")
	public String addBook() {

		return "form";

	}

	@PostMapping("/doaddbook")
	public String doaddBook(@RequestParam Map<String, String> body, Model model) {
		try {
			Books books = new Books();
			books.setBookId(Long.parseLong(body.get("bookId")));
			books.setBookTitle(body.get("bookTitle"));
			books.setBookAuthor(body.get("bookAuthor"));
			books.setBookCount(Long.parseLong(body.get("bookCount")));
			books.setBookSubject(body.get("bookSubject"));
			books.setBookGenre(body.get("bookGenre"));
			this.bookservice.addBook(books);
			model.addAttribute("msg", "Success");

		} catch (Exception ex) {
			model.addAttribute("msg", "Failed");

			System.out.println(ex);
		}

		return "form";

	}

	@PutMapping("/updatebook")
	public String updateBook(@Validated Books book) {
		if (book.getBookId() == null) {

			return "/books/bookform";
		} else {
			bookservice.updateBooks(book);

			return "addBook";
		}
	}

	@DeleteMapping("/deletebook/{bid}")
	public String deleteBook(@PathVariable("bid") long bid) {
		bookservice.deleteBooks(bid);
		return "deleted";
	}

	@GetMapping("/allbook")
	public String getAllBooks() {

		return "/showbook";

	}

	@GetMapping("/{bid}")
	public String getBook(@PathVariable("bid") Long bid) {

		return "/showbook";
	}

}
