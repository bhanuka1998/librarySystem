package com.assignment.library.librarySystem.controller;

import com.assignment.library.librarySystem.model.Video;
import com.assignment.library.librarySystem.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.View;
import java.util.List;

@RestController
public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping(method = RequestMethod.POST, value = "/addVideo")
    public void addVideo(@RequestBody Video video){
        videoService.addVideo(video);
    }

    @RequestMapping("/getAllVideos")
    public List<Video> getAllVideos(){
        return videoService.getAllVideos();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateVideo/{id}")
    public void updateVideo(@PathVariable Integer id, @RequestBody Video video){
        videoService.updateVideo(id, video);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteVideo/{id}")
    public void deleteVideo(@PathVariable Integer id){
        videoService.deleteVideo(id);
    }
}
