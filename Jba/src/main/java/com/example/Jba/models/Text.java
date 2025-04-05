package com.example.Jba.models;
import jakarta.persistence.Entity;

@Entity
// @DiscriminatorValue("T")
public class Text  extends Resources {
    private String context;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Text(String context, String name, int size, String url, Lecture lecture) {
        super(name, size, url, lecture);
        this.context = context;
    }

    public Text() {
    }
}
