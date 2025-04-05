package com.example.Jba.models;
import jakarta.persistence.Entity;

@Entity
// @DiscriminatorValue("F")
public class File extends Resources {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    } 
    
    public File(String type, String name, int size, String url, Lecture lecture) {
        super(name, size, url, lecture);
        this.type = type;
    }
    public File() {
    }


}
