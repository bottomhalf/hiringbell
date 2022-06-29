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
@Table(name = "accomplishmentsdetail")
public class AccomplishmentsDetail {
	
	@Id
	@Column(name = "AccomplishmentId")
	long accomplishmentId;
	
	@Column(name = "OnlineProfile")
	String onlineProfile;
	
	@Column(name = "WorkSample")
	String workSample;
	
	@Column(name = "Research")
	String research;
	
	@Column(name = "Presentation")
	String presentation;
	
	@Column(name = "Patent")
	String patent;
	
	@Column(name = "Certification")
	String certification;
		
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
		return "AccomplishmentsDetail [accomplishmentId=" + accomplishmentId + ", onlineProfile=" + onlineProfile
				+ ", workSample=" + workSample + ", research=" + research + ", presentation=" + presentation
				+ ", patent=" + patent + ", certification=" + certification + ", AdminId=" + AdminId + ", createdBy="
				+ createdBy + ", updatedBy=" + updatedBy + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn
				+ "]";
	}

	public long getAccomplishmentId() {
		return accomplishmentId;
	}

	public void setAccomplishmentId(long accomplishmentId) {
		this.accomplishmentId = accomplishmentId;
	}

	public String getOnlineProfile() {
		return onlineProfile;
	}

	public void setOnlineProfile(String onlineProfile) {
		this.onlineProfile = onlineProfile;
	}

	public String getWorkSample() {
		return workSample;
	}

	public void setWorkSample(String workSample) {
		this.workSample = workSample;
	}

	public String getResearch() {
		return research;
	}

	public void setResearch(String research) {
		this.research = research;
	}

	public String getPresentation() {
		return presentation;
	}

	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	public String getPatent() {
		return patent;
	}

	public void setPatent(String patent) {
		this.patent = patent;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
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

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public AccomplishmentsDetail(long accomplishmentId, String onlineProfile, String workSample, String research,
			String presentation, String patent, String certification, Long adminId, Long createdBy, Long updatedBy,
			Date createdOn, Date updatedOn) {
		super();
		this.accomplishmentId = accomplishmentId;
		this.onlineProfile = onlineProfile;
		this.workSample = workSample;
		this.research = research;
		this.presentation = presentation;
		this.patent = patent;
		this.certification = certification;
		AdminId = adminId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	public AccomplishmentsDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
