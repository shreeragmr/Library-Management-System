package com.example.LibraryManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryManagementSystem.entity.Transaction;
import com.example.LibraryManagementSystem.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository repository;

	public Transaction saveTransaction(Transaction t) {
		return repository.save(t);
	}

	public List<Transaction> getAllTransactions() {
		return repository.findAll();
	}

	public void deleteTransaction(int id) {
		repository.deleteById(id);
	}
}
