package com.hiringbell.repository;


import java.util.ArrayList;

import javax.persistence.ParameterMode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hiringbell.entity.Company;
import com.hiringbell.entity.EducationalDetail;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class EducationalDetailRepository {
	
	
	public String addEducationalDetailRepo(EducationalDetail educationalDetail) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try (Session session = factory.openSession()){
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_EducationalDetail_InsUpdate");
			query.registerParameter("_EducationalDetailId", Long.class, ParameterMode.IN).bindValue(educationalDetail.getEducationalDetailId());
			query.registerParameter("_DegreeName", String.class, ParameterMode.IN).bindValue(educationalDetail.getDegreeName());
			query.registerParameter("_PassoutYear", String.class, ParameterMode.IN).bindValue(educationalDetail.getPassoutYear());
			query.registerParameter("_Specialization", String.class, ParameterMode.IN).bindValue(educationalDetail.getSpecialization());
			query.registerParameter("_UniversityName", String.class, ParameterMode.IN).bindValue(educationalDetail.getUniversityName());
			query.registerParameter("_CourseType", String.class, ParameterMode.IN).bindValue(educationalDetail.getCourseType());
			query.registerParameter("_GradingSystem", String.class, ParameterMode.IN).bindValue(educationalDetail.getGradingSystem());
			query.registerParameter("_Course", String.class, ParameterMode.IN).bindValue(educationalDetail.getCourse());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(educationalDetail.getCreatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("Status" + result);
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
		return "Data added successfully in EducationalDetail";
	}
	

	public String updateEducationalDetailRepo(EducationalDetail educationalDetail, long educationalDetailId) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try (Session session = factory.openSession()){
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_EducationalDetail_InsUpdate");
			query.registerParameter("_EducationalDetailId", Long.class, ParameterMode.IN).bindValue(educationalDetail.getEducationalDetailId());
			query.registerParameter("_DegreeName", String.class, ParameterMode.IN).bindValue(educationalDetail.getDegreeName());
			query.registerParameter("_PassoutYear", String.class, ParameterMode.IN).bindValue(educationalDetail.getPassoutYear());
			query.registerParameter("_Specialization", String.class, ParameterMode.IN).bindValue(educationalDetail.getSpecialization());
			query.registerParameter("_UniversityName", String.class, ParameterMode.IN).bindValue(educationalDetail.getUniversityName());
			query.registerParameter("_CourseType", String.class, ParameterMode.IN).bindValue(educationalDetail.getCourseType());
			query.registerParameter("_GradingSystem", String.class, ParameterMode.IN).bindValue(educationalDetail.getGradingSystem());
			query.registerParameter("_Course", String.class, ParameterMode.IN).bindValue(educationalDetail.getCourse());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(educationalDetail.getUpdatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("Status" + result);
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
		return "Data Updated of EducationalDetail successfully";	
	}

	public ArrayList<EducationalDetail> getAllEducationalDetailRepo() {
		java.util.List<EducationalDetail> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<EducationalDetail> query = session.createSQLQuery("Call sp_EducationalDetail_getAll()").addEntity(EducationalDetail.class);
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
		
		return (ArrayList<EducationalDetail>) result;
	}
	
	public EducationalDetail getByIdEducationalDetailRepo(long educationalDetailId) {
		EducationalDetail result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<EducationalDetail> query = session.createSQLQuery("Call sp_EducationalDetail_getByEducationalDetailId(:educationalDetailId)").addEntity(EducationalDetail.class);	
			query.setParameter("educationalDetailId", educationalDetailId);
			result = query.getSingleResult();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		return result;
	}

	public String deleteByIdEducationalDetailRepo(long educationalDetailId) {
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession() ) {
			tx = session.beginTransaction();
			Query<EducationalDetail> query = session.createSQLQuery("Call sp_EducationalDetail_deleteByEducationalDetailId(:educationalDetailId)").addEntity(EducationalDetail.class);
			query.setParameter("educationalDetailId", educationalDetailId);
			result = query.executeUpdate();
			System.out.println("Rows affected" + result);
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
		return "Data deleted of EducationDetail on the basis of edId";
		
	}
	
	
	
	
}
