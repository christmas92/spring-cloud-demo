package com.chenyf.service.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.chenyf.service.consumer.entity.User;

@FeignClient("service-provider")
public interface UserFeignClient {

	//@RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	@GetMapping("user/{id}")
	public User getTeamUserById(@PathVariable("id") Long id);
	
}
