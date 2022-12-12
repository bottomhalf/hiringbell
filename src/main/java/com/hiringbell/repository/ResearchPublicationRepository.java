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

import com.hiringbell.entity.ResearchPublication;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class ResearchPublicationRepository {

	public String addResearchPublicationRepo(ResearchPublication researchPublication) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_ResearchPublication_InsUpdate");
			query.registerParameter("_ResearchPublicationId", long.class, ParameterMode.IN).bindValue(researchPublication.getResearchPublicationId());
			query.registerParameter("_UserId", long.class, ParameterMode.IN).bindValue(researchPublication.getUserId());
			query.registerParameter("_Title", String.class, ParameterMode.IN).bindValue(researchPublication.getTitleResearchPublication());
			query.registerParameter("_URL", String.class, ParameterMode.IN).bindValue(researchPublication.getUrlResearchPublication());
			query.registerParameter("_YearPublicationOn", int.class, ParameterMode.IN).bindValue(researchPublication.getYearPublicationOn());
			query.registerParameter("_MonthPublicationOn", String.class, ParameterMode.IN).bindValue(researchPublication.getMonthPublicationOn());
			query.registerParameter("_Description", String.class, ParameterMode.IN).bindValue(researchPublication.getDescriptionResearchPublication());
			query.registerParameter("_AdminId", long.class, ParameterMode.IN).bindValue(researchPublication.getCreatedBy());
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
		return "Data added successfully in ResearchPublication";
	}

	public String updateResearchPublicationRepository(ResearchPublication researchPublication,
			long researchPublicationId) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_ResearchPublication_InsUpdate");
			query.registerParameter("_ResearchPublicationId", long.class, ParameterMode.IN).bindValue(researchPublication.getResearchPublicationId());
			query.registerParameter("_UserId", long.class, ParameterMode.IN).bindValue(researchPublication.getUserId());
			query.registerParameter("_Title", String.class, ParameterMode.IN).bindValue(researchPublication.getTitleResearchPublication());
			query.registerParameter("_URL", String.class, ParameterMode.IN).bindValue(researchPublication.getUrlResearchPublication());
			query.registerParameter("_YearPublicationOn", int.class, ParameterMode.IN).bindValue(researchPublication.getYearPublicationOn());
			query.registerParameter("_MonthPublicationOn", String.class, ParameterMode.IN).bindValue(researchPublication.getMonthPublicationOn());
			query.registerParameter("_Description", String.class, ParameterMode.IN).bindValue(researchPublication.getDescriptionResearchPublication());
			query.registerParameter("_AdminId", long.class, ParameterMode.IN).bindValue(researchPublication.getUpdatedBy());
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
		return "Data updated Successfully in Research Publication";	
	}
	
	public ArrayList<ResearchPublication> getAllResearchPublicationRepo() {
		List<ResearchPublication> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<ResearchPublication> query = session.createSQLQuery("Call sp_ResearchPublication_getAll()").addEntity(ResearchPublication.class);
			result = query.list();
			System.out.println(result);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		return (ArrayList<ResearchPublication>) result;
	}

	public ArrayList<ResearchPublication> getResearchPublicationByUserIdRepository(long userId) {
		List<ResearchPublication> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<ResearchPublication> query = session.createSQLQuery("Call sp_ResearchPublication_getByUserId(:userId)").addEntity(ResearchPublication.class);
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
		return (ArrayList<ResearchPublication>) result;
		
	}

	public String deleteResearchPublicationByresearchPublicationIdRepo(long researchPublicationId) {
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			Query<ResearchPublication> query = session.createSQLQuery("Call sp_ResearchPublication_deleteByResearchPublicationId(:researchPublicationId)").addEntity(ResearchPublication.class);
			query.setParameter("researchPublicationId", researchPublicationId);
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
		return "Data deleted from ResearchPublication";
	}

	
}
