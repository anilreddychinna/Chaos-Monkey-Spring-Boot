package com.resilience.chaosmonkey.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resilience.chaosmonkey.entity.Product;
import com.resilience.chaosmonkey.util.ApiClient;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ApiClient apiClient;

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
		// String resp= apiClient.getListOfBookPublicApi();
		return list;
	}

	@Override
	public String getUserDataeData() {
		String liveData = apiClient.getUsersData();
		return liveData;
	}

	@Override
	public String getTodosData() {
		String liveData = apiClient.getTodosData();
		return liveData;
	}

	@Override
	public String getPostsData() {
		String liveData = apiClient.getPostsData();
		return liveData;
	}

}
