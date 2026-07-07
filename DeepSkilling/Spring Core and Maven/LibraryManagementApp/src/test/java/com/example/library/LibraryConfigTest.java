package com.example.library;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class LibraryConfigTest {

    @Test
    void shouldLoadAnnotatedBeansFromComponentScan() {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class)) {
            LibraryService libraryService = context.getBean(LibraryService.class);
            BookService bookService = context.getBean(BookService.class);

            assertNotNull(libraryService);
            assertNotNull(bookService);
            assertEquals(
                "Welcome to City Central Library, where books are always available!",
                libraryService.getWelcomeMessage()
            );
        }
    }
}