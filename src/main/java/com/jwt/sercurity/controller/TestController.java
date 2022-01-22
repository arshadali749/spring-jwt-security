package com.jwt.sercurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/admin")
    public String testAdmin(){
        return "this end point is only accessible to the admin";
    }
    @GetMapping("/user")
    public String testUser(){
        return  "this is only accessible to the users";
    }
}
