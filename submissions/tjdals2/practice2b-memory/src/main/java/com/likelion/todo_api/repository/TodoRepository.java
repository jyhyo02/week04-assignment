package com.likelion.todo_api.repository;

import com.likelion.todo_api.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}