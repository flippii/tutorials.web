package com.vogella.spring.first.di.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vogella.spring.first.di.ITodo;
import com.vogella.spring.first.di.Todo;


@Configuration
@ComponentScan(basePackages = { "com.vogella.spring.first.di" })
public class Config {

        @Bean
        public ITodo getTodo() {
        	ITodo todo = new Todo(0, "Spring DI");
        	todo.setDone(false);
        	todo.setDueDate(new Date());
        	return todo;
        }
}