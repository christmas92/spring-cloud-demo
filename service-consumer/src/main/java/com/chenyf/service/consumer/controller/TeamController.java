package com.chenyf.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chenyf.service.consumer.client.UserFeignClient;
import com.chenyf.service.consumer.entity.User;

@RestController
@RequestMapping("team")
public class TeamController {

	@Autowired
	private UserFeignClient userFeignClient;
	
	@GetMapping("user/{id}")
	public User getTeamUser(@PathVariable Long id) {
		return userFeignClient.getTeamUserById(id);
	}
	
}
