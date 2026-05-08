package com.lion.todo_api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    // GET /api/todos - 모든 todo 목록 가져오기
    @GetMapping
    public ResponseEntity<List<TodoEntity>> getAllTodos() {
        List<TodoEntity> todos = todoService.getAllTodos();
        return ResponseEntity.ok(todos);
    }

    // GET /api/todos/{id} - id로 특정 todo 조회
    @GetMapping("/{id}")
    public ResponseEntity<?> getTodoById(@PathVariable Long id) {
        Optional<TodoEntity> todo = todoService.getTodoById(id);
        if (todo.isPresent()) {
            return ResponseEntity.ok(todo.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{ \"error\": \"Todo not found\" }");
        }
    }

    // POST /api/todos - 새로운 todo 생성
    @PostMapping
    public ResponseEntity<TodoEntity> createTodo(@RequestBody TodoEntity todo) {
        TodoEntity createdTodo = todoService.createTodo(todo);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTodo);
    }

    // PUT /api/todos/{id} - todo 내용 갱신
    @PutMapping("/{id}")
    public ResponseEntity<?> updateTodo(@PathVariable Long id, @RequestBody TodoEntity todoDetails) {
        TodoEntity updatedTodo = todoService.updateTodo(id, todoDetails);
        if (updatedTodo != null) {
            return ResponseEntity.ok(updatedTodo);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{ \"error\": \"Todo not found\" }");
        }
    }

    // DELETE /api/todos/{id} - todo 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTodo(@PathVariable Long id) {
        Optional<TodoEntity> todo = todoService.getTodoById(id);
        if (todo.isPresent()) {
            todoService.deleteTodo(id);
            return ResponseEntity.ok("{ \"message\": \"Todo deleted successfully\" }");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{ \"error\": \"Todo not found\" }");
        }
    }
}
