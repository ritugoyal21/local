package com.example.day3_sms.controller;

import com.example.day3_sms.dto.StudentRequestDto;
import com.example.day3_sms.dto.StudentResponseDto;
import com.example.day3_sms.model.StudentModel;
import com.example.day3_sms.service.StudentService;
import jakarta.validation.Valid;
import org.apache.catalina.realm.UserDatabaseRealm;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }
    @GetMapping("/add-request")
    public UserModel addRequest(UserModel userRequest){
    return service.addRequest(userRequest)}
}