package com.amdocs.restapiex.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class Config extends ResourceConfig {
	
	public Config() {
		// TODO Auto-generated constructor stub
		packages("com.amdocs.restapiex.resource");
		
	}

}
