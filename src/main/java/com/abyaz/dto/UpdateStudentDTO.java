package com.abyaz.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UpdateStudentDTO {
    @Size(min = 2, message = "Student name should to at least 2 character")
    private String name;
    @NotNull
    @Size(min = 2, message = "Address should be at least 2 character")
    private String address;

    @Min(3)
    private int age;

    public UpdateStudentDTO(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
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
}
