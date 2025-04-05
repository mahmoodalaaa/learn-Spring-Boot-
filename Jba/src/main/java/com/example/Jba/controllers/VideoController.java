package com.example.Jba.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Jba.models.Video;
import com.example.Jba.repositories.VideoRepository;

@RestController
public class VideoController {

    private final VideoRepository videoRepository;

    public VideoController(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @PostMapping(value = "/video")
    public String addVideo(@RequestBody Video video) {
        this.videoRepository.save(video);
        return "Video added successfully";

    }
}
