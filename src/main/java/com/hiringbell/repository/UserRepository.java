package com.hiringbell.repository;

import java.util.ArrayList;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hiringbell.entity.User;
import com.hiringbell.securityConfig.HibernateUtil;


import antlr.collections.List;

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
			
			Query<User> query = session.createQuery("from User where UserId =:userId", User.class);
			query.setParameter("userId", userId);
			
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
	
	
	public User getUserByIdRepo(long userId)
	{
		User userDetail = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			
			Query<User> query = session.createQuery("from User where UserId =:userId", User.class);
			query.setParameter("userId", userId);
			
			userDetail = query.getSingleResult();
			System.out.println(userDetail);
			
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		
		return userDetail;
	}
	
	
	public ArrayList<User> getUserAllByProcedureRepo() 
	{
		java.util.List<User> allUser = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			
			Query<User> query = session.createSQLQuery("Call sp_user_GetAll()").addEntity(User.class);
			allUser = query.list();
			System.out.println(allUser);
			
		
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		
		return (ArrayList<User>) allUser;
		
	}
	
	
	public User getUserByIdWithProcedureRepository(long userId) {
		
		User userDetail = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			
			Query<User> query = session.createSQLQuery("Call sp_User_GetById(:userId)").addEntity(User.class);
			query.setParameter("userId", userId);
			userDetail = query.getSingleResult();
			
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		
		return userDetail;
	}
	
	
	
	public String updateUserByIdRepo(User user, long userId)
	{
		int userDetail = 0;
		String msg = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			StoredProcedureQuery query = session.createStoredProcedureCall("Call sp_User_InsertUpdate")
					.registerStoredProcedureParameter("_UserId", Long.class, ParameterMode.IN)
					//.registerParameter("_UserId", Long.class, ParameterMode.IN)
					.registerStoredProcedureParameter("_FirstName", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("_LastName", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("_Address", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("_Email", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("_Mobile", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("_CompanyName", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("_AdminId", Long.class, ParameterMode.IN)
					.registerStoredProcedureParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			userDetail = query.executeUpdate();
			msg = query.getOutputParameterValue("_ProcessingResult").toString();
			System.out.println("Rows affected"+userDetail);
		
			tx.commit();
			session.close();
			//return 0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		return msg;
	}
	
	public String addUserRepository(User user)
	{	
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			
		
			
			Query <User> query = session.createNamedQuery("INSERT INTO User(userId, password, firstName, lastName, address, email, mobile, companyName, createdBy, updatedBy, createdOn, updatedOn)", User.class);
			query.setParameter("userId", user.getUserId());
			query.setParameter("password", user.getPassword());
			query.setParameter("firstName", user.getFirstName());
			query.setParameter("lastName", user.getLastName());
			query.setParameter("address", user.getAddress());
			query.setParameter("email", user.getEmail());
			query.setParameter("mobile", user.getMobile());
			query.setParameter("companyName", user.getCompanyName());
			query.setParameter("createdBy", user.getCreatedBy());
			query.setParameter("updatedBy", user.getUpdatedBy());
			query.setParameter("createdOn", user.getCreatedOn());
			query.setParameter("updatedOn", user.getUpdatedOn());
			
			
			result = query.executeUpdate();
			System.out.println("Rows affected for Insert:" + result);
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
			e.printStackTrace();
		}
		
		return "Data Added";
	}
	
}
