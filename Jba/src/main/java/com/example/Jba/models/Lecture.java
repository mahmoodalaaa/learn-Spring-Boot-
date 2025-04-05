package com.example.Jba.models;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "lecture")
@Entity
public class Lecture extends BaseEntity {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    //Relationships
    @ManyToOne
    @JoinColumn(name = "section_id", nullable = false)
    @JsonBackReference
    private Section section;

    @OneToOne
    @JoinColumn(name = "resources_id", nullable = false)
    private Resources resources;

    public String getName() {
        return name;
    }
    public Lecture() {
    }

    public Lecture(String name, Section section, Resources resources ,
            LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy) {
        super(createdAt, updatedAt, createdBy, updatedBy);
      
        this.name = name;
        this.section = section;
        this.resources = resources;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }


}
