package com.abyaz.service;

import com.abyaz.dto.AddTeacherDTO;
import com.abyaz.dto.UpdateTeacherDTO;
import com.abyaz.model.Teacher;
import com.abyaz.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getTeacher() {
        return teacherRepository.findAll();
    }

    public void addTeacher(AddTeacherDTO addTeacherDTO) {
        Teacher teacher = new Teacher();
        teacher.setName(addTeacherDTO.getName());
        teacher.setAddress(addTeacherDTO.getAddress());
        teacher.setAge(addTeacherDTO.getAge());
        teacherRepository.save(teacher);
    }

    public void deleteTeacher(Integer teacherId) {
        if (teacherRepository.existsById(teacherId)) {
            teacherRepository.deleteById(teacherId);
        } else {
            System.out.println("This id does not exists");
        }
    }

    public void updateTeacher(Integer teacherId, UpdateTeacherDTO updateTeacherDTO) {
        Optional<Teacher> optionalTeacher = teacherRepository.findById(teacherId);
        if (optionalTeacher.isPresent()) {
            Teacher teacher = optionalTeacher.get();
            teacher.setName(updateTeacherDTO.getName());
            teacher.setAddress(updateTeacherDTO.getAddress());
            teacher.setAge(updateTeacherDTO.getAge());
        }
    }
}
