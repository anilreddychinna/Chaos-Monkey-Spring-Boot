package com.resilience.chaosmonkey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resilience.chaosmonkey.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/external")
@Slf4j
public class ExternalApiController {

	@Autowired
	private ProductService productService;

	@GetMapping("/todosdata")
	public String getTodosData() {
		String products = productService.getTodosData();
		return products;
	}

	@GetMapping("/usersdata")
	public String getUsersData() {
		String products = productService.getUserDataeData();
		return products;
	}
	
	@GetMapping("/postsdata")
	public String getPostsData() {
		String products = productService.getUserDataeData();
		return products;
	}
	

}
