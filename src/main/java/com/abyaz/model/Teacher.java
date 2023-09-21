package com.abyaz.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Objects;

@Entity
public class Teacher {
    @Id
    @SequenceGenerator(
            name = "teacher-id-sequence",
            sequenceName = "teacher-id-sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "teacher-id-sequence"
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id) && Objects.equals(name, teacher.name) && Objects.equals(address, teacher.address) && Objects.equals(age, teacher.age) && Objects.equals(coursesToTeach, teacher.coursesToTeach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, age, coursesToTeach);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", coursesToTeach=" + coursesToTeach +
                '}';
    }
}
