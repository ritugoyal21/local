package com.example.day3_sms.service;

import com.example.day3_sms.dto.StudentRequestDto;
import com.example.day3_sms.dto.StudentResponseDto;
import com.example.day3_sms.exception.StudentNotFoundException;
import com.example.day3_sms.model.StudentModel;
import com.example.day3_sms.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo repository;

    public StudentService(StudentRepo repository) {
        this.repository = repository;
    }

    //CRUD

    //Create
     /*public StudentModel addStudent(StudentModel student){
       return repository.save(student);
    }*/
//    public StudentResponseDto addStudent(StudentRequestDto dto){
//        StudentModel student = new StudentModel();
//        student.setName(dto.getName());
//        student.setAge(dto.getAge());
//        student.setEmail(dto.getEmail());
//
//        StudentModel saved = repository.save(student);
//
//        return new StudentResponseDto(
//                saved.getId(),
//                saved.getName(),
//                saved.getAge(),
//                saved.getEmail()
//        );
//    }
    // create
    public UserModel addRequest(UserModel userModel){
        String response="this is the response from gemini";
                userModel.setResponse(response);
        return repository.save(userModel);
    }
    /*