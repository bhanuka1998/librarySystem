package com.assignment.library.librarySystem.controller;

import com.assignment.library.librarySystem.model.BookReservation;
import com.assignment.library.librarySystem.service.BookReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookReservationController {
    @Autowired
    BookReservationService bookReservationService;

    @RequestMapping(method = RequestMethod.POST, value = "/addBookReservation")
    public void addBookReservation(@RequestBody BookReservation bookReservation){
        bookReservationService.addBookReservation(bookReservation);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteBookReservation/{id}")
    public void deleteBookReservation(@PathVariable Integer id){
        bookReservationService.deleteBookReservation(id);
    }

    @RequestMapping("getAllBookReservations")
    public List<BookReservation> getAllBookReservations(){
        return bookReservationService.getAllBookReservations();
    }

}
