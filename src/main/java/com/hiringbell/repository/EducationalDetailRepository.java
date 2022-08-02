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
			query.registerParameter("_Education", int.class, ParameterMode.IN).bindValue(educationalDetail.getEducation());
			query.registerParameter("_Board", int.class, ParameterMode.IN).bindValue(educationalDetail.getBoard());
			query.registerParameter("_SchoolMedium", int.class, ParameterMode.IN).bindValue(educationalDetail.getSchoolMedium());
			query.registerParameter("_TotalMarks", double.class, ParameterMode.IN).bindValue(educationalDetail.getTotalMarks());
			query.registerParameter("_EnglishMarks", double.class, ParameterMode.IN).bindValue(educationalDetail.getEnglishMarks());
			query.registerParameter("_MathsMarks", double.class, ParameterMode.IN).bindValue(educationalDetail.getMathsMarks());
			query.registerParameter("_Course", int.class, ParameterMode.IN).bindValue(educationalDetail.getCourse());
			query.registerParameter("_OtherCourse", String.class, ParameterMode.IN).bindValue(educationalDetail.getOtherCourse());
			query.registerParameter("_Specialization", int.class, ParameterMode.IN).bindValue(educationalDetail.getSpecialization());
			query.registerParameter("_OtherSpecialization", String.class, ParameterMode.IN).bindValue(educationalDetail.getOtherSpecialization());
			query.registerParameter("_UniversityInstitute", String.class, ParameterMode.IN).bindValue(educationalDetail.getUniversityInstitute());
			query.registerParameter("_CourseType", int.class, ParameterMode.IN).bindValue(educationalDetail.getCourseType());
			query.registerParameter("_PassingOutYear", int.class, ParameterMode.IN).bindValue(educationalDetail.getPassingOutYear());
			query.registerParameter("_GradingSystem", int.class, ParameterMode.IN).bindValue(educationalDetail.getGradingSystem());
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
			query.registerParameter("_Education", int.class, ParameterMode.IN).bindValue(educationalDetail.getEducation());
			query.registerParameter("_Board", int.class, ParameterMode.IN).bindValue(educationalDetail.getBoard());
			query.registerParameter("_SchoolMedium", int.class, ParameterMode.IN).bindValue(educationalDetail.getSchoolMedium());
			query.registerParameter("_TotalMarks", double.class, ParameterMode.IN).bindValue(educationalDetail.getTotalMarks());
			query.registerParameter("_EnglishMarks", double.class, ParameterMode.IN).bindValue(educationalDetail.getEnglishMarks());
			query.registerParameter("_MathsMarks", double.class, ParameterMode.IN).bindValue(educationalDetail.getMathsMarks());
			query.registerParameter("_Course", int.class, ParameterMode.IN).bindValue(educationalDetail.getCourse());
			query.registerParameter("_OtherCourse", String.class, ParameterMode.IN).bindValue(educationalDetail.getOtherCourse());
			query.registerParameter("_Specialization", int.class, ParameterMode.IN).bindValue(educationalDetail.getSpecialization());
			query.registerParameter("_OtherSpecialization", String.class, ParameterMode.IN).bindValue(educationalDetail.getOtherSpecialization());
			query.registerParameter("_UniversityInstitute", String.class, ParameterMode.IN).bindValue(educationalDetail.getUniversityInstitute());
			query.registerParameter("_CourseType", int.class, ParameterMode.IN).bindValue(educationalDetail.getCourseType());
			query.registerParameter("_PassingOutYear", int.class, ParameterMode.IN).bindValue(educationalDetail.getPassingOutYear());
			query.registerParameter("_GradingSystem", int.class, ParameterMode.IN).bindValue(educationalDetail.getGradingSystem());
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
