package com.example.library;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class)) {
            LibraryService libraryService = context.getBean(LibraryService.class);
            System.out.println(libraryService.getWelcomeMessage());
        }
    }
}