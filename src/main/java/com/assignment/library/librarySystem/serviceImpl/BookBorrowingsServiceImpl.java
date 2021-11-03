package com.assignment.library.librarySystem.serviceImpl;

import com.assignment.library.librarySystem.model.BookBorrowings;
import com.assignment.library.librarySystem.repository.BookBorrowingsRepository;
import com.assignment.library.librarySystem.service.BookBorrowingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookBorrowingsServiceImpl implements BookBorrowingsService {

    @Autowired
    BookBorrowingsRepository bookBorrowingsRepository;

    @Override
    public void addBookBorrowing(BookBorrowings bookBorrowings) {
        bookBorrowingsRepository.save(bookBorrowings);
    }

    @Override
    public void deleteBookBorrowings(Integer id) {
        bookBorrowingsRepository.deleteById(id);
    }

    @Override
    public List<BookBorrowings> getAllBookBorrowings() {
        List<BookBorrowings> bookBorrowingsList = new ArrayList<>();
        bookBorrowingsRepository.findAll().forEach(bookBorrowingsList :: add);
        return bookBorrowingsList;
    }

    @Override
    public BookBorrowings getBookBorrowingByID(Integer id) {
        Optional<BookBorrowings> bkBorrow = Optional.ofNullable(
                bookBorrowingsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID"))
        );
        BookBorrowings bookBorrowings = bkBorrow.get();
        return bookBorrowings;
    }

    @Override
    @Transactional
    public Optional<BookBorrowings> updateBookBorrowing(BookBorrowings bookBorrowings, Integer id) {
        return bookBorrowingsRepository.findById(id).map(e -> {
            e.setStatus(bookBorrowings.getStatus());
            return e;
        });
    }

}
