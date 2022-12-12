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

import com.hiringbell.entity.Presentation;
import com.hiringbell.entity.ProjectDetail;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class PresentationRepository {

	
	public String PresentationRepository(Presentation presentation) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_Presentation_InsUpdate");
			query.registerParameter("_PresentationId", long.class, ParameterMode.IN).bindValue(presentation.getPresentationId());
			query.registerParameter("_UserId", long.class, ParameterMode.IN).bindValue(presentation.getUserId());
			query.registerParameter("_PresentationTitle", String.class, ParameterMode.IN).bindValue(presentation.getPresentationTitle());
			query.registerParameter("_Url", String.class, ParameterMode.IN).bindValue(presentation.getUrlPresentation());
			query.registerParameter("_Descriptions", String.class, ParameterMode.IN).bindValue(presentation.getDescriptionPresentation());
			query.registerParameter("_AdminId", long.class, ParameterMode.IN).bindValue(presentation.getCreatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("Status" + result);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return "Data added successfullly in Presentation";
	}

	
	public String updatePresentationRepository(Presentation presentation, long presentationId) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_Presentation_InsUpdate");
			query.registerParameter("_PresentationId", long.class, ParameterMode.IN).bindValue(presentation.getPresentationId());
			query.registerParameter("_UserId", long.class, ParameterMode.IN).bindValue(presentation.getUserId());
			query.registerParameter("_PresentationTitle", String.class, ParameterMode.IN).bindValue(presentation.getPresentationTitle());
			query.registerParameter("_Url", String.class, ParameterMode.IN).bindValue(presentation.getUrlPresentation());
			query.registerParameter("_Descriptions", String.class, ParameterMode.IN).bindValue(presentation.getDescriptionPresentation());
			query.registerParameter("_AdminId", long.class, ParameterMode.IN).bindValue(presentation.getUpdatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("Status" + result);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return "Data updated in Presentation";
	}


	public ArrayList<Presentation> getAllPresentationRepository() {
		List<Presentation> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<Presentation> query = session.createSQLQuery("Call sp_Presentation_getAll()").addEntity(Presentation.class);
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
		return (ArrayList<Presentation>) result;
		
	}


	public ArrayList<Presentation> getPresentationByUserIdRepo(long userId) {
		List<Presentation> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<Presentation> query = session.createSQLQuery("Call sp_Presentation_getByUserId(:userId)").addEntity(Presentation.class);
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
		return (ArrayList<Presentation>) result;
	}


	public String deletePresentationByPresentationIdRepo(long presentationId) {
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			Query<Presentation> query = session.createSQLQuery("Call sp_Presentation_deleteByPresentationId(:presentationId)").addEntity(ProjectDetail.class);
			query.setParameter("presentationId", presentationId);
			result = query.executeUpdate();
			System.out.println("Row affected" + result);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		return "Data deleted from Presentation";
	}
	
}
