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

import com.hiringbell.entity.ItSkills;
import com.hiringbell.entity.ProjectDetail;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class ItSkillsRepository {
	
	
	public String addItSkillRepo(ItSkills itSkills) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_ItSkills_InsUpdate");
			query.registerParameter("_ItSkillId", long.class, ParameterMode.IN).bindValue(itSkills.getItSkillId());
			query.registerParameter("_UserId", long.class, ParameterMode.IN).bindValue(itSkills.getUserId());
			query.registerParameter("_ItSkillName", String.class, ParameterMode.IN).bindValue(itSkills.getItSkillName());
			query.registerParameter("_SoftwareVersion", String.class, ParameterMode.IN).bindValue(itSkills.getSoftwareVersion());
			query.registerParameter("_LastUsed", Integer.class, ParameterMode.IN).bindValue(itSkills.getLastUsed());
			query.registerParameter("_YearsExperience", Integer.class, ParameterMode.IN).bindValue(itSkills.getYearsExperienceItSkill());
			query.registerParameter("_MonthExperience", Integer.class, ParameterMode.IN).bindValue(itSkills.getMonthExperienceItSkill());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(itSkills.getCreatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("status " + result);
			tx.commit();
			session.close();			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return "Data added successfully";
	}
	
	public String updateItSkillsByItSkillIdRepo(ItSkills itSkills, long itSkillId) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_ItSkills_InsUpdate");
			query.registerParameter("_ItSkillId", Long.class, ParameterMode.IN).bindValue(itSkills.getItSkillId());
			query.registerParameter("_UserId", Long.class, ParameterMode.IN).bindValue(itSkills.getUserId());
			query.registerParameter("_ItSkillName", String.class, ParameterMode.IN).bindValue(itSkills.getItSkillName());
			query.registerParameter("_SoftwareVersion", String.class, ParameterMode.IN).bindValue(itSkills.getSoftwareVersion());
			query.registerParameter("_LastUsed", Integer.class, ParameterMode.IN).bindValue(itSkills.getLastUsed());
			query.registerParameter("_YearsExperience", Integer.class, ParameterMode.IN).bindValue(itSkills.getYearsExperienceItSkill());
			query.registerParameter("_MonthExperience", Integer.class, ParameterMode.IN).bindValue(itSkills.getMonthExperienceItSkill());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(itSkills.getUpdatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("status " + result);
			tx.commit();
			session.close();			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		
		return "Data updated successfully";
	}
	
	public ArrayList<ItSkills> getAllItSkillsRepo() {
		List<ItSkills> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<ItSkills> query = session.createSQLQuery("call sp_ItSkills_getAll()").addEntity(ItSkills.class);
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
		return (ArrayList<ItSkills>) result;
	}

	public ArrayList<ItSkills> getByUserIdItSkillsRepo(long userId) {
		List<ItSkills> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<ItSkills> query = session.createSQLQuery("Call sp_ItSkills_getByUserId(:userId)").addEntity(ItSkills.class);	
			query.setParameter("userId", userId);
			//result = query.getSingleResult();
			result = query.list();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		return (ArrayList<ItSkills>) result;
	}

	public String deleteByitSkillIdItSkillsRepo(long itSkillId) {
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			Query<ItSkills> query = session.createSQLQuery("Call sp_ItSkills_deleteByItSkillId(:itSkillId)").addEntity(ItSkills.class);
			query.setParameter("itSkillId", itSkillId);
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
		
		return "Data Deleted from ItSkills";	
	}
	
}
