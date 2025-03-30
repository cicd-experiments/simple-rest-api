package ru.ddc.simplerestapi.controller.dto;

import lombok.Data;

@Data
public class TodoResponse {
    /**
     * Identifier of Todo.
     */
    private Long id;
    /**
     * Name of Todo.
     */
    private String name;
    /**
     * Description of Todo.
     */
    private String description;
}
