package com.assignment.library.librarySystem.serviceImpl;

import com.assignment.library.librarySystem.model.BookReservation;
import com.assignment.library.librarySystem.repository.BookReservationRepository;
import com.assignment.library.librarySystem.service.BookReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookReservationServiceImpl implements BookReservationService {
    @Autowired
    BookReservationRepository bookReservationRepository;

    @Override
    public void addBookReservation(BookReservation bookReservation) {
        bookReservationRepository.save(bookReservation);
    }

    @Override
    public void deleteBookReservation(Integer id) {
        bookReservationRepository.deleteById(id);
    }

    @Override
    public List<BookReservation> getAllBookReservations() {
        List<BookReservation> bookReservationList = new ArrayList<>();
        bookReservationRepository.findAll().forEach(bookReservationList::add);
        return bookReservationList;
    }

    @Override
    public BookReservation getBookReservationByID(Integer id) {
        Optional<BookReservation> bkr = Optional.ofNullable(
                bookReservationRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID"))
        );
        BookReservation bookReservation = bkr.get();
        return bookReservation;
    }

}
