package com.assignment.library.librarySystem.controller;

import com.assignment.library.librarySystem.model.BookReservation;
import com.assignment.library.librarySystem.model.VideoReservation;
import com.assignment.library.librarySystem.service.VideoReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VideoReservationController {

    @Autowired
    private VideoReservationService videoReservationService;

    @RequestMapping(method = RequestMethod.POST, value = "/addVideoReservation")
    public void addVideoReservation(@RequestBody VideoReservation videoReservation){
        videoReservationService.addBookReservation(videoReservation);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteVideoReservation/{id}")
    public void deleteVideoReservation(@PathVariable Integer id){
        videoReservationService.deleteBookReservation(id);
    }

    @RequestMapping("/getAllVideoReservations")
    public List<VideoReservation> getAllVideoReservations(){
        return videoReservationService.getAllBookReservations();
    }

}
