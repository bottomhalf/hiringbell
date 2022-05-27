package com.hiringbell.repository;

import com.hiringbell.model.User;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
@Entity(name = "Login")
public class LoginRepository {

    public User authenticateUser(User user) {
        // call sp_User_Auth

        return null;
    }
}
