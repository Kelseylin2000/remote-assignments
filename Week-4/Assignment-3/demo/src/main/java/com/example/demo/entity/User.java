package com.example.demo.entity;

public class User {

    private Integer id;
    private String email;
    private String password;
    
    // Default constructor
    public User() {
    }
    // Constructor
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

