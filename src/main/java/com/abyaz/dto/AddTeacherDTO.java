package com.abyaz.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class AddTeacherDTO {
    @NotNull
    @Size(min = 2, message = "Name should be at least of two character")
    private final String name;

    @NotNull
    @Size(min = 2, message = "Name should be at least of two character")
    private final String address;

    @Min(value = 18, message = "Age cannot be less than 18")
    private final int age;


    public AddTeacherDTO(String name, String address, int age) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddTeacherDTO that = (AddTeacherDTO) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, age);
    }

    @Override
    public String toString() {
        return "AddTeacherDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
