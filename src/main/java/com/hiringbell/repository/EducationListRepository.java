package com.hiringbell.repository;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hiringbell.entity.EducationList;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class EducationListRepository {
	
	
	public ArrayList<EducationList> getAllEducationListServiceRepo() {
		java.util.List<EducationList> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<EducationList> query =  session.createSQLQuery("call sp_EducationList_getAll()").addEntity(EducationList.class);
			result = query.list();
			System.out.println(result);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx!=null) {
				tx.rollback();
			}
		}
		return (ArrayList<EducationList>) result;
	}
	
}
