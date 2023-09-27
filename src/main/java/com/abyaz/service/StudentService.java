package com.abyaz.service;

import com.abyaz.dto.AddStudentDTO;
import com.abyaz.dto.UpdateStudentDTO;
import com.abyaz.model.Student;
import com.abyaz.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public void addStudent(AddStudentDTO addStudentDTO) {
        Student student = new Student();
        student.setName(addStudentDTO.getName());
        student.setAge(addStudentDTO.getAge());
        student.setAddress(addStudentDTO.getAddress());
        studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        } else {
            System.out.println("This id does not exists");
        }
    }

    public void updateStudent(Integer studentId, UpdateStudentDTO updateStudentDTO) {
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setName(updateStudentDTO.getName());
            student.setAddress(updateStudentDTO.getAddress());
            student.setAge(updateStudentDTO.getAge());
        }
    }
}
