package ru.ddc.simplerestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRestApiApplication {

    /**
     * Main class of application.
     * @param args input arguments of application
     */
    public static void main(final String[] args) {
        SpringApplication.run(SimpleRestApiApplication.class, args);
    }

    /**
     * Fix Utility classes should not have a public
     * or default constructor issue.
     */
    public void notForExecute() {
        throw new RuntimeException();
    }

}

