package com.example.demo;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Table(name =  "Student")
@Entity(name = "Student")
public class Student {

    @Id
    @SequenceGenerator(
        allocationSize = 1,
        name ="Studnet_sequence",
        sequenceName = "Studnet_sequence"
    )
    @GeneratedValue(    
        generator = "Studnet_sequence"
    )
    private Long id;
    @Column(
        nullable = false,
        columnDefinition = "TEXT"

    )
    private String name;

    @OneToOne
    @JoinColumn(
        name = "Student_profile_id"
    )
    private Student_profile student_profile;

    
    @ManyToOne
    @JoinColumn(name = "School_id")
    @JsonBackReference  
    private School school;

    Student(){

    }
   
    public Student( String name, Student_profile student_profile, School school){
        
        this.name=name;
        this.student_profile=student_profile;
        this.school=school;
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

    public School getschool(){
        return this.school;
    }

    public void setschool(School school){
        this.school=school;
    }

    public Student_profile getstudent_profile(){
        return this.student_profile;
    }

    public void setstudent_profile(Student_profile student_profile){
        this.student_profile=student_profile;
    }


    public String toString(){
        return "hi i am student";
    }

}
