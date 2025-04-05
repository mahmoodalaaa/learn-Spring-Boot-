package com.example.Jba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Jba.models.Video;

public interface VideoRepository  extends JpaRepository<Video, Integer> {
    // Custom query methods can be defined here if needed

}
