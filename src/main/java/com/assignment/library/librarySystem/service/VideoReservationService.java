package com.assignment.library.librarySystem.service;

import com.assignment.library.librarySystem.model.VideoReservation;

import java.util.List;
import java.util.Optional;

public interface VideoReservationService {
    void addBookReservation(VideoReservation videoReservation);

    void deleteBookReservation(Integer id);

    List<VideoReservation> getAllBookReservations();

    VideoReservation getVideoReservationById(Integer id);
}
