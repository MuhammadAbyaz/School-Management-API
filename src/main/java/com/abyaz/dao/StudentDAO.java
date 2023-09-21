package com.abyaz.dao;

import com.abyaz.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

public interface StudentDAO extends JpaRepository<Student, Integer>{
    @GetMapping
    default void getStudentById(){

    }
}
