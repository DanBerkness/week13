package com.coderscampus.week13.web;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.week13.domain.User;
import com.coderscampus.week13.service.FileService;

@RestController
public class FileController {
	
	@Value("${superuser.username}")
	private String superuserUsername;
	
	@Value("${superuser.password}")
	private String superuserPassword;
	
	@Value("${superuser.name}")
	private String superuserName;
	
	@Autowired
	private User user;
	
	@Autowired
	FileService fileService;

	@GetMapping("/customer-data")
	public Integer customerID () {
		Integer genID = new Random().nextInt();
		return genID;
	}

	@GetMapping("/read-lines")
	public List<String> readLines() throws IOException {
		System.out.println(superuserUsername);
		System.out.println(superuserPassword);
		System.out.println(superuserName);
		return fileService.readFile();
	}

	@GetMapping("/homepage")
	public String welcomeMessage() {
		return "Welcome to my website!";
	}

	@PostMapping("/homepage/button")
	public String buttonPage() {
		return "You SENT DATA TO THE SITE AT THE /button END POINT!";
	}

	@GetMapping("/homepage/button")
	public String welcomeMessageButton() {
		return "Welcome to my website!";
	}
}
