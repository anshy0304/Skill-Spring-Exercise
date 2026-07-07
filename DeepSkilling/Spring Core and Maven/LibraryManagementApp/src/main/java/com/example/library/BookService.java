package com.example.library;

import org.springframework.stereotype.Component;

@Component
public class BookService {

    public String getLibraryName() {
        return "City Central Library";
    }
}