package com.izaquiel.sistemaIz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.izaquiel.sistemaIz.services.DBservices;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBservices dbService;
	
	@Bean
	public void instaciaDB() {
		this.dbService.instaciaDb();

		

	}

}
