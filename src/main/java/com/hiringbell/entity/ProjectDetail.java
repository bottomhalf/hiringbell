package com.hiringbell.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "projectdetail")
public class ProjectDetail {
	
		
		@Id
		@Column(name = "ProjectDetail_Id")
		long projectDetailId;
	
		@Column(name = "ProjectTitle")
		String projectTitle;
		
		@Column(name = "ProjectTag")
		String projectTag;
		
		@Column(name = "ProjectWorkingYear")
		int projectWorkingYear;
		
		@Column(name = "ProjectWorkingMonth")
		int projectWorkingMonth;
		
		@Column(name = "ProjectWorkedYear")
		int projectWorkedYear;
		
		@Column(name = "ProjectWorkedMonth")
		int projectWorkedMonth;
		
		@Column(name = "ProjectStatus")
		String projectStatus;
		
		@Column(name = "ClientName")
		String clientName;
		
		@Column(name = "ProjectDetails")
		String projectDetails;
		
		@Column(name = "RolesResponsibility")
		String rolesResponsibility;
		
		@Column(name = "TechnalogyStack")
		String technalogyStack;
		
		
		@Column(name = "ProjectDuration")
		String projectDuration;
		
		@Column(name = "ProjectIndex")
		int projectIndex;
		
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
			return "ProjectDetail [projectDetailId=" + projectDetailId + ", projectTitle=" + projectTitle
					+ ", projectTag=" + projectTag + ", projectWorkingYear=" + projectWorkingYear
					+ ", projectWorkingMonth=" + projectWorkingMonth + ", projectWorkedYear=" + projectWorkedYear
					+ ", projectWorkedMonth=" + projectWorkedMonth + ", projectStatus=" + projectStatus
					+ ", clientName=" + clientName + ", projectDetails=" + projectDetails + ", rolesResponsibility="
					+ rolesResponsibility + ", technalogyStack=" + technalogyStack + ", projectDuration="
					+ projectDuration + ", projectIndex=" + projectIndex + ", AdminId=" + AdminId + "]";
		}

		public long getProjectDetailId() {
			return projectDetailId;
		}

		public void setProjectDetailId(long projectDetailId) {
			this.projectDetailId = projectDetailId;
		}

		public String getProjectTitle() {
			return projectTitle;
		}

		public void setProjectTitle(String projectTitle) {
			this.projectTitle = projectTitle;
		}

		public String getProjectTag() {
			return projectTag;
		}

		public void setProjectTag(String projectTag) {
			this.projectTag = projectTag;
		}

		public int getProjectWorkingYear() {
			return projectWorkingYear;
		}

		public void setProjectWorkingYear(int projectWorkingYear) {
			this.projectWorkingYear = projectWorkingYear;
		}

		public int getProjectWorkingMonth() {
			return projectWorkingMonth;
		}

		public void setProjectWorkingMonth(int projectWorkingMonth) {
			this.projectWorkingMonth = projectWorkingMonth;
		}

		public int getProjectWorkedYear() {
			return projectWorkedYear;
		}

		public void setProjectWorkedYear(int projectWorkedYear) {
			this.projectWorkedYear = projectWorkedYear;
		}

		public int getProjectWorkedMonth() {
			return projectWorkedMonth;
		}

		public void setProjectWorkedMonth(int projectWorkedMonth) {
			this.projectWorkedMonth = projectWorkedMonth;
		}

		public String getProjectStatus() {
			return projectStatus;
		}

		public void setProjectStatus(String projectStatus) {
			this.projectStatus = projectStatus;
		}

		public String getClientName() {
			return clientName;
		}

		public void setClientName(String clientName) {
			this.clientName = clientName;
		}

		public String getProjectDetails() {
			return projectDetails;
		}

		public void setProjectDetails(String projectDetails) {
			this.projectDetails = projectDetails;
		}

		public String getRolesResponsibility() {
			return rolesResponsibility;
		}

		public void setRolesResponsibility(String rolesResponsibility) {
			this.rolesResponsibility = rolesResponsibility;
		}

		public String getTechnalogyStack() {
			return technalogyStack;
		}

		public void setTechnalogyStack(String technalogyStack) {
			this.technalogyStack = technalogyStack;
		}

		public String getProjectDuration() {
			return projectDuration;
		}

		public void setProjectDuration(String projectDuration) {
			this.projectDuration = projectDuration;
		}

		public int getProjectIndex() {
			return projectIndex;
		}

		public void setProjectIndex(int projectIndex) {
			this.projectIndex = projectIndex;
		}

		public Long getAdminId() {
			return AdminId;
		}

		public void setAdminId(Long adminId) {
			AdminId = adminId;
		}

		public ProjectDetail(long projectDetailId, String projectTitle, String projectTag, int projectWorkingYear,
				int projectWorkingMonth, int projectWorkedYear, int projectWorkedMonth, String projectStatus,
				String clientName, String projectDetails, String rolesResponsibility, String technalogyStack,
				String projectDuration, int projectIndex, Long adminId) {
			super();
			this.projectDetailId = projectDetailId;
			this.projectTitle = projectTitle;
			this.projectTag = projectTag;
			this.projectWorkingYear = projectWorkingYear;
			this.projectWorkingMonth = projectWorkingMonth;
			this.projectWorkedYear = projectWorkedYear;
			this.projectWorkedMonth = projectWorkedMonth;
			this.projectStatus = projectStatus;
			this.clientName = clientName;
			this.projectDetails = projectDetails;
			this.rolesResponsibility = rolesResponsibility;
			this.technalogyStack = technalogyStack;
			this.projectDuration = projectDuration;
			this.projectIndex = projectIndex;
			AdminId = adminId;
		}

		public ProjectDetail() {
			super();
			// TODO Auto-generated constructor stub
		}	
}
