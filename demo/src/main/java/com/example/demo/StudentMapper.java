package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class StudentMapper {

    public Student toStudent(StudentDTO dto){
        var school=new School();
        school.setid(dto.schoolId());
        var student =new Student(dto.name(),null,school);
        return student;
    }

    public StudentRespons toStudentRespons(Student student){
        var studentRespons = new StudentRespons(student.getid(), student.getname(), student.getschool().getid());
        return studentRespons;
    
    }
}
