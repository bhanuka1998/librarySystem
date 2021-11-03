package com.assignment.library.librarySystem.repository;

import com.assignment.library.librarySystem.model.VideoReservation;
import org.springframework.data.repository.CrudRepository;

public interface VideoReservationRepository extends CrudRepository<VideoReservation, Integer> {
}
