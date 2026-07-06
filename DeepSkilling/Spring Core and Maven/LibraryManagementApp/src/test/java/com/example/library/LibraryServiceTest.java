package com.example.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryServiceTest {

    @Test
    void shouldReturnWelcomeMessage() {
        LibraryService service = new LibraryService();
        assertEquals("Library management application is ready!", service.getWelcomeMessage());
    }
}
