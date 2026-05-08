package com.lion.todo_api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    // 모든 todo 목록 가져오기
    public List<TodoEntity> getAllTodos() {
        return todoRepository.findAll();
    }

    // id로 todo 조회
    public Optional<TodoEntity> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    // 새로운 todo 생성
    public TodoEntity createTodo(TodoEntity todo) {
        return todoRepository.save(todo);
    }

    // id와 일치하는 todo 갱신
    public TodoEntity updateTodo(Long id, TodoEntity todoDetails) {
        Optional<TodoEntity> optionalTodo = todoRepository.findById(id);
        if (optionalTodo.isPresent()) {
            TodoEntity todo = optionalTodo.get();
            if (todoDetails.getTitle() != null) {
                todo.setTitle(todoDetails.getTitle());
            }
            if (todoDetails.getDescription() != null) {
                todo.setDescription(todoDetails.getDescription());
            }
            todo.setCompleted(todoDetails.isCompleted());
            return todoRepository.save(todo);
        }
        return null;
    }

    // todo 삭제
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
