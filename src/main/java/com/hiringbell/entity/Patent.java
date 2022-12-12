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
@Table(name = "patent")
public class Patent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PatentId")
	long patentId;
	
	@Column(name = "UserId")
	long userId;
	
	@Column(name = "PatentTitle")
	String patentTitle;
	
	@Column(name = "Url")
	String urlPatent;
	
	@Column(name = "PatentOffice")
	String patentOffice;
	
	@Column(name = "PatentStatus")
	boolean patentStatus;
	
	@Column(name = "ApplicationNumber")
	String patentApplicationNumber;
	
	@Column(name = "YearIssueDate")
	int yearIssueDate;
	
	@Column(name = "MonthIssueDate")
	String monthIssueDate;
	
	@Column(name = "Descriptions")
	String descriptionPatent;
	
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
		return "Patent [patentId=" + patentId + ", userId=" + userId + ", patentTitle=" + patentTitle + ", urlPatent="
				+ urlPatent + ", patentOffice=" + patentOffice + ", patentStatus=" + patentStatus
				+ ", patentApplicationNumber=" + patentApplicationNumber + ", yearIssueDate=" + yearIssueDate
				+ ", monthIssueDate=" + monthIssueDate + ", descriptionPatent=" + descriptionPatent + ", AdminId="
				+ AdminId + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}

	public long getPatentId() {
		return patentId;
	}

	public void setPatentId(long patentId) {
		this.patentId = patentId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getPatentTitle() {
		return patentTitle;
	}

	public void setPatentTitle(String patentTitle) {
		this.patentTitle = patentTitle;
	}

	public String getUrlPatent() {
		return urlPatent;
	}

	public void setUrlPatent(String urlPatent) {
		this.urlPatent = urlPatent;
	}

	public String getPatentOffice() {
		return patentOffice;
	}

	public void setPatentOffice(String patentOffice) {
		this.patentOffice = patentOffice;
	}

	public boolean getPatentStatus() {
		return patentStatus;
	}

	public void setPatentStatus(boolean patentStatus) {
		this.patentStatus = patentStatus;
	}

	public String getPatentApplicationNumber() {
		return patentApplicationNumber;
	}

	public void setPatentApplicationNumber(String patentApplicationNumber) {
		this.patentApplicationNumber = patentApplicationNumber;
	}

	public int getYearIssueDate() {
		return yearIssueDate;
	}

	public void setYearIssueDate(int yearIssueDate) {
		this.yearIssueDate = yearIssueDate;
	}

	public String getMonthIssueDate() {
		return monthIssueDate;
	}

	public void setMonthIssueDate(String monthIssueDate) {
		this.monthIssueDate = monthIssueDate;
	}

	public String getDescriptionPatent() {
		return descriptionPatent;
	}

	public void setDescriptionPatent(String descriptionPatent) {
		this.descriptionPatent = descriptionPatent;
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

	public Patent(long patentId, long userId, String patentTitle, String urlPatent, String patentOffice,
			boolean patentStatus, String patentApplicationNumber, int yearIssueDate, String monthIssueDate,
			String descriptionPatent, Long adminId, Long createdBy, Long updatedBy) {
		super();
		this.patentId = patentId;
		this.userId = userId;
		this.patentTitle = patentTitle;
		this.urlPatent = urlPatent;
		this.patentOffice = patentOffice;
		this.patentStatus = patentStatus;
		this.patentApplicationNumber = patentApplicationNumber;
		this.yearIssueDate = yearIssueDate;
		this.monthIssueDate = monthIssueDate;
		this.descriptionPatent = descriptionPatent;
		AdminId = adminId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public Patent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
