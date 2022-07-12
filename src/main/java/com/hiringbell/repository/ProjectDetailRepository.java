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
import com.hiringbell.entity.ProjectDetail;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class ProjectDetailRepository {
	
	
	public String addProjectDetailRepo(ProjectDetail projectDetail) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try (Session session = factory.openSession()){
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_ProjectDetail_InsUpdate");
			query.registerParameter("_ProjectDetailId", Long.class, ParameterMode.IN).bindValue(projectDetail.getProjectDetailId());
			query.registerParameter("_ProjectTitle", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectTitle());
			query.registerParameter("_ProjectTag", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectTag());
			query.registerParameter("_ProjectWorkingYear", int.class, ParameterMode.IN).bindValue(projectDetail.getProjectWorkingYear());
			query.registerParameter("_ProjectWorkingMonth", int.class, ParameterMode.IN).bindValue(projectDetail.getProjectWorkingMonth());
			query.registerParameter("_ProjectWorkedYear", int.class, ParameterMode.IN).bindValue(projectDetail.getProjectWorkedYear());
			query.registerParameter("_ProjectWorkedMonth", int.class, ParameterMode.IN).bindValue(projectDetail.getProjectWorkedMonth());
			query.registerParameter("_ProjectStatus", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectStatus());
			query.registerParameter("_ClientName", String.class, ParameterMode.IN).bindValue(projectDetail.getClientName());
			query.registerParameter("_ProjectDetails", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectDetails());
			query.registerParameter("_RolesResponsibility", String.class, ParameterMode.IN).bindValue(projectDetail.getRolesResponsibility());
			query.registerParameter("_TechnalogyStack", String.class, ParameterMode.IN).bindValue(projectDetail.getTechnalogyStack());
			query.registerParameter("_ProjectDuration", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectDuration());
			query.registerParameter("_ProjectIndex", int.class, ParameterMode.IN).bindValue(projectDetail.getProjectIndex());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(projectDetail.getCreatedBy());
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
		return "Data added successsfully in ProjectDetail";
	}

	public String updateProjectDetailRepo(ProjectDetail projectDetail, long projectDetailId) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_ProjectDetail_InsUpdate");
			query.registerParameter("_ProjectDetailId", Long.class, ParameterMode.IN).bindValue(projectDetail.getProjectDetailId());
			query.registerParameter("_ProjectTitle", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectTitle());
			query.registerParameter("_ProjectTag", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectTag());
			query.registerParameter("_ProjectWorkingYear", int.class, ParameterMode.IN).bindValue(projectDetail.getProjectWorkingYear());
			query.registerParameter("_ProjectWorkingMonth", int.class, ParameterMode.IN).bindValue(projectDetail.getProjectWorkingMonth());
			query.registerParameter("_ProjectWorkedYear", int.class, ParameterMode.IN).bindValue(projectDetail.getProjectWorkedYear());
			query.registerParameter("_ProjectWorkedMonth", int.class, ParameterMode.IN).bindValue(projectDetail.getProjectWorkedMonth());
			query.registerParameter("_ProjectStatus", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectStatus());
			query.registerParameter("_ClientName", String.class, ParameterMode.IN).bindValue(projectDetail.getClientName());
			query.registerParameter("_ProjectDetails", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectDetails());
			query.registerParameter("_RolesResponsibility", String.class, ParameterMode.IN).bindValue(projectDetail.getRolesResponsibility());
			query.registerParameter("_TechnalogyStack", String.class, ParameterMode.IN).bindValue(projectDetail.getTechnalogyStack());
			query.registerParameter("_ProjectDuration", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectDuration());
			query.registerParameter("_ProjectIndex", int.class, ParameterMode.IN).bindValue(projectDetail.getProjectIndex());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(projectDetail.getUpdatedBy());
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
		return "Data updated for ProjectDetail";
	}
	
	public ArrayList<ProjectDetail> getAllProjectDetailRepo() {
		java.util.List<ProjectDetail> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<ProjectDetail> query = session.createSQLQuery("Call sp_ProjectDetail_getAll()").addEntity(ProjectDetail.class);
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
		return (ArrayList<ProjectDetail>) result;
	}
	
	public ProjectDetail getByIdProjectDetailRepo(long projectDetailId) {
		ProjectDetail result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<ProjectDetail> query = session.createSQLQuery("Call sp_ProjectDetail_getByProjectDetailId(:projectDetailId)").addEntity(ProjectDetail.class);	
			query.setParameter("projectDetailId", projectDetailId);
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
	
	public String deleteByIdProjectDetailRepo(long projectDetailId) {
		int result = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()){
			tx = session.beginTransaction();
			Query<ProjectDetail> query = session.createSQLQuery("Call sp_ProjectDetail_deleteByProjectDetailId(:projectDetailId)").addEntity(ProjectDetail.class);
			query.setParameter("projectDetailId", projectDetailId);
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
		return "Data deleted from ProjectDetail";
	}
}
