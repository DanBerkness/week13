package com.coderscampus.week13.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileService {
	
	
	
	private String fileName;
	
	public FileService () {
//		Just so Spring does not get blocked.
	}
	
	public FileService (String fileName) {
		this.fileName = fileName;
	}

	public List<String> readFile () throws IOException {
		return Files.readAllLines(Paths.get(fileName));
	}

}
