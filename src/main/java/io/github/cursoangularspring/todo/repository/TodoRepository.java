package io.github.cursoangularspring.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.cursoangularspring.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
	
	
	
}
