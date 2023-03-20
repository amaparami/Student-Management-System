package com.example.studentmanagementsystem1.controller;
import com.example.studentmanagementsystem1.exception.StudentNotFoundException;
import com.example.studentmanagementsystem1.model.Student;
import com.example.studentmanagementsystem1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
@RestController
@CrossOrigin("http://localhost:3000")


public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/student")
    Student newStudent(@RequestBody Student newStudent){
        return studentRepository.save(newStudent);
    }
    @GetMapping("/student")
    List<Student>getAllStudents(){
        return studentRepository.findAll();
    }
    @GetMapping("/student/{studentId}")
    Student getStudentById(@PathVariable Long studentId){
        return studentRepository.findById(studentId)
                .orElseThrow(()->new StudentNotFoundException(studentId));
    }

    @PutMapping("/student/{studentId}")
    Student updateStudent(@RequestBody Student newStudent,@PathVariable Long studentId){
        return studentRepository.findById((studentId))
                .map(student -> {
                    student.setFirstName(newStudent.getFirstName());
                    student.setLastName(newStudent.getLastName());
                    student.setAddress(newStudent.getAddress());
                    student.setBirthday(newStudent.getBirthday());
                    student.setDegreeProgram(newStudent.getDegreeProgram());

                    return studentRepository.save(student);
                }).orElseThrow(()->new StudentNotFoundException(studentId));
    }
    @DeleteMapping("/student/{studentId}")
    String deleteUser(@PathVariable Long studentId){
        if(!studentRepository.existsById(studentId)){
            throw new StudentNotFoundException(studentId);

        }
        studentRepository.deleteById(studentId);
        return "Student with studentId "+studentId+" has been deleted success.";

    }

}
