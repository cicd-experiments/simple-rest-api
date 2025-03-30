package ru.ddc.simplerestapi.dao;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import ru.ddc.simplerestapi.model.Todo;

import java.util.Optional;

/**
 * Class for asses to database.
 */
@Component
public final class TodoDao {
    /**
     * JdbcClient object.
     */
    private final JdbcClient client;

    /**
     * Constructor.
     * @param jdbcClient client object
     */
    public TodoDao(final JdbcClient jdbcClient) {
        this.client = jdbcClient;
    }

    /**
     * Get object by id.
     * @param id long
     * @return Todo object
     */
    public Optional<Todo> getTodoById(final Long id) {
        String sql = "select * from todos where id = ?";
        return client.sql(sql)
                .param(id)
                .query(Todo.class)
                .optional();
    }
}
