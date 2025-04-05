package com.example.Jba.models;

import java.time.LocalDateTime;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "courses")
@Entity
public class Course extends BaseEntity {

    @SequenceGenerator(
        name = "course_sequence",
        sequenceName = "course_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        generator = "course_sequence"
    )
    @Id
    private int id;

    @Column(name = "title", nullable = true)
    private String tittle;

    @Column(name = "description", nullable = true)
    private String description;

    //Relationships
    @ManyToMany
    @JoinTable(name = "author_course",
    joinColumns = {
        @JoinColumn(name = "course_id")
    },
    inverseJoinColumns = {
        @JoinColumn(name = "author_id")
    })
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    @JsonManagedReference
    private List<Section> sections;


    
    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Course(String tittle, String description, List<Author> authors, List<Section> sections,
            LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy) {
        super(createdAt, updatedAt, createdBy, updatedBy);
        this.sections = sections;
        this.authors = authors;
        this.tittle = tittle;
        this.description = description;
    }

    public Course() {
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

}
