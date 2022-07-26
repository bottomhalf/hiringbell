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
@Table(name = "employmentdetail")
public class EmploymentDetail {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EmploymentDetailId")
	long employmentDetailId;
	
	@Column(name = "UserId")
	long userId;
	
	@Column(name = "Designation")
	String designation;
	
	@Column(name = "CompanyName")
	String companyName;
	
	@Column(name = "IsCurrentCompany")
	boolean isCurrentCompany;
	
	@Column(name = "JoiningDate")
	Date joiningDate;
	
	@Column(name = "WorkedTill")
	Date workedTill;
	
	@Column(name = "CurrencyType")
	boolean currencyType;
	
	@Column(name = "CurrentAnnualSalary")
	double currentAnnualSalary;
	
	@Column(name = "SkillsUsed")
	String skillsUsed;
	
	@Column(name = "JobProfile")
	String jobProfile;
	
	@Column(name = "NoticePeriod")
	int noticePeriod;
	
	@Column(name = "IsServingNoticePeriod")
	boolean isServingNoticePeriod;
	
	@Column(name = "RemainingDaysOfNoticePeriod")
	int remainingDaysOfNoticePeriod;
	
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
		return "EmploymentDetail [employmentDetailId=" + employmentDetailId + ", userId=" + userId + ", designation="
				+ designation + ", companyName=" + companyName + ", isCurrentCompany=" + isCurrentCompany
				+ ", joiningDate=" + joiningDate + ", workedTill=" + workedTill + ", currencyType=" + currencyType
				+ ", currentAnnualSalary=" + currentAnnualSalary + ", skillsUsed=" + skillsUsed + ", jobProfile="
				+ jobProfile + ", noticePeriod=" + noticePeriod + ", isServingNoticePeriod=" + isServingNoticePeriod
				+ ", remainingDaysOfNoticePeriod=" + remainingDaysOfNoticePeriod + ", AdminId=" + AdminId
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}

	public long getEmploymentDetailId() {
		return employmentDetailId;
	}

	public void setEmploymentDetailId(long employmentDetailId) {
		this.employmentDetailId = employmentDetailId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public boolean getIsCurrentCompany() {
		return isCurrentCompany;
	}

	public void setIsCurrentCompany(boolean isCurrentCompany) {
		this.isCurrentCompany = isCurrentCompany;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getWorkedTill() {
		return workedTill;
	}

	public void setWorkedTill(Date workedTill) {
		this.workedTill = workedTill;
	}

	public boolean getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(boolean currencyType) {
		this.currencyType = currencyType;
	}

	public double getCurrentAnnualSalary() {
		return currentAnnualSalary;
	}

	public void setCurrentAnnualSalary(double currentAnnualSalary) {
		this.currentAnnualSalary = currentAnnualSalary;
	}

	public String getSkillsUsed() {
		return skillsUsed;
	}

	public void setSkillsUsed(String skillsUsed) {
		this.skillsUsed = skillsUsed;
	}

	public String getJobProfile() {
		return jobProfile;
	}

	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}

	public int getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(int noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	public boolean getIsServingNoticePeriod() {
		return isServingNoticePeriod;
	}

	public void setIsServingNoticePeriod(boolean isServingNoticePeriod) {
		this.isServingNoticePeriod = isServingNoticePeriod;
	}

	public int getRemainingDaysOfNoticePeriod() {
		return remainingDaysOfNoticePeriod;
	}

	public void setRemainingDaysOfNoticePeriod(int remainingDaysOfNoticePeriod) {
		this.remainingDaysOfNoticePeriod = remainingDaysOfNoticePeriod;
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

	public EmploymentDetail(long employmentDetailId, long userId, String designation, String companyName,
			boolean isCurrentCompany, Date joiningDate, Date workedTill, boolean currencyType,
			double currentAnnualSalary, String skillsUsed, String jobProfile, int noticePeriod,
			boolean isServingNoticePeriod, int remainingDaysOfNoticePeriod, Long adminId, Long createdBy,
			Long updatedBy) {
		super();
		this.employmentDetailId = employmentDetailId;
		this.userId = userId;
		this.designation = designation;
		this.companyName = companyName;
		this.isCurrentCompany = isCurrentCompany;
		this.joiningDate = joiningDate;
		this.workedTill = workedTill;
		this.currencyType = currencyType;
		this.currentAnnualSalary = currentAnnualSalary;
		this.skillsUsed = skillsUsed;
		this.jobProfile = jobProfile;
		this.noticePeriod = noticePeriod;
		this.isServingNoticePeriod = isServingNoticePeriod;
		this.remainingDaysOfNoticePeriod = remainingDaysOfNoticePeriod;
		AdminId = adminId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public EmploymentDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
