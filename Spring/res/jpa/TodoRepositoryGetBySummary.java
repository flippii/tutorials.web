package com.vogella.spring.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vogella.spring.jpa.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

	List<Todo> getBySummary(String summary);
}
