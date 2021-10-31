package com.assignment.library.librarySystem.controller;

import com.assignment.library.librarySystem.model.VideoCategory;
import com.assignment.library.librarySystem.service.VideoCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VideoCategoryController {
    @Autowired
    private VideoCategoryService videoCategoryService;

    @RequestMapping(method = RequestMethod.POST, value = "/addVideoCategory")
    public  void addVideoCategory(@RequestBody VideoCategory videoCategory){
        videoCategoryService.addVideoCategory(videoCategory);
    }

    @RequestMapping("/getAllVideoCategoies")
    public List<VideoCategory> getAllVideoCategories(){
        return videoCategoryService.getAllVideoCategories();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateVideoCategory/{id}")
    public void updateVideoCategory(@PathVariable Integer id, @RequestBody VideoCategory videoCategory){
        videoCategoryService.updateVideoCategory(id, videoCategory);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteVideoCategory/{id}")
    public void deleteVideoCategory(@PathVariable Integer id){
        videoCategoryService.deleteVideoCategory(id);
    }
}
