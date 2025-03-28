package ru.ddc.simplerestapi.controller.dto;

import lombok.Data;

@Data
public class ThingTodoResponse {
    /**
     * Identifier of ThingToDo.
     */
    private Long id;
    /**
     * Name of ThingTodo.
     */
    private String name;
    /**
     * Description of ThingTodo.
     */
    private String description;
}
