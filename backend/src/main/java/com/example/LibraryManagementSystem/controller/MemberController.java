package com.example.LibraryManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryManagementSystem.entity.Member;
import com.example.LibraryManagementSystem.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	private MemberService service;
	
	@PostMapping("/saveMember")
	public Member saveMember(@RequestBody Member m) {
		return service.saveMember(m);
	}
	
	@GetMapping("/getAllMembers")
	public List<Member> getAllMember(){
		return service.getAllMember();
	}
	
	@DeleteMapping("/deleteMember/{id}")
	public String deleteById(@PathVariable int id) {
		 service.deleteById(id);
		 return "Record Deleted.";
	}
}
