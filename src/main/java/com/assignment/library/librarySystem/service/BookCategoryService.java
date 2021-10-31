package com.assignment.library.librarySystem.service;

import com.assignment.library.librarySystem.model.BookCategory;

import java.util.List;
import java.util.Optional;

public interface BookCategoryService {
    void addBookCategory(BookCategory bookCategory);

    List<BookCategory> getAllBookCategories();

    Optional<BookCategory> updateBookCategory(Integer id, BookCategory bookCategory);

    BookCategory getBookCategoryByID(Integer id);

    void deleteBookCategory(Integer id);
}
