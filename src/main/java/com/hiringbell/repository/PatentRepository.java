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

import com.hiringbell.entity.Patent;
import com.hiringbell.entity.Presentation;
import com.hiringbell.entity.ProjectDetail;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class PatentRepository {

	public String addPatentRepository(Patent patent) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_Patent_InsUpdate");
			query.registerParameter("_PatentId", long.class, ParameterMode.IN).bindValue(patent.getPatentId());
			query.registerParameter("_UserId", long.class, ParameterMode.IN).bindValue(patent.getUserId());
			query.registerParameter("_PatentTitle", String.class, ParameterMode.IN).bindValue(patent.getPatentTitle());
			query.registerParameter("_Url", String.class, ParameterMode.IN).bindValue(patent.getUrlPatent());
			query.registerParameter("_PatentOffice", String.class, ParameterMode.IN).bindValue(patent.getPatentOffice());
			query.registerParameter("_PatentStatus", Boolean.class, ParameterMode.IN).bindValue(patent.getPatentStatus());
			query.registerParameter("_ApplicationNumber", String.class, ParameterMode.IN).bindValue(patent.getPatentApplicationNumber());
			query.registerParameter("_YearIssueDate", int.class, ParameterMode.IN).bindValue(patent.getYearIssueDate());
			query.registerParameter("_MonthIssueDate", String.class, ParameterMode.IN).bindValue(patent.getMonthIssueDate());
			query.registerParameter("_Descriptions", String.class, ParameterMode.IN).bindValue(patent.getMonthIssueDate());
			query.registerParameter("_AdminId", long.class, ParameterMode.IN).bindValue(patent.getCreatedBy());
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
		return "Data added successfully in Patent";
		
	}

	public String updatePatentRepository(Patent patent, long patentId) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_Patent_InsUpdate");
			query.registerParameter("_PatentId", long.class, ParameterMode.IN).bindValue(patent.getPatentId());
			query.registerParameter("_UserId", long.class, ParameterMode.IN).bindValue(patent.getUserId());
			query.registerParameter("_PatentTitle", String.class, ParameterMode.IN).bindValue(patent.getPatentTitle());
			query.registerParameter("_Url", String.class, ParameterMode.IN).bindValue(patent.getUrlPatent());
			query.registerParameter("_PatentOffice", String.class, ParameterMode.IN).bindValue(patent.getPatentOffice());
			query.registerParameter("_PatentStatus", Boolean.class, ParameterMode.IN).bindValue(patent.getPatentStatus());
			query.registerParameter("_ApplicationNumber", String.class, ParameterMode.IN).bindValue(patent.getPatentApplicationNumber());
			query.registerParameter("_YearIssueDate", int.class, ParameterMode.IN).bindValue(patent.getYearIssueDate());
			query.registerParameter("_MonthIssueDate", String.class, ParameterMode.IN).bindValue(patent.getMonthIssueDate());
			query.registerParameter("_Descriptions", String.class, ParameterMode.IN).bindValue(patent.getDescriptionPatent());
			query.registerParameter("_AdminId", long.class, ParameterMode.IN).bindValue(patent.getUpdatedBy());
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
		return "Data updated in Patent";
	}
	
	
	public ArrayList<Patent> getAllPatentRepository() {
		List<Patent> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<Patent> query = session.createSQLQuery("Call sp_Patent_getAll()").addEntity(Patent.class);
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
		return (ArrayList<Patent>) result;
	}

	
	public ArrayList<Patent> getPatentByUserIdRepository(long userId) {
		List<Patent> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<Patent> query = session.createSQLQuery("Call sp_Patent_getByUserId(:userId)").addEntity(Patent.class);
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
		return (ArrayList<Patent>) result;
	}

	public String deletePatentByPatentIdRepository(long patentId) {
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			Query<Patent> query = session.createSQLQuery("Call sp_Patent_deleteByPatentId(:patentId)").addEntity(Patent.class);
			query.setParameter("patentId", patentId);
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
		return "Data deleted from Patent";
	}
	
}
