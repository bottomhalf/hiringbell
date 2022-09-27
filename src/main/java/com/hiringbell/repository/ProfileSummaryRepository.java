package com.hiringbell.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ParameterMode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hiringbell.entity.ProfileSummary;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class ProfileSummaryRepository {

	public String addProfileSummaryRepo(ProfileSummary profileSummary) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_ProfileSummary_InsUpdate");
			query.registerParameter("_UserId", Long.class, ParameterMode.IN).bindValue(profileSummary.getUserId());
			query.registerParameter("_ProfileSummary", String.class, ParameterMode.IN).bindValue(profileSummary.getProfileSummary());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(profileSummary.getCreatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("Status " + result);
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx != null)
			{
				tx.rollback();
			}
			e.printStackTrace();
		}
		
		return "Data added in ProfileSummary ";
	}

	public String updateProfileSummarybyUserIdRepo(ProfileSummary profileSummary, long userId) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_ProfileSummary_InsUpdate");
			query.registerParameter("_UserId", Long.class, ParameterMode.IN).bindValue(profileSummary.getUserId());
			query.registerParameter("_ProfileSummary", String.class, ParameterMode.IN).bindValue(profileSummary.getProfileSummary());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(profileSummary.getUpdatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			var result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("Status" + result);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx != null)
			{
				tx.rollback();
			}
			e.printStackTrace();
		}
		return "Data updated for ProfileSummary";
	}

	public ArrayList<ProfileSummary> getByUserIdProfileSummaryRepo(long userId) {
		List<ProfileSummary> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<ProfileSummary> query = session.createSQLQuery("call sp_ProfileSummary_getByUserId(:userId)").addEntity(ProfileSummary.class);
			query.setParameter("userId", userId);
			result = query.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx != null) {
				tx.rollback();
			}
		}
		return (ArrayList<ProfileSummary>) result;
	}

	public ArrayList<ProfileSummary> getAllProfileSummaryRepo() {
		List<ProfileSummary> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println("factory");
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<ProfileSummary> query = session.createSQLQuery("call sp_ProfileSummary_getAll()").addEntity(ProfileSummary.class);
			result = query.list();
			System.out.println(result);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx != null) {
				tx.rollback();
			}
		}
		return (ArrayList<ProfileSummary>) result;
	}

	public String deleteByUserIdProfileSummaryRepo(long userId) {
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			Query<ProfileSummary> query = session.createSQLQuery("call sp_ProfileSummary_deleteByUserId(:userId)").addEntity(ProfileSummary.class);
			query.setParameter("userId", userId);
			result = query.executeUpdate();
			System.out.println("Rows affected " + result);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if( tx != null) {
				tx.rollback();
			}
		}
		return "Data deleted from ProfileSummary";
	}
	
}
