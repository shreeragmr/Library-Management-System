package com.example.LibraryManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryManagementSystem.repository.BookRepository;
import com.example.LibraryManagementSystem.entity.Book;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	public Book save(Book book) {
		return repository.save(book);
	}

	public List<Book> getAll() {
		return repository.findAll();
	}

	public void deleteById(int id) {
		repository.deleteById(id);
	}
}
