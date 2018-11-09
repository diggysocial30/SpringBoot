package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/books")
	public List<Book> getBooks() {
		System.out.println("Yayyayay");
		return null;

	}

	@PostMapping("/book")
	public void addBook() {

	}

	@DeleteMapping("/book")
	public void deleteBook() {

	}

}
