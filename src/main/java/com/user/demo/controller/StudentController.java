package com.user.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@GetMapping("/say")
    public  String getMessage(){
    return "Hello Baby";
}
}
