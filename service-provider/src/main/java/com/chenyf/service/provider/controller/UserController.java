package com.chenyf.service.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chenyf.service.provider.entity.User;

@RestController
@RequestMapping("user")
public class UserController {

	@GetMapping("{id}")
	public User getUser(@PathVariable Long id) {
		User user = new User();
		user.setId(id);
		user.setName("chen");
		user.setAge(18);
		return user;
	}
	
}
