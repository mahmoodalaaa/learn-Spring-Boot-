package com.example.Jba.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Jba.models.File;
import com.example.Jba.repositories.FileRepository;

@RestController
public class FileController {

    private final FileRepository fileRepository;

    public FileController(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @PostMapping("/files")
    public String  createFile(@RequestBody File file) {
        fileRepository.save(file);
        return "File created successfully";
    }

}
