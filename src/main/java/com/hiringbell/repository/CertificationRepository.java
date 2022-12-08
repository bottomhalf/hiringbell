package com.hiringbell.repository;

import javax.persistence.ParameterMode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;
import org.springframework.stereotype.Repository;

import com.hiringbell.entity.Certification;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class CertificationRepository {

	public String addCertificationRepository(Certification certification) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_Certification_InsUpdate");
			query.registerParameter("_CertificationId", long.class, ParameterMode.IN).bindValue(certification.getCertificationId());
			
			
			query.registerParameter("_AdminId", long.class, ParameterMode.IN).bindValue(certification.getCreatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowCount = query.executeUpdate();
			System.out.println("Status" + result);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		
		return "Data inserted in Certificate";
		
	}

}
