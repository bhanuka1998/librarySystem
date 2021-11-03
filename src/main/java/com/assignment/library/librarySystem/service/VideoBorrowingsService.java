package com.assignment.library.librarySystem.service;

import com.assignment.library.librarySystem.model.BookBorrowings;
import com.assignment.library.librarySystem.model.VideoBorrowings;

import java.util.List;
import java.util.Optional;

public interface VideoBorrowingsService {
    void addVideoBorrowing(VideoBorrowings videoBorrowings);

    void deleteVideoBorrowing(Integer id);

    List<VideoBorrowings> getAllVideoBorrowings();

    Optional<VideoBorrowings> updateVideoBorrowing(VideoBorrowings videoBorrowings, Integer id);

    VideoBorrowings getAllVideoBorrowingsByID(Integer id);
}
