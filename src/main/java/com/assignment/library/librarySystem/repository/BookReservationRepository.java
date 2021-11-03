package com.assignment.library.librarySystem.repository;

import com.assignment.library.librarySystem.model.BookReservation;
import org.springframework.data.repository.CrudRepository;

public interface BookReservationRepository extends CrudRepository<BookReservation, Integer> {
}
