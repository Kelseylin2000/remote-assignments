package com.example.demo.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean signUp(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        if(user.isPresent()){
            return false;
        }else{
            User newUser = new User(email, password);
            userRepository.save(newUser);
            return true;
        }
    }

    public boolean signIn(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        if(user.isPresent() && user.get().getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
}
