package com.example.LibraryManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryManagementSystem.service.BookService;
import com.example.LibraryManagementSystem.entity.Book;

@RestController
public class BookController {

	@Autowired
	private BookService service;
	
	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book) {
		return service.save(book);
	}
	
	@GetMapping("/getAll")
	public List<Book> getAll(){
		return service.getAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		 service.deleteById(id);
		 return "Record Deleted.";
	}
}
