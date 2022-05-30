package com.hiringbell.repository;

import com.hiringbell.securityConfig.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
        Transaction tx = null;
        SessionFactory factory = HibernateUtil.getSessionFactory();
        System.out.println(factory);

        try(Session session = factory.openSession()) {
            tx = session.beginTransaction();

            System.out.println("Starting ...");
            Long loginId = 28l;
            Login login = session.get(Login.class, loginId);

            System.out.println(login.toString());

            tx.commit();
            session.close();
            System.out.println("Completed");
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }

    	return null;
    }
    
    
   
}
