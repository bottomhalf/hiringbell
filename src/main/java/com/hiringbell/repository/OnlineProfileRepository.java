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

import com.hiringbell.entity.OnlineProfile;
import com.hiringbell.entity.ProjectDetail;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class OnlineProfileRepository {
	
	public String addOnlineProfileRepository(OnlineProfile onlineProfile) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_OnlineProfile_InsUpdate");
			query.registerParameter("_OnlineProfileId", Long.class, ParameterMode.IN).bindValue(onlineProfile.getOnlineProfileId());
			query.registerParameter("_UserId", Long.class, ParameterMode.IN).bindValue(onlineProfile.getUserId());
			query.registerParameter("_SocialProfile", String.class, ParameterMode.IN).bindValue(onlineProfile.getSocialProfile());
			query.registerParameter("_URL", String.class, ParameterMode.IN).bindValue(onlineProfile.getUrl());
			query.registerParameter("_Description", String.class, ParameterMode.IN).bindValue(onlineProfile.getDescription());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(onlineProfile.getCreatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("status" + result);
			tx.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return "Data added successfully in OnlineProfile";
	}

	public String updateOnlineProfileRepository(OnlineProfile onlineProfile, long onlineProfileId) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_OnlineProfile_InsUpdate");
			query.registerParameter("_OnlineProfileId", Long.class, ParameterMode.IN).bindValue(onlineProfile.getOnlineProfileId());
			query.registerParameter("_UserId", Long.class, ParameterMode.IN).bindValue(onlineProfile.getUserId());
			query.registerParameter("_SocialProfile", String.class, ParameterMode.IN).bindValue(onlineProfile.getSocialProfile());
			query.registerParameter("_URL", String.class, ParameterMode.IN).bindValue(onlineProfile.getUrl());
			query.registerParameter("_Description", String.class, ParameterMode.IN).bindValue(onlineProfile.getDescription());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(onlineProfile.getUpdatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("status" + result);
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return "Data Updated Successfylly in OnlineProfile";
	}

	public ArrayList<OnlineProfile> getAllOnlineProfileRepository() {
		List<OnlineProfile> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession() ) {
			tx = session.beginTransaction();
			Query<OnlineProfile> query = session.createSQLQuery("call sp_OnlineProfile_getAll()").addEntity(OnlineProfile.class);
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
		return (ArrayList<OnlineProfile>) result;
	}

	public ArrayList<OnlineProfile> getByUserIdOnlineProfileReporsitory(long userId) {
		List<OnlineProfile> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<OnlineProfile> query = session.createSQLQuery("call sp_OnlineProfile_getByUserId(:userId)").addEntity(OnlineProfile.class);
			query.setParameter("userId", userId);
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
		return (ArrayList<OnlineProfile>) result;
	}

	public String deleteByOnlineProfileIdRepository(long onlineProfileId) {
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			Query<ProjectDetail> query = session.createSQLQuery("call sp_OnlineProfile_deleteByOnlineProfileId(:onlineProfileId)").addEntity(OnlineProfile.class);
			query.setParameter("onlineProfileId", onlineProfileId);
			result = query.executeUpdate();
			System.out.println("Row affected" + result);
			tx.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		return "Data deleted from OnlineProfile";
	}
	
	
	
}
