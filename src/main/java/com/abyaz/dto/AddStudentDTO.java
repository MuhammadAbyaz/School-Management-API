package com.abyaz.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class AddStudentDTO {

    @NotNull
    @Size(min = 2, message = "Name should be at least of two character")
    private String name;

    @NotNull
    @Size(min = 2, message = "Address should be at least of two character")
    private String address;

    @Min(value = 3, message = "Age of student cannot be less than 3")
    private int age;

    private List<String> coursesToStudy;

    public AddStudentDTO(String name, String address, int age, List<String> coursesToStudy) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.coursesToStudy = coursesToStudy;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getCoursesToStudy() {
        return coursesToStudy;
    }

    public void setCoursesToStudy(List<String> coursesToStudy) {
        this.coursesToStudy = coursesToStudy;
    }
}
