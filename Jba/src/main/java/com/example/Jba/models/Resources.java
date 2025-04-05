package com.example.Jba.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Table(name = "resources")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
// @DiscriminatorColumn(name = "Resoures_type")
public class Resources   {    

    @Id
    @GeneratedValue
    private int id;

    private String name;
    @Column(name = "size", nullable =true)
    private int size;

    private String url;

    //Relationships
    @OneToOne(mappedBy = "resources", cascade = CascadeType.ALL)
    @JoinColumn(name = "lecture_id", nullable = false)
    private Lecture lecture;

    public Resources(String name, int size, String url, Lecture lecture) {
        this.name = name;
        this.size = size;
        this.url = url;
        this.lecture = lecture;
    }
    public Resources() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    

}
