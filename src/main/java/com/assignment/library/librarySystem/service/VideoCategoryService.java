package com.assignment.library.librarySystem.service;

import com.assignment.library.librarySystem.model.VideoCategory;

import java.util.List;
import java.util.Optional;

public interface VideoCategoryService {
    void addVideoCategory(VideoCategory videoCategory);

    List<VideoCategory> getAllVideoCategories();

    Optional<VideoCategory> updateVideoCategory(Integer id, VideoCategory videoCategory);

    VideoCategory getVideoCategoryByID(Integer id);

    void deleteVideoCategory(Integer id);
}
