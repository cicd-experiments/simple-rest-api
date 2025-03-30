package ru.ddc.simplerestapi.controller;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.ddc.simplerestapi.controller.dto.ThingTodoResponse;
import ru.ddc.simplerestapi.model.ThingTodo;
import ru.ddc.simplerestapi.service.ThingTodoService;

@RestController
public class ThingTodoController {
    /**
     * Service for ThingTodo.
     */
    private final ThingTodoService service;
    /**
     * Model mapper.
     */
    private final ModelMapper mapper;

    /**
     * Controller constructor.
     * @param thingTodoService service object
     * @param modelMapper mapper object
     */
    public ThingTodoController(final ThingTodoService thingTodoService,
                               final ModelMapper modelMapper) {
        this.service = thingTodoService;
        this.mapper = modelMapper;
    }

    /**
     * Get TodoResponse by id.
     * @param id identifier of object
     * @return ResponseEntity
     */
    @GetMapping("/todos/{id}")
    public ResponseEntity<ThingTodoResponse> getThingTodoById(
            @PathVariable final Long id) {
        ThingTodo thingTodo = service.getThingTodoById(id);
        return ResponseEntity.ok(mapper.map(
                thingTodo,
                ThingTodoResponse.class
        ));
    }
}
