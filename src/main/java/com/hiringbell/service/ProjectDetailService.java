package com.hiringbell.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.ProjectDetail;
import com.hiringbell.interfaces.IProjectDetailService;
import com.hiringbell.repository.ProjectDetailRepository;


@Service
@Component
public class ProjectDetailService implements IProjectDetailService {
	
	@Autowired
	ProjectDetailRepository projectDetailRepository;

	public String addProjectDetailService(ProjectDetail projectDetail) {
		var result = this.projectDetailRepository.addProjectDetailRepo(projectDetail);
		return result;
	}

	public String updateProjectDetailService(ProjectDetail projectDetail, long projectDetailId) throws Exception {
		var result = "";
		if(projectDetailId > 0)
		{
			result = this.projectDetailRepository.updateProjectDetailRepo(projectDetail, projectDetailId);
			if (result == null || result == "")
				throw new IOException("Unable to update");
		}
		
		return result;
	}
	
	public ArrayList<ProjectDetail> getAllProjectDetailService() {
		var result = this.projectDetailRepository.getAllProjectDetailRepo();
		return result;
	}

	public ArrayList<ProjectDetail> getByUserIdProjectDetailService(long userId) {
		var result = this.projectDetailRepository.getByUserIdProjectDetailRepo(userId);
		return result;
	}
	
	public String deleteByIdProjectDetailService(long projectDetailId) {
		var result = this.projectDetailRepository.deleteByIdProjectDetailRepo(projectDetailId);
		return result;
	}
	
	
}
