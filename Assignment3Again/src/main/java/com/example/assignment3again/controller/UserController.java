package com.example.assignment3again.controller;

import com.example.assignment3again.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    private UserRepository userRepository;
    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/viewdata")
    public String viewdata(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "viewdata";
    }
}