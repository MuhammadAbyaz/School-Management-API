package com.abyaz.controller;

import com.abyaz.repository.TeacherRepository;
import com.abyaz.model.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherController {

    private TeacherRepository teacherRepository;

    public TeacherController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @GetMapping
    public List<Teacher> getTeacher(){
        return teacherRepository.findAll();
    }

    @PostMapping
    public void addTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }

    @DeleteMapping("{teacherId}")
    public void deleteTeacher(@PathVariable Integer id){
        if (teacherRepository.existsById(id)){
            teacherRepository.deleteById(id);
        } else {
            System.out.println("This id does not exists");
        }
    }

    @PutMapping("{teacherId}")
    public void updateTeacher(@PathVariable Integer id, @RequestBody Teacher teacher){
        if (teacherRepository.existsById(id)){
            teacherRepository.save(teacher);
        } else {
            System.out.println("This id does not exists");
        }
    }
}
