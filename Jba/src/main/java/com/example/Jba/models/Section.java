package com.example.Jba.models;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "section")
@Entity
public class Section  extends BaseEntity {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int sectionOderer;

    // Relationships
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @OneToMany(mappedBy = "section")
    @JsonManagedReference
    private List<Lecture> lectures;

    
    public Section(String name, int sectionOderer, Course course, List<Lecture> lectures, 
            LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy) {
        super(createdAt, updatedAt, createdBy, updatedBy);
        this.name = name;
        this.sectionOderer = sectionOderer;
        this.course = course;
        this.lectures = lectures;
    }
    public List<Lecture> getLectures() {
        return lectures;
    }
    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }
    public Section() {
    }   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSectionOderer() {
        return sectionOderer;
    }

    public void setSectionOderer(int sectionOderer) {
        this.sectionOderer = sectionOderer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    
}
