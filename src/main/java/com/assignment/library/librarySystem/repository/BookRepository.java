package com.assignment.library.librarySystem.repository;

import com.assignment.library.librarySystem.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books, Integer> {
}
