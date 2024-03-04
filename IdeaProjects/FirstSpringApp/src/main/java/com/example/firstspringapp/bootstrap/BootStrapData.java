package com.example.firstspringapp.bootstrap;

import com.example.firstspringapp.model.Author;
import com.example.firstspringapp.model.Book;
import com.example.firstspringapp.repos.AuthorRepo;
import com.example.firstspringapp.repos.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;

    public BootStrapData(AuthorRepo authorRepo, BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Author nate = new Author("Nate", "Edge", null);
        Book mybook = new Book("Pretend Book Title", "12567", null);
    }
}
