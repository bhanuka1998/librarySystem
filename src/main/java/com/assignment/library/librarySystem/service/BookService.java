package com.assignment.library.librarySystem.service;

import com.assignment.library.librarySystem.model.Books;

import java.util.List;
import java.util.Optional;

public interface BookService {
    void addBook(Books books);

    List<Books> getAllBooks();

    Optional<Books> updateBook(Integer id, Books books);

    void deleteBook(Integer id);

    Books getBookById(Integer id);
}
