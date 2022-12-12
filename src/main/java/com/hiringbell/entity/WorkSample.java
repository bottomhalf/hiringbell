package com.hiringbell.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "worksample")
public class WorkSample {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "WorkSampleId")
	long workSampleId;
	
	@Column(name = "UserId")
	long userId;
	
	@Column(name = "WorkTitle")
	String workTitle;
	
	@Column(name = "UrlWorkSample")
	String urlWorkSample;
	
	@Column(name = "YearDurationFrom")
	int yearDurationFrom;
	
	@Column(name = "MonthDurationFrom")
	String monthDurationFrom;
	
	@Column(name = "YearDurationTo")
	int yearDurationTo;
	
	@Column(name = "MonthDurationTo")
	String monthDurationTo;
	
	@Column(name = "IsCurrentWorking")
	boolean isCurrentWorking;
	
	@Column(name = "DescriptionWorkSample")
	String descriptionWorkSample;
	
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
		return "WorkSample [workSampleId=" + workSampleId + ", userId=" + userId + ", workTitle=" + workTitle
				+ ", urlWorkSample=" + urlWorkSample + ", yearDurationFrom=" + yearDurationFrom + ", monthDurationFrom="
				+ monthDurationFrom + ", yearDurationTo=" + yearDurationTo + ", monthDurationTo=" + monthDurationTo
				+ ", isCurrentWorking=" + isCurrentWorking + ", descriptionWorkSample=" + descriptionWorkSample
				+ ", AdminId=" + AdminId + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}

	public long getWorkSampleId() {
		return workSampleId;
	}

	public void setWorkSampleId(long workSampleId) {
		this.workSampleId = workSampleId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getWorkTitle() {
		return workTitle;
	}

	public void setWorkTitle(String workTitle) {
		this.workTitle = workTitle;
	}

	public String getUrlWorkSample() {
		return urlWorkSample;
	}

	public void setUrlWorkSample(String urlWorkSample) {
		this.urlWorkSample = urlWorkSample;
	}

	public int getYearDurationFrom() {
		return yearDurationFrom;
	}

	public void setYearDurationFrom(int yearDurationFrom) {
		this.yearDurationFrom = yearDurationFrom;
	}

	public String getMonthDurationFrom() {
		return monthDurationFrom;
	}

	public void setMonthDurationFrom(String monthDurationFrom) {
		this.monthDurationFrom = monthDurationFrom;
	}

	public int getYearDurationTo() {
		return yearDurationTo;
	}

	public void setYearDurationTo(int yearDurationTo) {
		this.yearDurationTo = yearDurationTo;
	}

	public String getMonthDurationTo() {
		return monthDurationTo;
	}

	public void setMonthDurationTo(String monthDurationTo) {
		this.monthDurationTo = monthDurationTo;
	}

	public boolean getIsCurrentWorking() {
		return isCurrentWorking;
	}

	public void setIsCurrentWorking(boolean isCurrentWorking) {
		this.isCurrentWorking = isCurrentWorking;
	}

	public String getDescriptionWorkSample() {
		return descriptionWorkSample;
	}

	public void setDescriptionWorkSample(String descriptionWorkSample) {
		this.descriptionWorkSample = descriptionWorkSample;
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

	public WorkSample(long workSampleId, long userId, String workTitle, String urlWorkSample, int yearDurationFrom,
			String monthDurationFrom, int yearDurationTo, String monthDurationTo, boolean isCurrentWorking,
			String descriptionWorkSample, Long adminId, Long createdBy, Long updatedBy) {
		super();
		this.workSampleId = workSampleId;
		this.userId = userId;
		this.workTitle = workTitle;
		this.urlWorkSample = urlWorkSample;
		this.yearDurationFrom = yearDurationFrom;
		this.monthDurationFrom = monthDurationFrom;
		this.yearDurationTo = yearDurationTo;
		this.monthDurationTo = monthDurationTo;
		this.isCurrentWorking = isCurrentWorking;
		this.descriptionWorkSample = descriptionWorkSample;
		AdminId = adminId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public WorkSample() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
