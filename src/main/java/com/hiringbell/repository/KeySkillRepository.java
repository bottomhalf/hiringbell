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

import com.hiringbell.entity.KeySkill;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class KeySkillRepository {

	public String addKeySkillRepository(KeySkill keySkill) {
		int rowCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_KeySkill_InsUpdate");
			query.registerParameter("_KeySkillId", Long.class, ParameterMode.IN).bindValue(keySkill.getKeySkillId());
			query.registerParameter("_UserId", Long.class, ParameterMode.IN).bindValue(keySkill.getUserId());
			query.registerParameter("_KeySkill", String.class, ParameterMode.IN).bindValue(keySkill.getKeySkill());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(keySkill.getCreatedBy());
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
		
		return "Data Successfully created in KeySkill";
	}
	
	public String updateKeySkillByKeySkillIdRepo(KeySkill keySkill, long keySkillId) {
			int rowCount = 0;
			Transaction tx = null;
			SessionFactory factory = HibernateUtil.getSessionFactory();
			System.out.println(factory);
			try(Session session = factory.openSession()) {
				tx = session.beginTransaction();
				ProcedureCall query = session.createStoredProcedureCall("sp_KeySkill_InsUpdate");
				query.registerParameter("_KeySkillId", Long.class, ParameterMode.IN).bindValue(keySkill.getKeySkillId());
				query.registerParameter("_UserId", Long.class, ParameterMode.IN).bindValue(keySkill.getUserId());
				query.registerParameter("_KeySkill", String.class, ParameterMode.IN).bindValue(keySkill.getKeySkill());
				query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(keySkill.getUpdatedBy());
				query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
				var result = query.getOutputParameterValue("_ProcessingResult").toString();
				rowCount = query.executeUpdate();
				System.out.println("Status" + result);
				tx.commit();
				session.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				if(tx != null) {
					tx.commit();
				}
				e.printStackTrace();
			}
		return "Data updated in KeySkill";
	}

	public ArrayList<KeySkill> getAllKeySkillRepo() {
		List<KeySkill> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<KeySkill> query = session.createSQLQuery("call sp_KeySkill_getAll()").addEntity(KeySkill.class);
			result = query.list();
			System.out.println(result);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx != null) {
				tx.commit();
			}
		}
		return (ArrayList<KeySkill>) result;
	}

	public KeySkill getByUserIdKeySkillRepo(long userId) {
		KeySkill result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<KeySkill> query = session.createSQLQuery("call sp_KeySkill_getByUserId(:userId)").addEntity(KeySkill.class);
			query.setParameter("userId", userId);
			//result = query.list();
			result = query.getSingleResult();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx != null) {
				tx.rollback();
			}
		}
		return result;
	}

	public String deleteByKeySkillIdKeySkillRepo(long keySkillId) {
		
		
		
		return "Data deleted from KeySkill";
	}

}
