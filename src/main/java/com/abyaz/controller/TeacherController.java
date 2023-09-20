package com.abyaz.controller;

import com.abyaz.dao.TeacherRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    private TeacherRepository teacherRepository;


    @GetMapping
    public List<String> getTeacher(){
        return List.of();
    }
}
