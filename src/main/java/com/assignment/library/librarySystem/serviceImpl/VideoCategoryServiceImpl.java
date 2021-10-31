package com.assignment.library.librarySystem.serviceImpl;

import com.assignment.library.librarySystem.model.VideoCategory;
import com.assignment.library.librarySystem.repository.VideoCategoryRepository;
import com.assignment.library.librarySystem.service.VideoCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VideoCategoryServiceImpl implements VideoCategoryService {
    @Autowired
    private VideoCategoryRepository videoCategoryRepository;

    @Override
    public void addVideoCategory(VideoCategory videoCategory) {
        videoCategoryRepository.save(videoCategory);
    }

    @Override
    public List<VideoCategory> getAllVideoCategories() {
        List<VideoCategory> videoCategoryList = new ArrayList<>();
        videoCategoryRepository.findAll().forEach(videoCategoryList::add);
        return videoCategoryList;
    }

    @Override
    @Transactional
    public Optional<VideoCategory> updateVideoCategory(Integer id, VideoCategory videoCategory) {
        return videoCategoryRepository.findById(id).map(
                e -> {
                    e.setvCatName(videoCategory.getvCatName());
                    return e;
                }
        );
    }

    @Override
    public VideoCategory getVideoCategoryByID(Integer id) {
        Optional<VideoCategory> vidCat = Optional.ofNullable(
                videoCategoryRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID"))
        );
        VideoCategory videoCategory = vidCat.get();
        return videoCategory;
    }

    @Override
    public void deleteVideoCategory(Integer id) {
        videoCategoryRepository.deleteById(id);
    }

}
