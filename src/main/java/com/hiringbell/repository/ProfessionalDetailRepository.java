package com.hiringbell.repository;

import org.springframework.stereotype.Repository;

import com.hiringbell.entity.ProfessionalDetail;

@Repository
public class ProfessionalDetailRepository {
	

	public String addProfessionalDetailRepo(ProfessionalDetail pd)
	{
			
		return "Data Inserted Successfully ";
	}
	
	public String updateProfessionalDetailRepo(ProfessionalDetail pd, long userId)
	{
		return "Data Updated Successfully";
	}

	public String getAllProfessionalDetailRepo() 
	{
		return "Get All Data Successfully";
		
	}

	public String getByUserIdProfessionalDetailRepo(long userId) 
	{
		return "Get data successfully on the basis of userId";
		
	}
	
	public String deleteByUserIdProfessionalDetailRepo(long userId)
	{
		return "Data deleted Successfully by userId";
	}
	
	
	
	
	
	
	

}
