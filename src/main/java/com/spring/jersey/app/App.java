package com.spring.jersey.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.spring.jersey.resource.FetchRsrc;

@ApplicationPath("resources")
public class App extends Application {
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(FetchRsrc.class);
		return s;
	}

}
