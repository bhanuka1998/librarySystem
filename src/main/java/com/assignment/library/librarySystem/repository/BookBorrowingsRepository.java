package com.assignment.library.librarySystem.repository;

import com.assignment.library.librarySystem.model.BookBorrowings;
import org.springframework.data.repository.CrudRepository;

public interface BookBorrowingsRepository extends CrudRepository<BookBorrowings, Integer> {
}
