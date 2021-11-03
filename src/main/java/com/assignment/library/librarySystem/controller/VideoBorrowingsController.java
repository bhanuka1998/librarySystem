package com.assignment.library.librarySystem.controller;

import com.assignment.library.librarySystem.model.BookBorrowings;
import com.assignment.library.librarySystem.model.VideoBorrowings;
import com.assignment.library.librarySystem.service.VideoBorrowingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VideoBorrowingsController {

    @Autowired
    private VideoBorrowingsService videoBorrowingsService;

    @RequestMapping(method = RequestMethod.POST, value = "/addBookBorrowing")
    public void addVideoBorrowing(@RequestBody VideoBorrowings videoBorrowings){
        videoBorrowingsService.addVideoBorrowing(videoBorrowings);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteBookBorrowing/{id}")
    public void deleteVideoBorrowing(@PathVariable Integer id){
        videoBorrowingsService.deleteVideoBorrowing(id);
    }

    @RequestMapping("/getAllVideoReservations")
    public List<VideoBorrowings> getAllVideoBorrowing(){
        return videoBorrowingsService.getAllVideoBorrowings();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateBookBorrowing/{id}")
    public void updateVideoBorrowing(@RequestBody VideoBorrowings videoBorrowings, @PathVariable Integer id){
        videoBorrowingsService.updateVideoBorrowing(videoBorrowings, id);
    }

}
