package com.springFrameWork.SpringDemo.student;

import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student){
        Optional<Student> studentOptional = studentRepository
                .findByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("Email is already taken");
        }
        studentRepository.save(student);
        System.out.println(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exist =  studentRepository.existsById(studentId);
            if(!exist){
                throw new IllegalStateException(
                        "student with id" + studentId + "dose not exists");
            }
            studentRepository.deleteById(studentId);
        }
}
