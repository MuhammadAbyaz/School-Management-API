package com.abyaz.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class UpdateTeacherDTO {

    @NotNull
    @Size(min = 2, message = "Name cannot be less than 2 character")
    private String name;

    @NotNull
    @Size(min = 2, message = "Name cannot be less than 2 character")
    private String address;

    @Min(value = 18, message = "Age cannot be less than 18")
    private int age;

    private List<String> coursesToTeach;

    public UpdateTeacherDTO(String name, String address, int age, List<String> coursesToTeach) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.coursesToTeach = coursesToTeach;
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

    public List<String> getCoursesToTeach() {
        return coursesToTeach;
    }

    public void setCoursesToTeach(List<String> coursesToTeach) {
        this.coursesToTeach = coursesToTeach;
    }
}
