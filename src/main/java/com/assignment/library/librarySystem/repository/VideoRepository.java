package com.assignment.library.librarySystem.repository;

import com.assignment.library.librarySystem.model.Video;
import org.springframework.data.repository.CrudRepository;

public interface VideoRepository extends CrudRepository<Video, Integer> {
}
