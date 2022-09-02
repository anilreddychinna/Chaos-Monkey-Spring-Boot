package com.resilience.chaosmonkey.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.resilience.chaosmonkey.entity.Product;

@Component
public interface ProductService {

	public Product save(Product student);

	public Product update(Product student);

	public List<Product> findAll();
	
}
