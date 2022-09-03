package com.resilience.chaosmonkey.util;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ApiClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApiClient.class);

	@Autowired
	RestTemplate restTemplate;

	public String getListOfBookPublicApi() {

		LOGGER.info("Start getListOfBookPublicApi ");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<Object> entity = new HttpEntity<Object>("hi", headers);

		String responce = restTemplate
				.exchange("https://jsonplaceholder.typicode.com/todos", HttpMethod.GET, entity, String.class).getBody();
		LOGGER.info("Responce Data : {}", responce);
		LOGGER.info("End getListOfBookPublicApi ");

		return responce;

	}

	public String getTodosData() {
		LOGGER.info("Start getTodosData ");

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<Object> entity = new HttpEntity<Object>("hi", headers);

		String responce = restTemplate
				.exchange("https://jsonplaceholder.typicode.com/todos", HttpMethod.GET, entity, String.class).getBody();

		LOGGER.info("Responce Data : {}", responce);
		LOGGER.info("End getTodosData ");
		return responce;

	}

	public String getUsersData() {

		LOGGER.info("Start getUsersData ");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<Object> entity = new HttpEntity<Object>("", headers);

		String responce = restTemplate
				.exchange("https://jsonplaceholder.typicode.com/users", HttpMethod.GET, entity, String.class).getBody();

		LOGGER.info("Responce Data : {}", responce);
		LOGGER.info("End getUsersData ");

		return responce;
	}

	public String getPostsData() {

		LOGGER.info("Start getPostsData ");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<Object> entity = new HttpEntity<Object>("", headers);

		String responce = restTemplate
				.exchange("https://jsonplaceholder.typicode.com/posts", HttpMethod.GET, entity, String.class).getBody();

		LOGGER.info("Responce Data : {}", responce);
		LOGGER.info("End getPostsData ");

		return responce;
	}

}
