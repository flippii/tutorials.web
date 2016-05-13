package com.vogella.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vogella.ITodo;
import com.vogella.Todo;

@Configuration
@ComponentScan(basePackages = { "com.vogella" })
public class Config {

	@Bean
	@Primary
	public ITodo getTodo() {
		return new Todo(0, "Spring DI", "Spring DI and IOC", false, new Date());
	}
}
