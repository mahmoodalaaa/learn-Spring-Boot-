package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

    final private SchoolRepo schoolRepo;

    SchoolController(SchoolRepo schoolRepo){
        this.schoolRepo=schoolRepo;
    }

    @GetMapping(value = "/schools")
    public List<School> getschools(){
        return schoolRepo.findAll();
    }
   
    @PostMapping(value = "/schools")
    public String addSchool(@RequestBody  School school){
        schoolRepo.save(school);
        return "Added";
    }
}
