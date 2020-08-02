package com.example.springbootzuulapigatwaybook;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootZuulapigatwayBookApplication {

	@RequestMapping(value = "/echoBookName/{name}")
	public String echoBookName(@PathVariable(name = "name") String name) {
		return "Hello  " + name + " Responsed on : " + new Date();
	}

	@RequestMapping(value = "/getBookDetails/{name}")
	public Book getBookDetails(@PathVariable(name = "name") String name) {
		return new Book(name, "Pune", "MCA");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulapigatwayBookApplication.class, args);
	}
}

class Book {
	String name;
	String title;
	String author;

	public Book(String name, String title, String author) {
		super();
		this.name = name;
		this.title = title;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

}
