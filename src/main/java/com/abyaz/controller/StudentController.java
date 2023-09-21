package com.abyaz.controller;

import com.abyaz.dao.StudentDAO;
import com.abyaz.dto.StudentDTO;
import com.abyaz.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController{
    private final StudentDAO studentDAO;

    public StudentController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping
    public List<Student> getStudent(){
        return studentDAO.findAll();
    }
    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentDAO.save(student);
    }
    @DeleteMapping("{studentId}")
    public void deleteStudent(Integer id){
        if (studentDAO.existsById(id)){
            studentDAO.deleteById(id);
        } else {
            System.out.println("This id does not exists");
        }
    }
    @PutMapping("{studentId}")
    public void updateStudent(@PathVariable Integer id, @RequestBody Student student){
        if (studentDAO.existsById(id)){
            studentDAO.save(student);
        } else {
            System.out.println("This id does not exist");
        }
    }
}
