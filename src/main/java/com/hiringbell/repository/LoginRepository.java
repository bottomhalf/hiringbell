package com.hiringbell.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.hiringbell.entity.Login;
import com.hiringbell.model.User;

@Repository
public class LoginRepository {

    public User authenticateUser(User user) {
        // call sp_User_Auth

        return null;
       
    }
    
    public User getRepoUserById (User user)
    {
    	Configuration cfg = new Configuration();
        cfg.configure("com/hiringbell/securityConfig/BasicSecurityConfiguration.java");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session=factory.openSession();
        
        Login login = (Login)session.get(Login.class, 28);
        System.out.println(login.toString());
        
        
        session.close();
        factory.close();
    	return null;
    }
    
    
   
}
