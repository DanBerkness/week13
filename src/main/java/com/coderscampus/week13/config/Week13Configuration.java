package com.coderscampus.week13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coderscampus.week13.domain.User;
import com.coderscampus.week13.service.FileService;

@Configuration
public class Week13Configuration {
	
	@Bean
	public FileService fileService () {
		return new FileService("test.txt");
	}
	
	@Bean
	public User user () {
		return new User("dan@fun.com","password", "Dan");
	}
}
