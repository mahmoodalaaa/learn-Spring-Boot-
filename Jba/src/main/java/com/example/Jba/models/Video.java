package com.example.Jba.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
// @DiscriminatorValue("V")
public class Video extends Resources {
    @Column(name = "length", nullable = true)
    private int length;

    
    public Video(int length , String name, int size, String url ,Lecture lecture) {
        super(name, size, url, lecture);
        this.  length = length;
    }

    public Video() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    


}
