package com.abyaz.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;


@Entity
public class Student {
    @Id
    @SequenceGenerator(
            name = "student-id-sequence",
            sequenceName = "student-id-sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student-id-sequence"
    )
    private Integer id;
    private String name;
    private String address;
    private Integer age;

    @ElementCollection
    private List<String> coursesToStudy;

    public Student(String name, String address, Integer age, List<String> coursesToStudy) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.coursesToStudy = coursesToStudy;
    }

    public Student() {
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

    public List<String> getCoursesToStudy() {
        return coursesToStudy;
    }

    public void setCoursesToStudy(List<String> coursesToStudy) {
        this.coursesToStudy = coursesToStudy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(address, student.address) && Objects.equals(age, student.age) && Objects.equals(coursesToStudy, student.coursesToStudy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, age, coursesToStudy);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", coursesToStudy=" + coursesToStudy +
                '}';
    }
}
