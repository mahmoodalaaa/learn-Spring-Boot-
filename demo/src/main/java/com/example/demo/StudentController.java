package com.example.demo;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;



@RestController
public class StudentController {

    final private StudentService studentService;

    StudentController(StudentService studentService) {
        this.studentService = studentService;
        
    }

      @GetMapping(value = "/student")
    public List<Student> getschools(){
        return this.studentService.getAllStudents();
    }
   
    @PostMapping(value = "/student")
    public StudentRespons addSchool(@Valid @RequestBody StudentDTO student){
        
      return  this.studentService.addStudent(student);
    } 

    @GetMapping(value = "/student/{id}")  
    public StudentRespons getStudentById(@PathVariable long id){
        System.out.println(id);
        return this.studentService.getStudentById(id);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
   public ResponseEntity<?> handleValidationExceptions(MethodArgumentNotValidException exp) {
        var errors= new HashMap<String,String>();
       exp.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = error.getObjectName();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return ResponseEntity.badRequest().body(errors);
    }

}
