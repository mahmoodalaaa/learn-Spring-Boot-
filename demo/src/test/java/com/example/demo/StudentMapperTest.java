package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class StudentMapperTest {

    private StudentMapper studentMapper = new StudentMapper();

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all test methods");
    }

    @BeforeEach
    void setUp(){
        System.out.println("Before each test method");
    }

    @AfterEach
    void tearDown(){
        System.out.println("After each test method");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After all test methods");
    }

    @Test
    public void testMethod(){
        System.out.println("mahmood");
    }

    @Test
    public void testDTOstudentToStudent() {
        //given
        StudentDTO studentDTO = new StudentDTO("John Doe", 1);
        //when
        Student student = studentMapper.toStudent(studentDTO);
        //then
        Assertions.assertEquals(studentDTO.name(), student.getname());
    }   

    @Test
    public void testToStudentDTO() {
        
    }

    @Test
    public void testToStudentRespons() {
        
    }

}
