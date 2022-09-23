package com.example.SHHHH_Quiz_Game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ShhhhQuizGameApplicationTests {
	@Autowired
	userRepositoryDatabase repository;
	@Autowired
	SecurityConfig secCon;

	@Test
	void contextLoads() {
	}

	@Test
	void addUser(){
		User users = new User("test","test");
		repository.save(users);
		Assertions.assertEquals("test",repository.findByUsername("test").get(0).getUsername());
	}

	@Test
	void springSecUser (){
		User user = new User("test","test");
		secCon.userDetailsService("test", "user.getPassword()");
	}
}
