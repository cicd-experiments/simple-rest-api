package ru.ddc.simplerestapi;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NoArgsConstructor(access= AccessLevel.PRIVATE)
public class SimpleRestApiApplication {

    /**
     * Main class of application.
     * @param args input arguments of application
     */
    public static void main(final String[] args) {
        SpringApplication.run(SimpleRestApiApplication.class, args);
    }

}

