package com.assignment.library.librarySystem.service;

import com.assignment.library.librarySystem.model.BookReservation;

import java.util.List;

public interface BookReservationService {
    void addBookReservation(BookReservation bookReservation);

    void deleteBookReservation(Integer id);

    List<BookReservation> getAllBookReservations();

    BookReservation getBookReservationByID(Integer id);

}
