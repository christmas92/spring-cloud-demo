package com.chenyf.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("reply")
public class ReplyController {

	@Autowired
	private RestTemplate restTemplate;	
	
	@GetMapping
	public String reply() {
		return this.restTemplate.getForObject("http://localhost:9000/hello/say", String.class);
	}
}
