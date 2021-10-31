package com.assignment.library.librarySystem.serviceImpl;

import com.assignment.library.librarySystem.model.Video;
import com.assignment.library.librarySystem.repository.VideoRepository;
import com.assignment.library.librarySystem.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoRepository videoRepository;

    @Override
    public void addVideo(Video video) {
        videoRepository.save(video);
    }

    @Override
    @Transactional
    public Optional<Video> updateVideo(Integer id, Video video) {
        return videoRepository.findById(id).map(
                e ->{
                    e.setvName(video.getvName());
                    e.setvCatId(video.getvCatId());
                    e.setvAgeRestriction(video.getvAgeRestriction());
                    e.setNoOfCopies(video.getNoOfCopies());
                    return e;
                });
    }

    @Override
    public void deleteVideo(Integer id) {
        videoRepository.deleteById(id);
    }

    @Override
    public Video getAllVideosById(Integer id) {
        Optional<Video> vid = Optional.ofNullable(
                videoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID"))
        );
        Video video = vid.get();
        return video;
    }

    @Override
    public List<Video> getAllVideos() {
        List<Video> videoList = new ArrayList<>();
        videoRepository.findAll().forEach(videoList::add);
        return videoList;
    }
}
