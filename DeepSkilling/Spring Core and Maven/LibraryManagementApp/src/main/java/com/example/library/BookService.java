package com.example.library;

public class BookService {

    private final String libraryName;

    public BookService(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getWelcomeMessage() {
        return "Welcome to " + libraryName + ", where books are always available!";
    }
}