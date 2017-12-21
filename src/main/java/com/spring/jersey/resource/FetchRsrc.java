package com.spring.jersey.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.jersey.service.FetchService;

@Service // can also use @Component
@Path("/fetch")
public class FetchRsrc {
	
	@Autowired
	@Qualifier("fetchService")
	private FetchService fetchService;

	@GET
	@Path("/getData")
	//@Produces("text/plain")
	@Produces("application/json")
	public String getData() {
		System.out.println("FetchRsrc :: getData");
		return fetchService.getData();
	}
	
	//http://localhost:8080/SpringJersey/rest/fetch/getData
	
	/*
	| @Component | generic stereotype for any Spring-managed component |
	| @Repository| stereotype for persistence layer                    |
	| @Service   | stereotype for service layer                        |
	| @Controller| stereotype for presentation layer (spring-mvc)      |
	*/
}
