package com.abyaz.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.Objects;

public class AddTeacherDTO {
    @NotNull
    @Size(min = 2, message = "Name should be at least of two character")
    private String name;

    @NotNull
    @Size(min = 2, message = "Name should be at least of two character")
    private String address;

    @Min(value = 18, message = "Age cannot be less than 18")
    private int age;

    private List<String> coursesToTeach;

    public AddTeacherDTO(String name, String address, int age, List<String> coursesToTeach) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddTeacherDTO that = (AddTeacherDTO) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(coursesToTeach, that.coursesToTeach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, age, coursesToTeach);
    }

    @Override
    public String toString() {
        return "AddTeacherDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", coursesToTeach=" + coursesToTeach +
                '}';
    }
}
