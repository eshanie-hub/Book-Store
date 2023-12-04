package com.Book.Bookapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Book.Bookapi.domain.Book;
import com.Book.Bookapi.service.BookService;

@SpringBootApplication
public class BookApiApplication implements CommandLineRunner{

	@Autowired
	private BookService service;
	public static void main(String[] args) {
		SpringApplication.run(BookApiApplication.class, args);
	}

	public void run(String... args) throws Exception{
		
	}
}

