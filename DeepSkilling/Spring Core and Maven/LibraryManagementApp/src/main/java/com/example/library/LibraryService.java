package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    private final BookService bookService;

    @Autowired
    public LibraryService(BookService bookService) {
        this.bookService = bookService;
    }

    public String getWelcomeMessage() {
        return "Welcome to " + bookService.getLibraryName() + ", where books are always available!";
    }
}
