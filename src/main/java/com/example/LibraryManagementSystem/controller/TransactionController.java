package com.example.LibraryManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryManagementSystem.entity.Transaction;
import com.example.LibraryManagementSystem.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService service;
	
	@PostMapping("/saveTransaction")
	public Transaction saveTransaction(@RequestBody Transaction t) {
		return service.saveTransaction(t);
	}
	
	@GetMapping("/getAllTransactions")
	public List<Transaction> getAllTransations(){
		return service.getAllTransactions();
	}
	
	@DeleteMapping("/deleteTransaction/{id}")
	public String deleteById(@PathVariable int id) {
		service.deleteTransaction(id);
		return "Transaction Deleted";
	}
}
