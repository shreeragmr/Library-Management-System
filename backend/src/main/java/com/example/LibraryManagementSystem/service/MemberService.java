package com.example.LibraryManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryManagementSystem.entity.Member;
import com.example.LibraryManagementSystem.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository repository;

	public Member saveMember(Member m) {
		return repository.save(m);
	}

	public List<Member> getAllMember() {
		return repository.findAll();
	}

	public void deleteById(int id) {
		 repository.deleteById(id);
	}
	
	
}
