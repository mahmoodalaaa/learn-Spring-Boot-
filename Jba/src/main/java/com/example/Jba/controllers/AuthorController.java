package com.example.Jba.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Jba.models.Author;

import com.example.Jba.repositories.AuthorRepository;


@RestController
public class AuthorController { 

    private final AuthorRepository authorRepository;
 

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @PostMapping(value = "/author")
    public String addAuthor(@RequestBody Author author) {
        this.authorRepository.save(author);
        return "Author added successfully";

    }

    @GetMapping(value = "/author")
    public List<Author> getAuthor() {
        return this.authorRepository.findAll();
    }

    @GetMapping(value = "/author/{age}")
    public List<Author> getAuthorByAge(@PathVariable int age) {
        return this.authorRepository.findByAge(age);
    }
    
   
}

