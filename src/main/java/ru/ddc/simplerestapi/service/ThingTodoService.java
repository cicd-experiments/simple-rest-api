package ru.ddc.simplerestapi.service;

import org.springframework.stereotype.Service;
import ru.ddc.simplerestapi.dao.ThingTodoDao;
import ru.ddc.simplerestapi.model.ThingTodo;

@Service
public class ThingTodoService {
    /**
     * Dao object.
     */
    private final ThingTodoDao dao;

    /**
     * Constructor.
     * @param thingTodoDao dao object
     */
    public ThingTodoService(final ThingTodoDao thingTodoDao) {
        this.dao = thingTodoDao;
    }

    /**
     * Get by id method.
     * @param id identifier of object
     * @return ThingTodo object
     */
    public ThingTodo getThingTodoById(final Long id) {
        return dao.getThingTodoById(id).orElseThrow();
    }
}
