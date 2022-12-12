package com.hiringbell.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "projectdetail")
public class ProjectDetail {
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "ProjectDetailId")
		long projectDetailId;
		
		@Column(name = "UserId")
		Long userId;
	
		@Column(name = "ProjectTitle")
		String projectTitle;
		
		@Column(name = "Client")
		String client;
		
		@Column(name = "ProjectStatus")
		boolean projectStatus;
		
		@Column(name = "WorkedFromYears")
		int workedFromYears;
		
		@Column(name = "WorkedFromMonth")
		String workedFromMonth;
		
		@Column(name = "WorkedTillYears")
		int workedTillYears;
		
		@Column(name = "WorkedTillMonth")
		String workedTillMonth;
		
		@Column(name = "DetailsOfProject")
		String detailsOfProject;
		
		@Column(name = "ProjectLocation")
		String projectLocation;
		
		@Column(name = "ProjectSite")
		boolean projectSite;
		
		@Column(name = "NatureOfEmployment")
		String natureOfEmployment;
		
		@Column(name = "TeamSize")
		int teamSize;
		
		@Column(name = "Role")
		String role;
		
		@Column(name = "RoleDescription")
		String roleDescription;
		
		@Column(name = "SkillsUsed")
		String skillsUsed;
		
		@Transient
		Long AdminId;
		
		@Column(name = "CreatedBy")
		Long createdBy;

		@Column(name = "UpdatedBy")
		Long updatedBy;

		@Column(name = "CreatedOn")
		Date createdOn;

		@Column(name = "UpdatedOn")
		Date updatedOn;

		@Override
		public String toString() {
			return "ProjectDetail [projectDetailId=" + projectDetailId + ", userId=" + userId + ", projectTitle="
					+ projectTitle + ", client=" + client + ", projectStatus=" + projectStatus + ", workedFromYears="
					+ workedFromYears + ", workedFromMonth=" + workedFromMonth + ", workedTillYears=" + workedTillYears
					+ ", workedTillMonth=" + workedTillMonth + ", detailsOfProject=" + detailsOfProject
					+ ", projectLocation=" + projectLocation + ", projectSite=" + projectSite + ", natureOfEmployment="
					+ natureOfEmployment + ", teamSize=" + teamSize + ", role=" + role + ", roleDescription="
					+ roleDescription + ", skillsUsed=" + skillsUsed + ", AdminId=" + AdminId + ", createdBy="
					+ createdBy + ", updatedBy=" + updatedBy + "]";
		}

		public long getProjectDetailId() {
			return projectDetailId;
		}

		public void setProjectDetailId(long projectDetailId) {
			this.projectDetailId = projectDetailId;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getProjectTitle() {
			return projectTitle;
		}

		public void setProjectTitle(String projectTitle) {
			this.projectTitle = projectTitle;
		}

		public String getClient() {
			return client;
		}

		public void setClient(String client) {
			this.client = client;
		}

		public boolean getProjectStatus() {
			return projectStatus;
		}

		public void setProjectStatus(boolean projectStatus) {
			this.projectStatus = projectStatus;
		}

		public int getWorkedFromYears() {
			return workedFromYears;
		}

		public void setWorkedFromYears(int workedFromYears) {
			this.workedFromYears = workedFromYears;
		}

		public String getWorkedFromMonth() {
			return workedFromMonth;
		}

		public void setWorkedFromMonth(String workedFromMonth) {
			this.workedFromMonth = workedFromMonth;
		}

		public int getWorkedTillYears() {
			return workedTillYears;
		}

		public void setWorkedTillYears(int workedTillYears) {
			this.workedTillYears = workedTillYears;
		}

		public String getWorkedTillMonth() {
			return workedTillMonth;
		}

		public void setWorkedTillMonth(String workedTillMonth) {
			this.workedTillMonth = workedTillMonth;
		}

		public String getDetailsOfProject() {
			return detailsOfProject;
		}

		public void setDetailsOfProject(String detailsOfProject) {
			this.detailsOfProject = detailsOfProject;
		}

		public String getProjectLocation() {
			return projectLocation;
		}

		public void setProjectLocation(String projectLocation) {
			this.projectLocation = projectLocation;
		}

		public boolean getProjectSite() {
			return projectSite;
		}

		public void setProjectSite(boolean projectSite) {
			this.projectSite = projectSite;
		}

		public String getNatureOfEmployment() {
			return natureOfEmployment;
		}

		public void setNatureOfEmployment(String natureOfEmployment) {
			this.natureOfEmployment = natureOfEmployment;
		}

		public int getTeamSize() {
			return teamSize;
		}

		public void setTeamSize(int teamSize) {
			this.teamSize = teamSize;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getRoleDescription() {
			return roleDescription;
		}

		public void setRoleDescription(String roleDescription) {
			this.roleDescription = roleDescription;
		}

		public String getSkillsUsed() {
			return skillsUsed;
		}

		public void setSkillsUsed(String skillsUsed) {
			this.skillsUsed = skillsUsed;
		}

		public Long getAdminId() {
			return AdminId;
		}

		public void setAdminId(Long adminId) {
			AdminId = adminId;
		}

		public Long getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(Long createdBy) {
			this.createdBy = createdBy;
		}

		public Long getUpdatedBy() {
			return updatedBy;
		}

		public void setUpdatedBy(Long updatedBy) {
			this.updatedBy = updatedBy;
		}

		public ProjectDetail(long projectDetailId, Long userId, String projectTitle, String client,
				boolean projectStatus, int workedFromYears, String workedFromMonth, int workedTillYears,
				String workedTillMonth, String detailsOfProject, String projectLocation, boolean projectSite,
				String natureOfEmployment, int teamSize, String role, String roleDescription, String skillsUsed,
				Long adminId, Long createdBy, Long updatedBy) {
			super();
			this.projectDetailId = projectDetailId;
			this.userId = userId;
			this.projectTitle = projectTitle;
			this.client = client;
			this.projectStatus = projectStatus;
			this.workedFromYears = workedFromYears;
			this.workedFromMonth = workedFromMonth;
			this.workedTillYears = workedTillYears;
			this.workedTillMonth = workedTillMonth;
			this.detailsOfProject = detailsOfProject;
			this.projectLocation = projectLocation;
			this.projectSite = projectSite;
			this.natureOfEmployment = natureOfEmployment;
			this.teamSize = teamSize;
			this.role = role;
			this.roleDescription = roleDescription;
			this.skillsUsed = skillsUsed;
			AdminId = adminId;
			this.createdBy = createdBy;
			this.updatedBy = updatedBy;
		}

		public ProjectDetail() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
