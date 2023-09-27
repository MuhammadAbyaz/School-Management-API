package com.abyaz.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UpdateTeacherDTO {

    @NotNull
    @Size(min = 2, message = "Name cannot be less than 2 character")
    private final String name;

    @NotNull
    @Size(min = 2, message = "Name cannot be less than 2 character")
    private final String address;

    @Min(value = 18, message = "Age cannot be less than 18")
    private final int age;


    public UpdateTeacherDTO(String name, String address, int age) {
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
