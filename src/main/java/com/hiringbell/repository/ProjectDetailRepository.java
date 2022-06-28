package com.hiringbell.repository;

import org.springframework.stereotype.Repository;

import com.hiringbell.entity.ProjectDetail;

@Repository
public class ProjectDetailRepository {
	
	
	public String addProjectDetailRepo(ProjectDetail projectDetail) {
		return "Data added successsfully in ProjectDetail";
	}

	public String updateProjectDetailRepo(ProjectDetail projectDetail, long projectDetailId) {
		return "Data updated for ProjectDetail";
	}
	
	public String getAllProjectDetailRepo() {
		return "Get all Data of ProjectDetail successfully";
	}
	
	public String getByIdProjectDetailRepo(long projectDetailId) {
		return " getByIdProjectDetail successfully";
	}
	
	public String deleteByIdProjectDetailRepo(long projectDetailId) {
		return "Data deleted from ProjectDetail";
	}
}
