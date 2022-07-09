package com.hiringbell.repository;

import java.sql.Date;

import javax.persistence.ParameterMode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;
import org.springframework.stereotype.Repository;

import com.hiringbell.entity.PersonalDetail;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class PersonalDetailRepository {
	
	
	public String addPersonalDetailRepo (PersonalDetail personalDetail) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		
		try (Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_PersonalDetail_InsUpdate");
			query.registerParameter("_personalDetailId", Long.class, ParameterMode.IN).bindValue(personalDetail.getPersonalDetailId());
			query.registerParameter("_DOB", Date.class, ParameterMode.IN).bindValue(personalDetail.getDob());
			query.registerParameter("_Gender", String.class, ParameterMode.IN).bindValue(personalDetail.getGender());
			query.registerParameter("_Address", String.class, ParameterMode.IN).bindValue(personalDetail.getAddress());
			query.registerParameter("_HomeTown", String.class, ParameterMode.IN).bindValue(personalDetail.getHomeTown());
			query.registerParameter("_PinCode", int.class, ParameterMode.IN).bindValue(personalDetail.getPinCode());
			query.registerParameter("_MaritalStatus", String.class, ParameterMode.IN).bindValue(personalDetail.getMaritalStatus());
			query.registerParameter("_Category", String.class, ParameterMode.IN).bindValue(personalDetail.getCategory());
			query.registerParameter("_DifferentlyAbled", String.class, ParameterMode.IN).bindValue(personalDetail.getDifferentlyAbled());
			query.registerParameter("_PermitUSA", String.class, ParameterMode.IN).bindValue(personalDetail.getPermitUSA());
			query.registerParameter("_PermitOtherCountry", String.class, ParameterMode.IN).bindValue(personalDetail.getPermitOtherCountry());
			query.registerParameter("_LanguageDetails", String.class, ParameterMode.IN).bindValue(personalDetail.getPermitUSA());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(personalDetail.getCreatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
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
		return "Data added successfully in PersonalDetail";
	}

	public String updatePersonalDetailRepo(PersonalDetail personalDetail, long personalDetailId) {
		return "Data updated for PersonalDetail successfully";
	}
	
	
	public String getAllPersonalDetailRepo() {
		return "Got All data of PersonalDetail successfully";
	}
	
	public String getByIdPersonalDetailRepo(long personalDetailId) {
		return "Got data of PersonalDetail on the basis of personalDetailId";
	}

	public String deleteByIdPersonalDetailRepo(long personalDetailId) {
		return "Data deleted of PersonalDetail on the basis of personalDetailId";
		
	}
}
