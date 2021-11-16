package com.assignment.library.librarySystem.serviceImpl;

import com.assignment.library.librarySystem.model.BookCategory;
import com.assignment.library.librarySystem.model.Books;
import com.assignment.library.librarySystem.repository.BookRepository;
import com.assignment.library.librarySystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void addBook(Books books) {
        bookRepository.save(books);
    }

    @Override
    public List<Books> getAllBooks() {
        List<Books> booksList = new ArrayList<>();
        bookRepository.findAll().forEach(booksList::add);
        return booksList;
    }

    @Override
    @Transactional
    public Optional<Books> updateBook(Integer id, Books books) {
        return bookRepository.findById(id).map(
                e ->{
                    e.setbName(books.getbName());
                    e.setIsbn(books.getIsbn());
                    e.setbPrice(books.getbPrice());
                    e.setNoOfCopies(books.getNoOfCopies());
                    return e;
                }
        );
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Books getBookById(Integer id) {
        Optional<Books> book = Optional.ofNullable(
                bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID"))
        );
        Books books = book.get();
        return books;
    }
}
