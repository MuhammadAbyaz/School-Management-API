package com.abyaz.controller;

import com.abyaz.dto.AddTeacherDTO;
import com.abyaz.dto.UpdateTeacherDTO;
import com.abyaz.model.Teacher;
import com.abyaz.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping
    public List<Teacher> getTeacher() {
        return teacherService.getTeacher();
    }

    @PostMapping
    public ResponseEntity<AddTeacherDTO> addTeacher(@RequestBody @Valid AddTeacherDTO addTeacherDTO) {
        teacherService.addTeacher(addTeacherDTO);
        return new ResponseEntity<>(addTeacherDTO, HttpStatus.CREATED);
    }

    @DeleteMapping("{teacherId}")
    public void deleteTeacher(@PathVariable Integer teacherId) {
        teacherService.deleteTeacher(teacherId);
    }

    @PutMapping("{teacherId}")
    public void updateTeacher(@PathVariable Integer teacherId, @Valid @RequestBody UpdateTeacherDTO updateTeacherDTO) {
        teacherService.updateTeacher(teacherId, updateTeacherDTO);
    }
}
