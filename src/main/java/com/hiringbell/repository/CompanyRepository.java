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
import com.hiringbell.securityConfig.HibernateUtil;

@Repository
public class CompanyRepository {
	
	public String addCompanyRepo(Company company) {
		int rowsCount = 0;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			ProcedureCall query = session.createStoredProcedureCall("sp_Company_InsUpdate");
			query.registerParameter("_CompanyId", Long.class, ParameterMode.IN).bindValue(company.getCompanyId());
			query.registerParameter("_Role", String.class, ParameterMode.IN).bindValue(company.getRole());
			query.registerParameter("_Industry", String.class, ParameterMode.IN).bindValue(company.getIndustry());
			query.registerParameter("_Designation", String.class, ParameterMode.IN).bindValue(company.getDesignation());
			query.registerParameter("_CompanyName", String.class, ParameterMode.IN).bindValue(company.getCompanyName());
			query.registerParameter("_FunctionalArea", String.class, ParameterMode.IN).bindValue(company.getFunctionalArea());
			query.registerParameter("_DesiredTypePermanent", String.class, ParameterMode.IN).bindValue(company.getDesiredTypePermanent());
			query.registerParameter("_DesiredEmploymentType", String.class, ParameterMode.IN).bindValue(company.getDesiredEmploymentType());
			query.registerParameter("_preferredShift", String.class, ParameterMode.IN).bindValue(company.getPreferredShift());
			query.registerParameter("_preferredWorkLocation", String.class, ParameterMode.IN).bindValue(company.getPreferredWorkLocation());
			query.registerParameter("_ExpectedSalary", Double.class, ParameterMode.IN).bindValue(company.getExpectedSalary());
			query.registerParameter("_roleCategory", String.class, ParameterMode.IN).bindValue(company.getRoleCategory());
			query.registerParameter("_department", String.class, ParameterMode.IN).bindValue(company.getDepartment());
			query.registerParameter("_currencyType", String.class, ParameterMode.IN).bindValue(company.getCurrencyType());
			query.registerParameter("_AdminId", Long.class, ParameterMode.IN).bindValue(company.getCreatedBy());
			query.registerParameter("_ProcessingResult", String.class, ParameterMode.OUT);
			String result = query.getOutputParameterValue("_ProcessingResult").toString();
			rowsCount = query.executeUpdate();
			System.out.println("Status: " + result);
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
		return "Data created successfully in Company";
	}
	
	public String updateCompanyByIdRepo(Company company, long companyId) {
		return "Data updated successfully in company";
	}
	
	
	public ArrayList<Company> getAllCompanyRepo() {
		
		java.util.List<Company> allCompany = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<Company> query = session.createSQLQuery("Call sp_Company_getAll()").addEntity(Company.class);
			allCompany = query.list();
			System.out.println(allCompany);
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		return (ArrayList<Company>) allCompany ;
	}
	
	
	public Company getCompanyByIdRepo(long comapanyId) {
		Company companyDetail = null;
		Transaction tx = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		try(Session session = factory.openSession()) {
			tx = session.beginTransaction();
			Query<Company> query = session.createSQLQuery("Call sp_Company_getByCompanyId(:companyId)").addEntity(Company.class);	
			query.setParameter("companyId", comapanyId);
			companyDetail = query.getSingleResult();
			tx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		return companyDetail;
	}

	
	public String deleteByIdCompanyRepo(long companyId) {
		return "Data deleted of Company on the basis of companyId";
		
	}
}
