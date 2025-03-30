package ru.ddc.simplerestapi.service;

import org.springframework.stereotype.Service;
import ru.ddc.simplerestapi.dao.TodoDao;
import ru.ddc.simplerestapi.model.Todo;

@Service
public class TodoService {
    /**
     * Dao object.
     */
    private final TodoDao dao;

    /**
     * Constructor.
     * @param todoDao dao object
     */
    public TodoService(final TodoDao todoDao) {
        this.dao = todoDao;
    }

    /**
     * Get by id method.
     * @param id identifier of object
     * @return Todo object
     */
    public Todo getTodoById(final Long id) {
        return dao.getTodoById(id).orElseThrow();
    }
}
