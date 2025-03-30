package ru.ddc.simplerestapi.controller.dto;

import lombok.Data;

@Data
public class TodoResponse {
    private Long id;
    private String name;
    private String description;
}
