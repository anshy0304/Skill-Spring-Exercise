package com.example.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookServiceTest {

    @Test
    void shouldExposeLibraryName() {
        BookService service = new BookService();
        assertEquals("City Central Library", service.getLibraryName());
    }
}
