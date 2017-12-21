package com.spring.jersey.service;

import org.springframework.stereotype.Component;

@Component("fetchService")
public class FetchServiceImpl implements FetchService {

	@Override
	public String getData() {
		return "{\"value\":\"hola\"}";
	}

}
