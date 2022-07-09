package com.hiringbell.entity;

import java.util.Date;

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
@Table(name = "company")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CompanyId")
	long companyId;
	
	@Column(name = "Role")
	String role;
	
	@Column(name = "Industry")
	String industry;
	
	@Column(name = "Designation")
	String designation;
	
	@Column(name = "CompanyName")
	String companyName;
	
	@Column(name = "FunctionalArea")
	String functionalArea;
	
	@Column(name = "DesiredTypePermanent")
	String desiredTypePermanent;
	
	@Column(name = "DesiredEmploymentType")
	String desiredEmploymentType;
	
	@Column(name = "preferredShift")
	String preferredShift;
	
	@Column(name = "preferredWorkLocation")
	String preferredWorkLocation;
	
	@Column(name = "ExpectedSalary")
	double expectedSalary;
	
	@Column(name = "roleCategory")
	String roleCategory;
	
	@Column(name = "department")
	String department;
	
	@Column(name = "currencyType")
	String currencyType;
	
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
		return "Company [companyId=" + companyId + ", role=" + role + ", industry=" + industry + ", designation="
				+ designation + ", companyName=" + companyName + ", functionalArea=" + functionalArea
				+ ", desiredTypePermanent=" + desiredTypePermanent + ", desiredEmploymentType=" + desiredEmploymentType
				+ ", preferredShift=" + preferredShift + ", preferredWorkLocation=" + preferredWorkLocation
				+ ", expectedSalary=" + expectedSalary + ", roleCategory=" + roleCategory + ", department=" + department
				+ ", currencyType=" + currencyType + ", AdminId=" + AdminId + "]";
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
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

	public String getFunctionalArea() {
		return functionalArea;
	}

	public void setFunctionalArea(String functionalArea) {
		this.functionalArea = functionalArea;
	}

	public String getDesiredTypePermanent() {
		return desiredTypePermanent;
	}

	public void setDesiredTypePermanent(String desiredTypePermanent) {
		this.desiredTypePermanent = desiredTypePermanent;
	}

	public String getDesiredEmploymentType() {
		return desiredEmploymentType;
	}

	public void setDesiredEmploymentType(String desiredEmploymentType) {
		this.desiredEmploymentType = desiredEmploymentType;
	}

	public String getPreferredShift() {
		return preferredShift;
	}

	public void setPreferredShift(String preferredShift) {
		this.preferredShift = preferredShift;
	}

	public String getPreferredWorkLocation() {
		return preferredWorkLocation;
	}

	public void setPreferredWorkLocation(String preferredWorkLocation) {
		this.preferredWorkLocation = preferredWorkLocation;
	}

	public double getExpectedSalary() {
		return expectedSalary;
	}

	public void setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	public String getRoleCategory() {
		return roleCategory;
	}

	public void setRoleCategory(String roleCategory) {
		this.roleCategory = roleCategory;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
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

	public Company(long companyId, String role, String industry, String designation, String companyName,
			String functionalArea, String desiredTypePermanent, String desiredEmploymentType, String preferredShift,
			String preferredWorkLocation, double expectedSalary, String roleCategory, String department,
			String currencyType, Long adminId) {
		super();
		this.companyId = companyId;
		this.role = role;
		this.industry = industry;
		this.designation = designation;
		this.companyName = companyName;
		this.functionalArea = functionalArea;
		this.desiredTypePermanent = desiredTypePermanent;
		this.desiredEmploymentType = desiredEmploymentType;
		this.preferredShift = preferredShift;
		this.preferredWorkLocation = preferredWorkLocation;
		this.expectedSalary = expectedSalary;
		this.roleCategory = roleCategory;
		this.department = department;
		this.currencyType = currencyType;
		AdminId = adminId;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
