package com.chenyf.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("reply")
public class ReplyController {

	@Autowired
	private RestTemplate restTemplate;	
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	@GetMapping("")
	public String reply() {
		return this.restTemplate.getForObject("http://service-provider/hello/say", String.class);
	}
	
	@GetMapping("loadBalance")
	public void loadBalance() {
		ServiceInstance instance = loadBalancerClient.choose("service-provider");
		System.out.println(instance.getServiceId() + ":" + instance.getHost() + ":" + instance.getPort());
	}
}
