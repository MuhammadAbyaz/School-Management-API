package com.abyaz.controller;

import com.abyaz.dto.UpdateStudentDTO;
import com.abyaz.model.Student;
import com.abyaz.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudent();
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @DeleteMapping("{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId) {
        studentService.deleteStudent(studentId);
    }

    @PutMapping("{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId, @RequestBody(required = false) @Valid UpdateStudentDTO updateStudentDTO) {
        studentService.updateStudent(studentId, updateStudentDTO);
    }
}
