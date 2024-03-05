package com.example.firstspringapp.repos;

import com.example.firstspringapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {

}
