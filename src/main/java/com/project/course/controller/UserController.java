package com.project.course.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "Maria@gmail.com", "1111-2222", "abc");
		return ResponseEntity.ok().body(u);
	}

}
