package ru.ddc.simplerestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRestApiApplication {

    protected SimpleRestApiApplication() {}

    /**
     * Main class of application.
     * @param args input arguments of application
     */
    public static void main(final String[] args) {
        SpringApplication.run(SimpleRestApiApplication.class, args);
    }
}

