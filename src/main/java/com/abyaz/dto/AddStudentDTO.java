package com.abyaz.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AddStudentDTO {

    @NotNull
    @Size(min = 2, message = "Name should be at least of two character")
    private final String name;

    @NotNull
    @Size(min = 2, message = "Address should be at least of two character")
    private final String address;

    @Min(value = 3, message = "Age of student cannot be less than 3")
    private final int age;


    public AddStudentDTO(String name, String address, int age) {
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
