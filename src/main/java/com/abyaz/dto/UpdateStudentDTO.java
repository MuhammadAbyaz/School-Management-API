package com.abyaz.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UpdateStudentDTO {
    @Size(min = 2, message = "Student name should to at least 2 character")
    private final String name;
    @NotNull
    @Size(min = 2, message = "Address should be at least 2 character")
    private final String address;

    @Min(3)
    private final int age;

    public UpdateStudentDTO(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }


    public int getAge() {
        return age;
    }

}
