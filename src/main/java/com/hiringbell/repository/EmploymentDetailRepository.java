package com.hiringbell.repository;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.ParameterMode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hiringbell.entity.Company;
import com.hiringbell.entity.EmploymentDetail;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class EmploymentDetailRepository {
	
	
	public String addEmploymentDetailRepo(EmploymentDetail employmentDetail) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_EmploymentDetail_InsUpdate");
			query.registerParameter("_EmploymentDetailId", Long.class, ParameterMode.IN).bindValue(employmentDetail.getEmploymentDetailId());
			query.registerParameter("_UserId", Long.class, ParameterMode.IN).bindValue(employmentDetail.getUserId());
			query.registerParameter("_Designation", String.class, ParameterMode.IN).bindValue(employmentDetail.getDesignation());
			query.registerParameter("_CompanyName", String.class, ParameterMode.IN).bindValue(employmentDetail.getCompanyName());
			query.registerParameter("_IsCurrentCompany", boolean.class , ParameterMode.IN).bindValue(employmentDetail.getIsCurrentCompany());
			query.registerParameter("_JoiningDate", Date.class, ParameterMode.IN).bindValue(employmentDetail.getJoiningDate());
			query.registerParameter("_WorkedTill", Date.class, ParameterMode.IN).bindValue(employmentDetail.getWorkedTill());
			query.registerParameter("_CurrencyType", boolean.class, ParameterMode.IN).bindValue(employmentDetail.getCurrencyType());
			query.registerParameter("_currentAnnualSalary", double.class, ParameterMode.IN).bindValue(employmentDetail.getCurrentAnnualSalary());
			query.registerParameter("_SkillsUsed", String.class, ParameterMode.IN).bindValue(employmentDetail.getSkillsUsed());
			query.registerParameter("_JobProfile", String.class, ParameterMode.IN).bindValue(employmentDetail.getJobProfile());
			query.registerParameter("_NoticePeriod", int.class, ParameterMode.IN).bindValue(employmentDetail.getNoticePeriod());
			query.registerParameter("_IsServingNoticePeriod", boolean.class, ParameterMode.IN).bindValue(employmentDetail.getIsServingNoticePeriod());
			query.registerParameter("_RemainingDaysOfNoticePeriod", int.class, ParameterMode.IN).bindValue(employmentDetail.getRemainingDaysOfNoticePeriod());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(employmentDetail.getCreatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("Status" + result);
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
		return "Data Created in EmploymentDetail successfully";
	}
	
	public String updateEmploymentDetailRepo(EmploymentDetail employmentDetail, long employmentDetailId){
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_EmploymentDetail_InsUpdate");
			query.registerParameter("_EmploymentDetailId", Long.class, ParameterMode.IN).bindValue(employmentDetail.getEmploymentDetailId());
			query.registerParameter("_UserId", Long.class, ParameterMode.IN).bindValue(employmentDetail.getUserId());
			query.registerParameter("_Designation", String.class, ParameterMode.IN).bindValue(employmentDetail.getDesignation());
			query.registerParameter("_CompanyName", String.class, ParameterMode.IN).bindValue(employmentDetail.getCompanyName());
			query.registerParameter("_IsCurrentCompany", boolean.class , ParameterMode.IN).bindValue(employmentDetail.getIsCurrentCompany());
			query.registerParameter("_JoiningDate", Date.class, ParameterMode.IN).bindValue(employmentDetail.getJoiningDate());
			query.registerParameter("_WorkedTill", Date.class, ParameterMode.IN).bindValue(employmentDetail.getWorkedTill());
			query.registerParameter("_CurrencyType", boolean.class, ParameterMode.IN).bindValue(employmentDetail.getCurrencyType());
			query.registerParameter("_currentAnnualSalary", double.class, ParameterMode.IN).bindValue(employmentDetail.getCurrentAnnualSalary());
			query.registerParameter("_SkillsUsed", String.class, ParameterMode.IN).bindValue(employmentDetail.getSkillsUsed());
			query.registerParameter("_JobProfile", String.class, ParameterMode.IN).bindValue(employmentDetail.getJobProfile());
			query.registerParameter("_NoticePeriod", int.class, ParameterMode.IN).bindValue(employmentDetail.getNoticePeriod());
			query.registerParameter("_IsServingNoticePeriod", boolean.class, ParameterMode.IN).bindValue(employmentDetail.getIsServingNoticePeriod());
			query.registerParameter("_RemainingDaysOfNoticePeriod", int.class, ParameterMode.IN).bindValue(employmentDetail.getRemainingDaysOfNoticePeriod());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(employmentDetail.getUpdatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("Status" + result);
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
		return "Data updated successfully in EmploymentDetail";
	}

	public ArrayList<EmploymentDetail> getAllEmploymentDetailRepo() {
		java.util.List<EmploymentDetail> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<EmploymentDetail> query = session.createSQLQuery("Call sp_EmploymentDetail_getAll()").addEntity(EmploymentDetail.class);
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
		return (ArrayList<EmploymentDetail>)result;
	}
	
	public ArrayList<EmploymentDetail> getByUserIdEmploymentDetailRepo(long userId) {
		java.util.List<EmploymentDetail> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<EmploymentDetail> query = session.createSQLQuery("Call sp_EmploymentDetail_getByUserId(:userId)").addEntity(EmploymentDetail.class);	
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
		return (ArrayList<EmploymentDetail>)result;
	}

	
	public String deleteByIdEmploymentDetailRepo(long employmentDetailId) {
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<EmploymentDetail> query = session.createSQLQuery("Call sp_EmploymentDetail_deleteByEmploymentDetailId(:employmentDetailId)").addEntity(EmploymentDetail.class);	
			query.setParameter("employmentDetailId", employmentDetailId);
			result = query.executeUpdate();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
		}
	return "Data deleted from EmploymentDetail by empDetailId";
		
	}

}
