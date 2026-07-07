package com.example.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookServiceTest {

    @Test
    void shouldReturnWelcomeMessage() {
        BookService service = new BookService("City Central Library");
        assertEquals("Welcome to City Central Library, where books are always available!", service.getWelcomeMessage());
    }
}
