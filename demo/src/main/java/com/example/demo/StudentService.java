package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRespsitory studentRespsitory;
    private final StudentMapper studentMapper;

    public StudentService(StudentRespsitory studentRespsitory, StudentMapper studentMapper) {
        this.studentRespsitory = studentRespsitory;
        this.studentMapper = studentMapper;
    }
    public StudentRespons getStudentById(long id) {
        var student = studentRespsitory.findById(id).orElse(null);
        return studentMapper.toStudentRespons(student);
    }
    public List<Student> getAllStudents() {
        return studentRespsitory.findAll();
    }

    public StudentRespons addStudent(StudentDTO student) {
       Student st= studentRespsitory.save(studentMapper.toStudent(student));
        return this.studentMapper.toStudentRespons(st);
    }

}

