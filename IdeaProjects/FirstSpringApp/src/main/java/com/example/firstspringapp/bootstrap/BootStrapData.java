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

        Author jk = new Author("JK", "Rowling");
        Book harryPotter = new Book("Harry Potter", "12344");

        jk.getBooks().add(harryPotter);
        harryPotter.getAuthors().add(jk);

        authorRepo.save(jk);
        bookRepo.save(harryPotter);

        Author nate = new Author("Nate", "Edge");
        Book myBook = new Book("Pretend Book", "12545");

        nate.getBooks().add(myBook);
        myBook.getAuthors().add(nate);

        authorRepo.save(nate);
        bookRepo.save(myBook);

        System.out.println("Started in BootStrap");
        System.out.println("Books in repository: " + bookRepo.count());

    }
}
