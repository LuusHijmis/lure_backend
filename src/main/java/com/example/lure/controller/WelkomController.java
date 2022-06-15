package com.example.lure.controller;

import com.example.lure.database.User;
import com.example.lure.database.UserDto;
import com.example.lure.database.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@NoArgsConstructor
public class WelkomController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/welkom")
    public String welkomMessage() {
        return "Welkom to Lure, where you will be lured, seduced with the most lovely and tastfull adds";
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody UserDto userDto) {
        User newUser = new User(userDto.getEmailadres(),userDto.getPassword());
        userRepository.save(newUser);
        return userRepository.getById(newUser.getId());
    }
}
