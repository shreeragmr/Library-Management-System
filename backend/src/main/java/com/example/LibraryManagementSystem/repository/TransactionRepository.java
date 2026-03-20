package com.example.LibraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagementSystem.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
