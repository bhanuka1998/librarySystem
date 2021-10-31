package com.assignment.library.librarySystem.controller;

import com.assignment.library.librarySystem.model.Books;
import com.assignment.library.librarySystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.POST, value = "/addBook")
    public void addBook(@RequestBody Books books){
        bookService.addBook(books);
    }

    @RequestMapping("/getAllBooks")
    public List<Books> getAllBooks(){
        return bookService.getAllBooks();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateBook/{id}")
    public void updateBook(@PathVariable Integer id, @RequestBody Books books){
        bookService.updateBook(id, books);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteBook/{id}")
    public void deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
    }
}
