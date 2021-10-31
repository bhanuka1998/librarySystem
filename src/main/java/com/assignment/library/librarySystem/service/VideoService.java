package com.assignment.library.librarySystem.service;

import com.assignment.library.librarySystem.model.Video;

import java.util.List;
import java.util.Optional;

public interface VideoService {
    void addVideo(Video video);

    Optional<Video> updateVideo(Integer id, Video video);

    void deleteVideo(Integer id);

    Video getAllVideosById(Integer id);

    List<Video> getAllVideos();
}
