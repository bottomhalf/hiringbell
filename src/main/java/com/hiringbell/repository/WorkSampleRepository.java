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

import com.hiringbell.entity.ProjectDetail;
import com.hiringbell.entity.WorkSample;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class WorkSampleRepository {
	
	
	public String addWorkSampleRepository(WorkSample workSample) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_WorkSample_InsUpdate");
			query.registerParameter("_WorkSampleId", long.class, ParameterMode.IN).bindValue(workSample.getWorkSampleId());
			query.registerParameter("_UserId", long.class, ParameterMode.IN).bindValue(workSample.getUserId());
			query.registerParameter("_WorkTitle", String.class, ParameterMode.IN).bindValue(workSample.getWorkTitle());
			query.registerParameter("_UrlWorkSample", String.class, ParameterMode.IN).bindValue(workSample.getUrlWorkSample());
			query.registerParameter("_YearDurationFrom", int.class, ParameterMode.IN).bindValue(workSample.getYearDurationFrom());
			query.registerParameter("_MonthDurationFrom", String.class, ParameterMode.IN).bindValue(workSample.getMonthDurationFrom());
			query.registerParameter("_YearDurationTo", int.class, ParameterMode.IN).bindValue(workSample.getYearDurationTo());
			query.registerParameter("_MonthDurationTo", String.class, ParameterMode.IN).bindValue(workSample.getMonthDurationTo());
			query.registerParameter("_IsCurrentWorking", boolean.class, ParameterMode.IN).bindValue(workSample.getIsCurrentWorking());
			query.registerParameter("_DescriptionWorkSample", String.class, ParameterMode.IN).bindValue(workSample.getDescriptionWorkSample());
			query.registerParameter("_AdminId", long.class, ParameterMode.IN).bindValue(workSample.getCreatedBy());
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
		return "Data added successfully in WorkSample";
	}

	public String updateByworkSampleIdWorkSampleRepo(WorkSample workSample, long workSampleId) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_WorkSample_InsUpdate");
			query.registerParameter("_WorkSampleId", long.class, ParameterMode.IN).bindValue(workSample.getWorkSampleId());
			query.registerParameter("_UserId", long.class, ParameterMode.IN).bindValue(workSample.getUserId());
			query.registerParameter("_WorkTitle", String.class, ParameterMode.IN).bindValue(workSample.getWorkTitle());
			query.registerParameter("_UrlWorkSample", String.class, ParameterMode.IN).bindValue(workSample.getUrlWorkSample());
			query.registerParameter("_YearDurationFrom", int.class, ParameterMode.IN).bindValue(workSample.getYearDurationFrom());
			query.registerParameter("_MonthDurationFrom", String.class, ParameterMode.IN).bindValue(workSample.getMonthDurationFrom());
			query.registerParameter("_YearDurationTo", int.class, ParameterMode.IN).bindValue(workSample.getYearDurationTo());
			query.registerParameter("_MonthDurationTo", String.class, ParameterMode.IN).bindValue(workSample.getMonthDurationTo());
			query.registerParameter("_IsCurrentWorking", boolean.class, ParameterMode.IN).bindValue(workSample.getIsCurrentWorking());
			query.registerParameter("_DescriptionWorkSample", String.class, ParameterMode.IN).bindValue(workSample.getDescriptionWorkSample());
			query.registerParameter("_AdminId", long.class, ParameterMode.IN).bindValue(workSample.getUpdatedBy());
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
		return "Data updated successfully in WorkSample";
	}
	
	public ArrayList<WorkSample> getAllWorkSampleRepository() {
		List<WorkSample> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<WorkSample> query = session.createSQLQuery("Call sp_WorkSample_getAll()").addEntity(WorkSample.class);
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
		return (ArrayList<WorkSample>) result;
	}

	public ArrayList<WorkSample> getByUserIdWorkSampleRepository(long userId) {
		List<WorkSample> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<WorkSample> query = session.createSQLQuery("Call sp_WorkSample_getByUserId(:userId)").addEntity(WorkSample.class);
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
		return (ArrayList<WorkSample>) result;
	}

	public String deleteByworkSampleIdWorkSampleRepo(long workSampleId) {
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			Query<ProjectDetail> query = session.createSQLQuery("Call sp_WorkSample_DeleteByWorkSampleId(:workSampleId)").addEntity(WorkSample.class);
			query.setParameter("workSampleId", workSampleId);
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
		return "Data deleted from Work Sample";
	}
	
	

}
