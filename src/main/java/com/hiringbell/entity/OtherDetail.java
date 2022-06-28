package com.hiringbell.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;


@Table(name = "otherdetail")
public class OtherDetail {
	
	
		@Column(name = "Summary")
		String summary;
		
		@Column(name = "Feedback")
		String feedback;
		
		@Column(name = "Pin_Code")
		int pinCode;
		
		
		@Column(name = "Resume_Headline")
		String resumeHeadline;
		
		@Column(name = "Latest_Start_Rating")
		double latestStartRating;
		
		@Column(name = "Work_Permit_For_USA")
		String workPermitForUSA;
		
		@Column(name = "Source_Of_Application")
		String sourceOfApplication;
		
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
			return "OtherDetail [summary=" + summary + ", feedback=" + feedback + ", pinCode=" + pinCode
					+ ", resumeHeadline=" + resumeHeadline + ", latestStartRating=" + latestStartRating
					+ ", workPermitForUSA=" + workPermitForUSA + ", sourceOfApplication=" + sourceOfApplication
					+ ", AdminId=" + AdminId + "]";
		}

		public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public String getFeedback() {
			return feedback;
		}

		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}

		public int getPinCode() {
			return pinCode;
		}

		public void setPinCode(int pinCode) {
			this.pinCode = pinCode;
		}

		public String getResumeHeadline() {
			return resumeHeadline;
		}

		public void setResumeHeadline(String resumeHeadline) {
			this.resumeHeadline = resumeHeadline;
		}

		public double getLatestStartRating() {
			return latestStartRating;
		}

		public void setLatestStartRating(double latestStartRating) {
			this.latestStartRating = latestStartRating;
		}

		public String getWorkPermitForUSA() {
			return workPermitForUSA;
		}

		public void setWorkPermitForUSA(String workPermitForUSA) {
			this.workPermitForUSA = workPermitForUSA;
		}

		public String getSourceOfApplication() {
			return sourceOfApplication;
		}

		public void setSourceOfApplication(String sourceOfApplication) {
			this.sourceOfApplication = sourceOfApplication;
		}

		public Long getAdminId() {
			return AdminId;
		}

		public void setAdminId(Long adminId) {
			AdminId = adminId;
		}

		public OtherDetail(String summary, String feedback, int pinCode, String resumeHeadline,
				double latestStartRating, String workPermitForUSA, String sourceOfApplication, Long adminId) {
			super();
			this.summary = summary;
			this.feedback = feedback;
			this.pinCode = pinCode;
			this.resumeHeadline = resumeHeadline;
			this.latestStartRating = latestStartRating;
			this.workPermitForUSA = workPermitForUSA;
			this.sourceOfApplication = sourceOfApplication;
			AdminId = adminId;
		}

		public OtherDetail() {
			super();
			// TODO Auto-generated constructor stub
		}
}
