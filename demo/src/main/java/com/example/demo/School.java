package com.example.demo;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity(name = "School")
@Table(name ="School")
public class School {

    @Id
    @GeneratedValue
   private long id;
    @Column(
        columnDefinition = "TEXT",
        nullable = false

    )
   private String name;

    @OneToMany(
        mappedBy = "school"
    ) 
    @JsonManagedReference
    private List<Student> students;

    public School(){

    }
    public School( String name, List<Student> students){
        
        this.name=name;
        this.students=students;
    }
 
    public String getname(){
        return this.name;
    }

    public void setname(String name){
        this.name=name;
    }

    public Long getid(){
        return this.id;
    }

    public void setid(long id){
        this.id=id;
    }   

    public List<Student> getStudents(){
        return this.students;
    }
    
    public void setStudents(List<Student> students){
        this.students=students;
    }

    public String toString(){
        return "hi i am school";
    }
}
 