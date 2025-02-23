package com.example.demo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "Student_Profile")
@Entity(name="Student_Profile")
public class Student_profile {

    @Id
    @GeneratedValue
    private long id;

    @Column(
        name = "Profile",
        nullable = false,
        columnDefinition="TEXT"
    )
    private String profile;

    @OneToOne(
        mappedBy = "student_profile",
        cascade = CascadeType.ALL
        
    )
    private Student student;

    Student_profile()
    {

    }

    Student_profile(String profile,Student student){
        this.profile=profile;
        this.student=student;

    }
    public Student_profile( String profile){
        
        this.profile=profile;
    }
 
    public String getprofile(){
        return this.profile;
    }

    public void setprofile(String profile){
        this.profile=profile;
    }

    public Long getid(){
        return this.id;
    }

    public void setid(long id){
        this.id=id;
    }

    public Student getStudent(){
        return this.student;
    }

    public void setStudent(Student student){
        this.student=student;
    }

    public String toString(){
        return "hi i am student profile";
    }
}
