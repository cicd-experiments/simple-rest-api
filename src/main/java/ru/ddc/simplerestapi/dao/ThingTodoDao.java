package ru.ddc.simplerestapi.dao;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import ru.ddc.simplerestapi.model.ThingTodo;

import java.util.Optional;

/**
 * Class for asses to database.
 */
@Component
public final class ThingTodoDao {
    /**
     * JdbcClient object.
     */
    private final JdbcClient client;

    /**
     * Constructor.
     * @param jdbcClient client object
     */
    public ThingTodoDao(final JdbcClient jdbcClient) {
        this.client = jdbcClient;
    }

    /**
     * Get object by id.
     * @param id long
     * @return ThingTodo object
     */
    public Optional<ThingTodo> getThingTodoById(final Long id) {
        String sql = "select * from todos where id = ?";
        return client.sql(sql)
                .param(id)
                .query(ThingTodo.class)
                .optional();
    }
}
