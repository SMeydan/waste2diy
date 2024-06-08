package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository UserRepository;

    public List<User> getAllUser(){return UserRepository.findAll();}
    public User getUserById(Long id){return  UserRepository.findById(id).orElse(null);}
    public User saveUser(User user){return UserRepository.save(user);}
    public void deleteUser(User user){UserRepository.delete(user);}
    public void deleteUserById(Long id){UserRepository.deleteById(id);}
}