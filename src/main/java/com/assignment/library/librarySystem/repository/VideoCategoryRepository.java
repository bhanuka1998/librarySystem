package com.assignment.library.librarySystem.repository;

import com.assignment.library.librarySystem.model.VideoCategory;
import org.springframework.data.repository.CrudRepository;

public interface VideoCategoryRepository extends CrudRepository<VideoCategory, Integer> {
}
