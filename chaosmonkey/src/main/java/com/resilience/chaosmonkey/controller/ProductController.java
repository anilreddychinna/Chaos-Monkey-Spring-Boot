package com.resilience.chaosmonkey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resilience.chaosmonkey.entity.Product;
import com.resilience.chaosmonkey.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/getall")
	public List<Product> getAllStudents() {
		List<Product> products = productService.findAll();
		return products;
	}

	@PostMapping("/createproduct")
	public String createStudent(@RequestBody Product student) {
		productService.save(student);
		return "sucess";
	}

}
