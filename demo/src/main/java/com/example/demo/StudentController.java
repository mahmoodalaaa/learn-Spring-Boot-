package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    final private StudentRespsitory studentRespsitory;
    final private StudentMapper studentMapper;

    StudentController(StudentRespsitory studentRespsitory,StudentMapper studentMapper){
        this.studentRespsitory=studentRespsitory;
        this.studentMapper=studentMapper;
    }

      @GetMapping(value = "/student")
    public List<Student> getschools(){
        return studentRespsitory.findAll();
    }
   
    @PostMapping(value = "/student")
    public String addSchool(@RequestBody StudentDTO student){
        
        studentRespsitory.save(this.studentMapper.toStudent(student));
        return "Added";
    } 

   
}
