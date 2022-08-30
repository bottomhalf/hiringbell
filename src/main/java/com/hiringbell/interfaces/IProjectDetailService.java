package com.hiringbell.interfaces;

import java.util.ArrayList;

import com.hiringbell.entity.ProjectDetail;

public interface IProjectDetailService {
	
	String addProjectDetailService(ProjectDetail projectDetail);
	String updateProjectDetailService(ProjectDetail projectDetail, long projectDetailId) throws Exception;
	ArrayList<ProjectDetail> getAllProjectDetailService();
	ArrayList<ProjectDetail> getByUserIdProjectDetailService(long userId);
	String deleteByIdProjectDetailService(long projectDetailId);

}
