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

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String homePage() {
        return "homePage";
    }

    @PostMapping("/user")
    public String signUp(@RequestParam String email, @RequestParam String password, @RequestParam String action, Model model) {
        
        boolean success = false;
        String msg = "Invaild";

        if(action.equals("signup")){
            success = userService.signUp(email, password);
            msg = "Sign up failed. The same email was registered before.";
        }else if(action.equals("signin")){
            success = userService.signIn(email, password);
            msg = "Sign in failed. Invalid email or password, or user has not registered yet.";
        }

        if(success){
            return "memberPage";
        }else{
            model.addAttribute("msg", msg);
            return "homePage";
        }
    }
}