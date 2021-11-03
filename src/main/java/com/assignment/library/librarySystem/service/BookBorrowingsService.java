package com.assignment.library.librarySystem.service;

import com.assignment.library.librarySystem.model.BookBorrowings;

import java.util.List;
import java.util.Optional;

public interface BookBorrowingsService {
    void addBookBorrowing(BookBorrowings bookBorrowings);

    void deleteBookBorrowings(Integer id);

    List<BookBorrowings> getAllBookBorrowings();

    BookBorrowings getBookBorrowingByID(Integer id);

    Optional<BookBorrowings> updateBookBorrowing(BookBorrowings bookBorrowings, Integer id);
}
