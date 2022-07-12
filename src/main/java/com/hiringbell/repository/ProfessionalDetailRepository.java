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

import com.hiringbell.entity.ProfessionalDetail;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class ProfessionalDetailRepository {
	

	public String addProfessionalDetailRepo(ProfessionalDetail professionalDetail){
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_ProfessionalDetail_InsUpdate");
			query.registerParameter("_UserId", Long.class, ParameterMode.IN).bindValue(professionalDetail.getUserId());
			query.registerParameter("_MobileNumber", String.class, ParameterMode.IN).bindValue(professionalDetail.getMobileNumber());
			query.registerParameter("_Email", String.class, ParameterMode.IN).bindValue(professionalDetail.getEmail());
			query.registerParameter("_FirstName", String.class, ParameterMode.IN).bindValue(professionalDetail.getFirstName());
			query.registerParameter("_LastName", String.class, ParameterMode.IN).bindValue(professionalDetail.getLastName());
			query.registerParameter("_DateOfApplication", Date.class, ParameterMode.IN).bindValue(professionalDetail.getDateOfApplication());
			query.registerParameter("_TotalExperienceInMonths", int.class, ParameterMode.IN).bindValue(professionalDetail.getTotalEperienceinMonths());
			query.registerParameter("_SalaryPackage", Double.class, ParameterMode.IN).bindValue(professionalDetail.getSalaryPackage());
			query.registerParameter("_NoticePeriod", int.class, ParameterMode.IN).bindValue(professionalDetail.getNoticePeriod());
			query.registerParameter("_ExpecetedCTC", Double.class, ParameterMode.IN).bindValue(professionalDetail.getExpecetedCtc());
			query.registerParameter("_CurrentLocation", String.class, ParameterMode.IN).bindValue(professionalDetail.getCurrentLocation());
			query.registerParameter("_PreferredLocations", String.class, ParameterMode.IN).bindValue(professionalDetail.getPreferredLocations());
			query.registerParameter("_ProfessionalDetailJson", String.class, ParameterMode.IN).bindValue(professionalDetail.getProfessionalDetailJson());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(professionalDetail.getCreatedBy());
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
		return "Data Created Successfully in ProfessionalDetail ";
	}
	
	public String updateProfessionalDetailRepo(ProfessionalDetail professionalDetail, long userId){
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_ProfessionalDetail_InsUpdate");
			query.registerParameter("_UserId", Long.class, ParameterMode.IN).bindValue(professionalDetail.getUserId());
			query.registerParameter("_MobileNumber", String.class, ParameterMode.IN).bindValue(professionalDetail.getMobileNumber());
			query.registerParameter("_Email", String.class, ParameterMode.IN).bindValue(professionalDetail.getEmail());
			query.registerParameter("_FirstName", String.class, ParameterMode.IN).bindValue(professionalDetail.getFirstName());
			query.registerParameter("_LastName", String.class, ParameterMode.IN).bindValue(professionalDetail.getLastName());
			query.registerParameter("_DateOfApplication", Date.class, ParameterMode.IN).bindValue(professionalDetail.getDateOfApplication());
			query.registerParameter("_TotalExperienceInMonths", int.class, ParameterMode.IN).bindValue(professionalDetail.getTotalEperienceinMonths());
			query.registerParameter("_SalaryPackage", Double.class, ParameterMode.IN).bindValue(professionalDetail.getSalaryPackage());
			query.registerParameter("_NoticePeriod", int.class, ParameterMode.IN).bindValue(professionalDetail.getNoticePeriod());
			query.registerParameter("_ExpecetedCTC", Double.class, ParameterMode.IN).bindValue(professionalDetail.getExpecetedCtc());
			query.registerParameter("_CurrentLocation", String.class, ParameterMode.IN).bindValue(professionalDetail.getCurrentLocation());
			query.registerParameter("_PreferredLocations", String.class, ParameterMode.IN).bindValue(professionalDetail.getPreferredLocations());
			query.registerParameter("_ProfessionalDetailJson", String.class, ParameterMode.IN).bindValue(professionalDetail.getProfessionalDetailJson());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(professionalDetail.getUpdatedBy());
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
		return "Data Updated Successfully in ProfessionalDetail";
	}

	public ArrayList<ProfessionalDetail> getAllProfessionalDetailRepo(){
		java.util.List<ProfessionalDetail> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			Query<ProfessionalDetail> query = session.createSQLQuery("Call sp_ProfessionalDetail_getAll").addEntity(ProfessionalDetail.class);
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
		return (ArrayList<ProfessionalDetail>) result;
		
	}

	public ProfessionalDetail getByUserIdProfessionalDetailRepo(long userId){
		ProfessionalDetail result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<ProfessionalDetail> query = session.createSQLQuery("Call sp_ProfessionalDetail_getByUserId(:userId)").addEntity(ProfessionalDetail.class);
			query.setParameter("userId", userId);
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
	
	public String deleteByUserIdProfessionalDetailRepo(long userId){
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<ProfessionalDetail> query = session.createSQLQuery("Call sp_ProfessionalDetail_deleteByUserId(:userId)").addEntity(ProfessionalDetail.class);
			query.setParameter("userId", userId);
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
		return "Data deleted Successfully by userId";
	}
	
	
	
	
	
	
	

}
