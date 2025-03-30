package ru.ddc.simplerestapi.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    /**
     * Method for configure ModelMapper.
     * @return configured ModelMapper object
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
