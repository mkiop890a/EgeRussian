package com.example.egerussian.model;

public class User {
    int id;

    String fullName;

    String email;

    String password;

    String infoAboutUser;


    public User(String fullName, String email, String password, String infoAboutUser) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.infoAboutUser = infoAboutUser;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getInfoAboutUser() {
        return infoAboutUser;
    }
}
