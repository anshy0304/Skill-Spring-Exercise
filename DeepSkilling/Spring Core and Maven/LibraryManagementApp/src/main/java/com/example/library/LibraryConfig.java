package com.example.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {

    @Bean
    public String libraryName() {
        return "City Central Library";
    }

    @Bean
    public BookService bookService() {
        return new BookService(libraryName());
    }
}