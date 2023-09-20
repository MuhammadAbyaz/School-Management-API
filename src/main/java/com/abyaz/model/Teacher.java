package com.abyaz.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import java.util.ArrayList;

@Entity
public class Teacher {
    @Id
    @SequenceGenerator(
            name = "teacher-id",
            sequenceName = "teacher-id-sequence",
            allocationSize = 1
    )
    private Integer id;
    private String name;
    private String address;
    private Integer age;
    @ElementCollection
    private ArrayList<String> coursesToTeach;

    public Teacher(Integer id, String name, String address, Integer age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.coursesToTeach = new ArrayList<>();
    }

    public Teacher() {

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

    public ArrayList<String> getCoursesToTeach() {
        return coursesToTeach;
    }

    public void setCoursesToTeach(ArrayList<String> coursesToTeach) {
        this.coursesToTeach = coursesToTeach;
    }
}
