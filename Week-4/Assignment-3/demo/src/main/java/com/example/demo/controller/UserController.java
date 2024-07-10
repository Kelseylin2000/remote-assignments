package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String homePage() {
        return "homePage";
    }

    @PostMapping("/user/signup")
    public String signUp(@RequestParam String email, @RequestParam String password, Model model) {
        boolean success = userService.signUp(email, password);
        if(success){
            return "memberPage";
        }else{
            model.addAttribute("msg", "The same email was registered before.");
            return "homePage";
        }
    }

    @PostMapping("/user/signin")
    public String signIn(@RequestParam String email, @RequestParam String password, Model model) {
        boolean success = userService.signIn(email, password);
        if(success){
            return "memberPage";
        }else{
            model.addAttribute("msg", "Invalid email or password, or user has not registered yet.");
            return "homePage";
        }    }
}
