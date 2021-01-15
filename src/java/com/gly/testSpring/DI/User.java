package com.gly.testSpring.DI;

import org.springframework.stereotype.Component;

@Component("User")
public class User {
    private String username;

    private User(){}
//    public User(String username) {
//        this.username = username;
//    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
