package com.vogella.spring.jpa;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vogella.spring.jpa.repository.TodoRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner jpaSample(TodoRepository todoRepo) {
		return (args) -> {
			
			// save 2 todos in the H2 database
			todoRepo.save(new Todo("Test"));

			Todo todo = new Todo("Detailed test");
			todo.setDueDate(new Date());
			todo.setDescription("Detailed description");
			todoRepo.save(todo);

			// query for all todos in the H2 database and print them
			todoRepo.findAll().forEach(System.out::println);
		};
	}
}
