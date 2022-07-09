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
	
	@Column(name = "Organization")
	String organization;
	
	@Column(name = "Designation")
	String designation;
	
	@Column(name = "EmploymentStatus")
	String employmentStatus;
	
	@Column(name = "Years")
	int years;
	
	@Column(name = "Months")
	int months;
	
	@Column(name = "CurrentSalary")
	double currentSalary;
	
	@Column(name = "CurrencyType")
	String currencyType;
	
	@Column(name = "Experties")
	String experties;
	
	@Column(name = "JobProfile")
	String jobProfile;
	
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
		return "EmploymentDetail [empDetailId=" + employmentDetailId + ", organization=" + organization + ", designation="
				+ designation + ", employmentStatus=" + employmentStatus + ", years=" + years + ", months=" + months
				+ ", currentSalary=" + currentSalary + ", currencyType=" + currencyType + ", experties=" + experties
				+ ", jobProfile=" + jobProfile + ", AdminId=" + AdminId + "]";
	}

	public long getEmpDetailId() {
		return employmentDetailId;
	}

	public void setEmpDetailId(long empDetailId) {
		this.employmentDetailId = empDetailId;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public double getCurrentSalary() {
		return currentSalary;
	}

	public void setCurrentSalary(double currentSalary) {
		this.currentSalary = currentSalary;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public String getExperties() {
		return experties;
	}

	public void setExperties(String experties) {
		this.experties = experties;
	}

	public String getJobProfile() {
		return jobProfile;
	}

	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}

	public Long getAdminId() {
		return AdminId;
	}

	public void setAdminId(Long adminId) {
		AdminId = adminId;
	}

	public EmploymentDetail(long empDetailId, String organization, String designation, String employmentStatus,
			int years, int months, double currentSalary, String currencyType, String experties, String jobProfile,
			Long adminId) {
		super();
		this.employmentDetailId = empDetailId;
		this.organization = organization;
		this.designation = designation;
		this.employmentStatus = employmentStatus;
		this.years = years;
		this.months = months;
		this.currentSalary = currentSalary;
		this.currencyType = currencyType;
		this.experties = experties;
		this.jobProfile = jobProfile;
		AdminId = adminId;
	}

	public EmploymentDetail() {
		super();
		// TODO Auto-generated constructor stub
	}	

}
