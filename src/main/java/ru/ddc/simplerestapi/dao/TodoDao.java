package ru.ddc.simplerestapi.dao;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import ru.ddc.simplerestapi.model.Todo;

import java.util.Optional;

@Component
public class TodoDao {
    private final JdbcClient jdbcClient;

    public TodoDao(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public Optional<Todo> getTodoById(Long id) {
        String sql = "select * from todos where id = ?";
        return jdbcClient.sql(sql)
                .param(id)
                .query(Todo.class)
                .optional();
    }
}
