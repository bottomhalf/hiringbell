package com.hiringbell.repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ParameterMode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hiringbell.entity.SkillDetail;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class SkillDetailRepository {

	public String addSkillDetailRepo(SkillDetail skillDetail) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_SkillDetail_InsUpdate");
			query.registerParameter("_SkillDetailId", Long.class, ParameterMode.IN).bindValue(skillDetail.getSkillDetailId());
			query.registerParameter("_SkillIndex", int.class, ParameterMode.IN).bindValue(skillDetail.getSkillIndex());
			query.registerParameter("_Language", String.class, ParameterMode.IN).bindValue(skillDetail.getLanguage());
			query.registerParameter("_Version", int.class, ParameterMode.IN).bindValue(skillDetail.getVersion());
			query.registerParameter("_LastUsed", Date.class, ParameterMode.IN).bindValue(skillDetail.getLastUsed());
			query.registerParameter("_ExperienceInYear", int.class, ParameterMode.IN).bindValue(skillDetail.getExperienceInYear());
			query.registerParameter("_ExperienceInMonth", int.class, ParameterMode.IN).bindValue(skillDetail.getExperienceInMonth());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(skillDetail.getCreatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("Status:" + result);
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
		return "Data added successfully in SkillDetail";	
	}
	

	public String updateSkillDetailRepo(SkillDetail skillDetail, long skillDetailId) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_SkillDetail_InsUpdate");
			query.registerParameter("_SkillDetailId", Long.class, ParameterMode.IN).bindValue(skillDetail.getSkillDetailId());
			query.registerParameter("_SkillIndex", int.class, ParameterMode.IN).bindValue(skillDetail.getSkillIndex());
			query.registerParameter("_Language", String.class, ParameterMode.IN).bindValue(skillDetail.getLanguage());
			query.registerParameter("_Version", int.class, ParameterMode.IN).bindValue(skillDetail.getVersion());
			query.registerParameter("_LastUsed", Date.class, ParameterMode.IN).bindValue(skillDetail.getLastUsed());
			query.registerParameter("_ExperienceInYear", int.class, ParameterMode.IN).bindValue(skillDetail.getExperienceInYear());
			query.registerParameter("_ExperienceInMonth", int.class, ParameterMode.IN).bindValue(skillDetail.getExperienceInMonth());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(skillDetail.getUpdatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("Status:" + result);
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
		return "Data Updated Successfully of SkillDetail";
	}
	
	public ArrayList<SkillDetail> getAllSkillDetailRepo() {
		java.util.List<SkillDetail> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<SkillDetail> query = session.createSQLQuery("Call sp_SkillDetail_getAll").addEntity(SkillDetail.class);
			result = query.list();
			System.out.println(result);
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
		return (ArrayList<SkillDetail>) result;
	}
	
	public SkillDetail getByIdSkillDetailRepo(long skillDetailId) {
		SkillDetail result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			Query<SkillDetail> query = session.createSQLQuery("Call sp_SkillDetail_getBySkillDetailId(:skillDetailId)").addEntity(SkillDetail.class);
			query.setParameter("skillDetailId", skillDetailId);
			result = query.getSingleResult();
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
		return result;
	}
	
	public String deleteByIdSkillDetailRepo(long skillDetailId) {
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			Query<SkillDetail> query = session.createSQLQuery("Call sp_SkillDetail_deleteBySkillDetailId(:skillDetailId)").addEntity(SkillDetail.class);
			query.setParameter("skillDetailId", skillDetailId);
			result = query.executeUpdate();
			System.out.println("Rows Affected" + result);
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
		return "Data deleted from SkilDetail by skillDetailId";
	}
}
