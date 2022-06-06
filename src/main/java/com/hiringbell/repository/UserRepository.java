package com.hiringbell.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hiringbell.model.User;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class UserRepository {
	
	public User userRepo(long userId)
	{
		User userDetail = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			
			Query<User> query = session.createQuery("from user where UserId =:userId", User.class);
			query.setParameter("UserId", userId);
			
			userDetail = query.getSingleResult();
			System.out.println(userDetail);
			
			
			tx.commit();
			session.close();
			System.out.println("Bringing data...");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx!=null) 
			{
			   tx.rollback();
			}
		}
		
		System.out.println("There is User Detail");
		return userDetail;
	}

}
