package com.hiringbell.repository;

import org.springframework.stereotype.Repository;

import com.hiringbell.entity.AccomplishmentsDetail;

@Repository
public class AccomplishmentsDetailRepo {

	public String addAccomplishmentsDetailService(AccomplishmentsDetail ad) {
		return "Data added successfully in AccomplishmentsDetail ";
	}
	
	
	public String updateAccomplishmentsDetailRepo(AccomplishmentsDetail ad, long accomplishmentId) {
		return "Data updated successfully in AccomplishmentDetail";
	}


	public String getAllAccomplishmentsDetailRepo() {
		return "Got all data successfully of AccomplishDetail";
	}
	
	public String getByIdAccomplishmentsDetailRepo(long accomplishmentId) {
		return "Got data successfully of AccomplishDetail on the basis of accomplishmentId";
	}
	
	public String deleteByIdAccomplishmentsDetailRepo(long accomplishmentId) {
		return "Data deleted of AccomplishDetail on the basis of accomplishmentId";
	}
	
	
	

}
