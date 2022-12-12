package com.hiringbell.repository;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.hiringbell.entity.Board;
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class BoardRepository {
	
	
	public ArrayList<Board> getAllBoardRepo() {
		java.util.List<Board> result = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<Board> query = session.createSQLQuery("call sp_Board_getAll()").addEntity(Board.class);
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
		
		return (ArrayList<Board>) result;
	}

}
