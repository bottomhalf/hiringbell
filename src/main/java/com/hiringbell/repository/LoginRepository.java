package com.hiringbell.repository;

import com.hiringbell.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepository {

    public User authenticateUser(User user) {
        // call sp_User_Auth

        return null;
    }
}
