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
    /**
     * Service for Todo.
     */
    private final TodoService service;
    /**
     * Model mapper.
     */
    private final ModelMapper mapper;

    /**
     * Controller constructor.
     * @param todoService service object
     * @param modelMapper mapper object
     */
    public TodoController(final TodoService todoService,
                          final ModelMapper modelMapper) {
        this.service = todoService;
        this.mapper = modelMapper;
    }

    /**
     * Get TodoResponse by id.
     * @param id identifier of object
     * @return ResponseEntity
     */
    @GetMapping("/todos/{id}")
    public ResponseEntity<TodoResponse> getTodoById(
            @PathVariable final Long id) {
        Todo todo = service.getTodoById(id);
        return ResponseEntity.ok(mapper.map(todo, TodoResponse.class));
    }
}
