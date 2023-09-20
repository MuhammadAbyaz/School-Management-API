package com.abyaz.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import java.util.ArrayList;

@Entity
public class Student {
    @Id
    @SequenceGenerator(
            name = "student-id",
            sequenceName = "student-id-sequence",
            allocationSize = 1
    )
    private Integer id;
    private String name;
    private String address;
    private Integer age;

    @ElementCollection
    private ArrayList<String> coursesToStudy;

    public Student(Integer id, String name, String address, Integer age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.coursesToStudy = new ArrayList<>();
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ArrayList<String> getCoursesToStudy() {
        return coursesToStudy;
    }

    public void setCoursesToStudy(ArrayList<String> coursesToStudy) {
        this.coursesToStudy = coursesToStudy;
    }
}
