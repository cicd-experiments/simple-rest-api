package ru.ddc.simplerestapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    /**
     * Identifier of model.
     */
    private Long id;
    /**
     * Name of model.
     */
    private String name;
    /**
     * Description of model.
     */
    private String description;
}
