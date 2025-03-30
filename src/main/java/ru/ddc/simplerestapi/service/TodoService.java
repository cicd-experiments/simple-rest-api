package ru.ddc.simplerestapi.service;

import org.springframework.stereotype.Service;
import ru.ddc.simplerestapi.dao.TodoDao;
import ru.ddc.simplerestapi.model.Todo;

@Service
public class TodoService {
    private final TodoDao todoDao;

    public TodoService(TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    public Todo getTodoById(Long id) {
        return todoDao.getTodoById(id).orElseThrow();
    }
}
