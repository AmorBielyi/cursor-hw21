package com.cursor.dbapp.controller;

import com.cursor.dbapp.model.Student;
import com.cursor.dbapp.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController

public class StudentController {

    final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") Long id) {
        return studentRepository.findById(id);
    }

    @GetMapping("/students/group/{groupName}")
    public List<Student> getStudentsByGroup(@PathVariable("groupName") String groupName) {
        return studentRepository.findAll().stream()
                .filter(student -> student.getGroup().equals(groupName))
                .collect(Collectors.toList());
    }

}
