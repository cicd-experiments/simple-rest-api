package ru.ddc.simplerestapi.controller;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.ddc.simplerestapi.controller.dto.TodoResponse;
import ru.ddc.simplerestapi.model.Todo;
import ru.ddc.simplerestapi.service.TodoService;

@RestController
public class TodoController {
    private final TodoService todoService;
    private final ModelMapper mapper;

    public TodoController(TodoService todoService,
                          ModelMapper modelMapper) {
        this.todoService = todoService;
        this.mapper = modelMapper;
    }

    @GetMapping("/todos/{id}")
    public ResponseEntity<TodoResponse> getTodoById(@PathVariable Long id) {
        Todo todo = todoService.getTodoById(id);
        return ResponseEntity.ok(mapper.map(todo, TodoResponse.class));
    }
}
