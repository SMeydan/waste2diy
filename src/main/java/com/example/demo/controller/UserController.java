package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/user")
public class UserController {
    @Autowired
    private UserService UserService;

    @GetMapping
    public List<User> getAllUser(){
        return UserService.getAllUser();
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return UserService.saveUser(user);
    }

    @GetMapping(path= "/id")
    public User getUserById(Long id){
        return UserService.getUserById(id);
    }

    @DeleteMapping
    public String deleteImage(Long id){
        UserService.deleteUserById(id);
        return "Success";
    }

}
