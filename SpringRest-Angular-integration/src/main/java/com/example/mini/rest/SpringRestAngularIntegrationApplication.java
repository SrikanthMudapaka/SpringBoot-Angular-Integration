package com.example.mini.rest;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mini.rest.model.Books;

@SpringBootApplication
@RestController
public class SpringRestAngularIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestAngularIntegrationApplication.class, args);
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/books")
	public Stream<Books> getAllbooks() {
		return Stream.of(new Books(12, "tom", "tom@gmail.com", "9911991100","1", new Date()),
				new Books(13, "jerry", "jerry@gmail.com", "8811881192","0",new Date()),
				new Books(14, "pan", "pan@gmail.com", "9943434344","1",new Date()),
				new Books(15, "ben", "ben@gmail.com", "9000000000","0",new Date()));
	}

}
