package com.likelion.todo_api.controller;

import com.likelion.todo_api.Todo;
import com.likelion.todo_api.TodoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final TodoService service;
    public TodoController(TodoService service) { this.service = service; }

    @GetMapping
    public List<Todo> list() { return service.getAllTodos(); }

    @PostMapping
    public Todo save(@RequestBody Todo todo) { return service.createTodo(todo); }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id) { service.deleteTodo(id); }
}