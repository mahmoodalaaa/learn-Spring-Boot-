package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class StudentServiceTest {

    @InjectMocks
    private StudentService studentService;
    // declare other dependencies like StudentRepository, StudentMapper, etc.
    @Mock
    private StudentMapper studentMapper;
    @Mock
    private StudentRespsitory studentRepository;

    @BeforeAll
    static void setUp() {
        // Initialize the test environment, if needed
    }

    @BeforeEach
    void init() {
        // Initialize the test data or state before each test
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetStudents() {
        // Test the getStudentById method
    }

    @Test
    public void testAddStudent() {
        // get a student DTO and turn it into a student object
        // then call the save method of the repository
        // given 
        StudentDTO studentDTO = new StudentDTO("John",  1);
       // Student student = new Student("John",null ,null);
        // when
        StudentRespons studentRespons = studentService.addStudent(studentDTO);
        // then
        assertEquals(studentDTO.name(), studentRespons.name());
        
    }
}
