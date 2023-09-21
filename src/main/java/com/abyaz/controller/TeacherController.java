package com.abyaz.controller;

import com.abyaz.dao.TeacherDAO;
import com.abyaz.model.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    private TeacherDAO teacherDAO;

    public TeacherController(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    @GetMapping
    public List<Teacher> getTeacher(){
        return teacherDAO.findAll();
    }

    @PostMapping
    public void addTeacher(Teacher teacher){
        teacherDAO.save(teacher);
    }

    @DeleteMapping("{teacherId}")
    public void deleteTeacher(@PathVariable Integer id){
        if (teacherDAO.existsById(id)){
            teacherDAO.deleteById(id);
        } else {
            System.out.println("This id does not exists");
        }
    }

    @PutMapping("{teacherId}")
    public void updateTeacher(@PathVariable Integer id, @RequestBody Teacher teacher){
        if (teacherDAO.existsById(id)){
            teacherDAO.save(teacher);
        } else {
            System.out.println("This id does not exists");
        }
    }
}
