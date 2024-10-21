package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @GetMapping("/home")
    public String welcome(){
        return "Welcome to our bank";
    }
}
// application.properties
// 1. admin
// 2. 123

// interflow of securtiy