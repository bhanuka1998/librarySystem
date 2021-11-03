package com.assignment.library.librarySystem.serviceImpl;

import com.assignment.library.librarySystem.controller.VideoReservationController;
import com.assignment.library.librarySystem.model.VideoReservation;
import com.assignment.library.librarySystem.repository.VideoReservationRepository;
import com.assignment.library.librarySystem.service.VideoReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VideoReservationImpl implements VideoReservationService {

    @Autowired
    VideoReservationRepository videoReservationRepository;


    @Override
    public void addBookReservation(VideoReservation videoReservation) {
        videoReservationRepository.save(videoReservation);
    }

    @Override
    public void deleteBookReservation(Integer id) {
        videoReservationRepository.deleteById(id);
    }

    @Override
    public List<VideoReservation> getAllBookReservations() {
        List<VideoReservation> videoReservationList = new ArrayList<>();
        videoReservationRepository.findAll().forEach(videoReservationList::add);
        return videoReservationList;
    }

    @Override
    public VideoReservation getVideoReservationById(Integer id) {
        Optional<VideoReservation> vidRes = Optional.ofNullable(
                videoReservationRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID"))
        );
        VideoReservation videoReservation = vidRes.get();
        return videoReservation;
    }
}
