package com.jwt.sercurity.controller;

import com.jwt.sercurity.dto.ResponseDto;
import com.jwt.sercurity.model.User;
import com.jwt.sercurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostConstruct
    public void oninit() {
        userService.intiRolesAndUsers();
    }

    @PostMapping("/")
    public User create(@RequestBody User user) {
        return userService.create(user);

    }

    @PutMapping("/")
    public User updateUser(@RequestBody User user) {
        return null;

    }

    @GetMapping("/{id}")
    public User getById(@PathVariable int id) {
        return userService.getById(id);

    }

    @DeleteMapping("/{id}")
    public ResponseDto deleteById(@PathVariable int id) {
        ResponseDto responseDto = userService.deleteById(id);
        return responseDto;
    }

}
