package com.example.Jba.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Table(name = "author")
@Entity
public class Author extends BaseEntity {

    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(generator = "author_sequence")
    @Column(name = "id")
    private int id;
    
  
    private String ferstName;

    @Column(name = "last_name", nullable = true)
    private String LastName;

    @Column(name = "email", unique = true ,nullable = false)
    private String Email;
    
    @Column(name = "age", nullable = true)
    private int age;

    //Relationships
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

    public Author(String fn, String lastName, String email, int age,List<Course> courses ,
     LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy) {
        super(createdAt, updatedAt, createdBy, updatedBy);
        this.courses = courses;
        ferstName = fn;
        LastName = lastName;
        Email = email;
        this.age = age;
    }
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

   
    public Author() {
    }

    public String getFerstName() {
        return ferstName;
    }
    public void setFerstName(String fn) {
        ferstName = fn;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
