package com.likelion.todo_api;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private final TodoRepository repository;
    public TodoService(TodoRepository repository) { this.repository = repository; }

    public List<Todo> getAllTodos() { return repository.findAll(); }
    public Todo createTodo(Todo todo) { return repository.save(todo); }
    public void deleteTodo(Long id) { repository.deleteById(id); }
}