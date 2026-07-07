package com.example.library;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class)) {
            BookService bookService = context.getBean(BookService.class);
            System.out.println(bookService.getWelcomeMessage());
        }
    }
}