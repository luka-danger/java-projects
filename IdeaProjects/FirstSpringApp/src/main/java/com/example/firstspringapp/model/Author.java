package com.example.firstspringapp.model;

import java.util.Set;

public class Author {
    private String firstName;
    private String lastName;
    private Set<Book> books;

    // Constructor
    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

}
