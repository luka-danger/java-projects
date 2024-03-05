package com.example.firstspringapp.repos;

import com.example.firstspringapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
}
