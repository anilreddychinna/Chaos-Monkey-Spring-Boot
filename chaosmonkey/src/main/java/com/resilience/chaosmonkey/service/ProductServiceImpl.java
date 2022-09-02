package com.resilience.chaosmonkey.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.resilience.chaosmonkey.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	public Product save(Product product) {
		Product createResponse = product;
		return createResponse;
	}

	public Product update(Product product) {
		Product updateResponse = product;
		return updateResponse;
	}

	@Override
	public List<Product> findAll() {

		List<Product> list = new ArrayList<Product>();
		Product p = new Product();
		p.setId(1212L);
		p.setName("item1");
		p.setPrice("100.0");

		list.add(p);
		list.add(p);
		list.add(p);
		list.add(p);
		list.add(p);
		list.add(p);

		return list;
	}

}
