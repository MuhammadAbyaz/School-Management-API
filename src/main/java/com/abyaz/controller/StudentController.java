package com.abyaz.controller;

import com.abyaz.dao.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController{

    @GetMapping()
    public List<String> getStudent(){
        return List.of();
    }
    @PostMapping()
    public void addStudent(){
    }
}
