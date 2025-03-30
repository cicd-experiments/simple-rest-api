package ru.ddc.simplerestapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@AllArgsConstructor
@NoArgsConstructor
public class ThingTodo {
    /**
     * Identifier of ThingToDo model.
     */
    private Long id;
    /**
     * Name of ThingToDo model.
     */
    private String name;
    /**
     * Description of ThingToDo model.
     */
    private String description;
}
