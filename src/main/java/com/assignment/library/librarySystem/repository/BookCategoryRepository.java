package com.assignment.library.librarySystem.repository;

import com.assignment.library.librarySystem.model.BookCategory;
import org.springframework.data.repository.CrudRepository;

public interface BookCategoryRepository extends CrudRepository<BookCategory, Integer> {
}
