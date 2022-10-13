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
			query.registerParameter("_userId", Long.class, ParameterMode.IN).bindValue(projectDetail.getUserId());
			query.registerParameter("_ProjectTitle", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectTitle());
			query.registerParameter("_Client", String.class, ParameterMode.IN).bindValue(projectDetail.getClient());
			query.registerParameter("_ProjectStatus", Boolean.class, ParameterMode.IN).bindValue(projectDetail.getProjectStatus());
			query.registerParameter("_WorkedFromYears", int.class, ParameterMode.IN).bindValue(projectDetail.getWorkedFromYears());
			query.registerParameter("_WorkedFromMonth", String.class, ParameterMode.IN).bindValue(projectDetail.getWorkedFromMonth());
			query.registerParameter("_WorkedTillYears", int.class, ParameterMode.IN).bindValue(projectDetail.getWorkedFromYears());
			query.registerParameter("_WorkedTillMonth", String.class, ParameterMode.IN).bindValue(projectDetail.getWorkedTillMonth());
			query.registerParameter("_DetailsOfProject", String.class, ParameterMode.IN).bindValue(projectDetail.getDetailsOfProject());
			query.registerParameter("_ProjectLocation", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectLocation());
			query.registerParameter("_ProjectSite", Boolean.class, ParameterMode.IN).bindValue(projectDetail.getProjectSite());
			query.registerParameter("_NatureOfEmployment", String.class, ParameterMode.IN).bindValue(projectDetail.getNatureOfEmployment());
			query.registerParameter("_TeamSize", int.class, ParameterMode.IN).bindValue(projectDetail.getTeamSize());
			query.registerParameter("_Role", String.class, ParameterMode.IN).bindValue(projectDetail.getRole());
			query.registerParameter("_RoleDescription", String.class, ParameterMode.IN).bindValue(projectDetail.getRoleDescription());
			query.registerParameter("_SkillsUsed", String.class, ParameterMode.IN).bindValue(projectDetail.getSkillsUsed());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(projectDetail.getCreatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("Status" + result);
			tx.commit();
			session.close();
		} catch (Exception e) {
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
			query.registerParameter("_userId", Long.class, ParameterMode.IN).bindValue(projectDetail.getUserId());
			query.registerParameter("_ProjectTitle", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectTitle());
			query.registerParameter("_Client", String.class, ParameterMode.IN).bindValue(projectDetail.getClient());
			query.registerParameter("_ProjectStatus", Boolean.class, ParameterMode.IN).bindValue(projectDetail.getProjectStatus());
			query.registerParameter("_WorkedFromYears", int.class, ParameterMode.IN).bindValue(projectDetail.getWorkedFromYears());
			query.registerParameter("_WorkedFromMonth", String.class, ParameterMode.IN).bindValue(projectDetail.getWorkedFromMonth());
			query.registerParameter("_WorkedTillYears", int.class, ParameterMode.IN).bindValue(projectDetail.getWorkedFromYears());
			query.registerParameter("_WorkedTillMonth", String.class, ParameterMode.IN).bindValue(projectDetail.getWorkedTillMonth());
			query.registerParameter("_DetailsOfProject", String.class, ParameterMode.IN).bindValue(projectDetail.getDetailsOfProject());
			query.registerParameter("_ProjectLocation", String.class, ParameterMode.IN).bindValue(projectDetail.getProjectLocation());
			query.registerParameter("_ProjectSite", Boolean.class, ParameterMode.IN).bindValue(projectDetail.getProjectSite());
			query.registerParameter("_NatureOfEmployment", String.class, ParameterMode.IN).bindValue(projectDetail.getNatureOfEmployment());
			query.registerParameter("_TeamSize", int.class, ParameterMode.IN).bindValue(projectDetail.getTeamSize());
			query.registerParameter("_Role", String.class, ParameterMode.IN).bindValue(projectDetail.getRole());
			query.registerParameter("_RoleDescription", String.class, ParameterMode.IN).bindValue(projectDetail.getRoleDescription());
			query.registerParameter("_SkillsUsed", String.class, ParameterMode.IN).bindValue(projectDetail.getSkillsUsed());
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
	
	public ArrayList<ProjectDetail> getByUserIdProjectDetailRepo(long userId) {
		java.util.List<ProjectDetail> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<ProjectDetail> query = session.createSQLQuery("Call sp_ProjectDetail_getByUserId(:userId)").addEntity(ProjectDetail.class);	
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
		return (ArrayList<ProjectDetail>) result;
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
