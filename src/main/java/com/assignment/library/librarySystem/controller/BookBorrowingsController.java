package com.assignment.library.librarySystem.controller;

import com.assignment.library.librarySystem.model.BookBorrowings;
import com.assignment.library.librarySystem.model.VideoReservation;
import com.assignment.library.librarySystem.service.BookBorrowingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookBorrowingsController {

    @Autowired
    private BookBorrowingsService bookBorrowingsService;

    @RequestMapping(method = RequestMethod.POST, value = "/addBookBorrowing")
    public void addBookBorrowing(@RequestBody BookBorrowings bookBorrowings){
        bookBorrowingsService.addBookBorrowing(bookBorrowings);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteBookBorrowing/{id}")
    public void deleteBookBorrowing(@PathVariable Integer id){
        bookBorrowingsService.deleteBookBorrowings(id);
    }

    @RequestMapping("/getAllVideoReservations")
    public List<BookBorrowings> getAllBookBorrowing(){
        return bookBorrowingsService.getAllBookBorrowings();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateBookBorrowing/{id}")
    public void updateBookBorrowing(@RequestBody BookBorrowings bookBorrowings, @PathVariable Integer id){
        bookBorrowingsService.updateBookBorrowing(bookBorrowings, id);
    }

}
