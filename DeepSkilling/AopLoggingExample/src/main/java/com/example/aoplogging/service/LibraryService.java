package com.example.aoplogging.service;

import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    public String getBookInfo(String title) {
        return "Book: " + title;
    }
}
