package com.hiringbell.repository;

import java.sql.Date;

import javax.persistence.ParameterMode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;
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
		return "Data Updated Successfully of SkillDetail";
	}
	
	public String getAllSkillDetailRepo() {
		return "Got all the data of SkillDetail";
	}
	
	public String getByIdSkillDetailRepo(long skillDetailId) {
		return "Got data from SkillDetail by skillDetailId";
	}
	
	public String deleteByIdSkillDetailRepo(long skillDetailId) {
		return "Data deleted from SkilDetail by skillDetailId";
	}
	
	
	

}
