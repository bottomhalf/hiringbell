package com.hiringbell.repository;

import java.util.ArrayList;

import javax.persistence.ParameterMode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hiringbell.entity.AccomplishmentsDetail;
import com.hiringbell.entity.User;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class AccomplishmentsDetailRepo {

	public String addAccomplishmentsDetailRepo(AccomplishmentsDetail accomplishmentsDetail) {
		
		int rowsCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_AccomplishmentsDetail_InsUpdate");
			query.registerParameter("_AccomplishmentId", Long.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getAccomplishmentId());
			query.registerParameter("_OnlineProfile", String.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getOnlineProfile());
			query.registerParameter("_WorkSample", String.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getWorkSample());
			query.registerParameter("_Research", String.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getResearch());
			query.registerParameter("_Presentation", String.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getPresentation());
			query.registerParameter("_Patent", String.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getPatent());
			query.registerParameter("_Certification", String.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getCertification());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getCreatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowsCount = query.executeUpdate();
			System.out.println("Status : " + result);
			
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
		return "Data added successfully in AccomplishmentsDetail ";
	}
	
	
	public String updateAccomplishmentsDetailRepo(AccomplishmentsDetail accomplishmentsDetail, long accomplishmentId) {
		int rowsCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_AccomplishmentsDetail_InsUpdate");
			query.registerParameter("_AccomplishmentId", Long.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getAccomplishmentId());
			query.registerParameter("_OnlineProfile", String.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getOnlineProfile());
			query.registerParameter("_WorkSample", String.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getWorkSample());
			query.registerParameter("_Research", String.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getResearch());
			query.registerParameter("_Presentation", String.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getPresentation());
			query.registerParameter("_Patent", String.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getPatent());
			query.registerParameter("_Certification", String.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getCertification());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(accomplishmentsDetail.getUpdatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowsCount = query.executeUpdate();
			System.out.println("Status : " + result);
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
		
		
		
		return "Data updated successfully in AccomplishmentDetail";
	}


	public ArrayList<AccomplishmentsDetail> getAllAccomplishmentsDetailRepo() {
		java.util.List<AccomplishmentsDetail> allDetail = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<AccomplishmentsDetail> query = session.createSQLQuery("Call sp_AccomplishmentsDetail_getAll()").addEntity(AccomplishmentsDetail.class);
			allDetail = query.list();
			System.out.println(allDetail);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		return (ArrayList<AccomplishmentsDetail>) allDetail;
	}
	
	
	
	public AccomplishmentsDetail getByIdAccomplishmentsDetailRepo(long accomplishmentId) {
		AccomplishmentsDetail userDetail = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<AccomplishmentsDetail> query = session.createSQLQuery("Call sp_AccomplishmentsDetail_getByAccomplishmentId(:accomplishmentId)").addEntity(AccomplishmentsDetail.class);
			query.setParameter("accomplishmentId", accomplishmentId);
			userDetail = query.getSingleResult();
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
		return userDetail;
	}
	
	
	public String deleteByIdAccomplishmentsDetailRepo(long accomplishmentId) {
		
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<AccomplishmentsDetail> query = session.createSQLQuery("Call sp_AccomplishmentsDetail_deleteByAccomplishmentId(:accomplishmentId)").addEntity(AccomplishmentsDetail.class);
			query.setParameter("accomplishmentId", accomplishmentId);
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
		return "Data deleted of AccomplishDetail on the basis of accomplishmentId";
	}
	
	
	

}
