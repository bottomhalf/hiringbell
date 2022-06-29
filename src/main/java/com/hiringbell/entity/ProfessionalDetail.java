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
@Table(name = "professionaldetail")
public class ProfessionalDetail {
	
	@Id
	@Column(name = "UserId")
	Long userId;
	
	@Column(name = "Mobile_Number")
	String mobileNumber;
	
	@Column(name = "Email")
	String email;
	
	@Column(name = "FirstName")
	String firstName;
	
	@Column(name = "LastName")
	String lastName;
	
	@Column(name = "Date_Of_Application")
	Date dateOfApplication;
	
	@Column(name = "Total_Experience_In_Months")
	int totalEperienceinMonths;
	
	@Column(name = "Salary_Package")
	double salaryPackage;
	
	@Column(name = "Notice_Period")
	int noticePeriod;
	
	@Column(name = "Expeceted_CTC")
	double expecetedCtc;
	
	@Column(name = "Current_Location")
	String currentLocation;
	
	@Column(name = "Preferred_Locations")
	String preferredLocations;
	
	@Column(name = "ProfessionalDetail_Json")
	String professionalDetailJson;
	
	@Transient
	Long AdminId;
	
	@Column(name = "CreatedOn")
	Date createdOn;
	
	@Column(name = "UpdatedOn")
	Date updatedOn;

	@Override
	public String toString() {
		return "ProfessionalDetail [userId=" + userId + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfApplication=" + dateOfApplication
				+ ", totalEperienceinMonths=" + totalEperienceinMonths + ", salaryPackage=" + salaryPackage
				+ ", noticePeriod=" + noticePeriod + ", expecetedCtc=" + expecetedCtc + ", currentLocation="
				+ currentLocation + ", preferredLocations=" + preferredLocations + ", professionalDetailJson="
				+ professionalDetailJson + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfApplication() {
		return dateOfApplication;
	}

	public void setDateOfApplication(Date dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}

	public int getTotalEperienceinMonths() {
		return totalEperienceinMonths;
	}

	public void setTotalEperienceinMonths(int totalEperienceinMonths) {
		this.totalEperienceinMonths = totalEperienceinMonths;
	}

	public double getSalaryPackage() {
		return salaryPackage;
	}

	public void setSalaryPackage(double salaryPackage) {
		this.salaryPackage = salaryPackage;
	}

	public int getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(int noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	public double getExpecetedCtc() {
		return expecetedCtc;
	}

	public void setExpecetedCtc(double expecetedCtc) {
		this.expecetedCtc = expecetedCtc;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getPreferredLocations() {
		return preferredLocations;
	}

	public void setPreferredLocations(String preferredLocations) {
		this.preferredLocations = preferredLocations;
	}

	public String getProfessionalDetailJson() {
		return professionalDetailJson;
	}

	public void setProfessionalDetailJson(String professionalDetailJson) {
		this.professionalDetailJson = professionalDetailJson;
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

	public ProfessionalDetail(Long userId, String mobileNumber, String email, String firstName, String lastName,
			Date dateOfApplication, int totalEperienceinMonths, double salaryPackage, int noticePeriod,
			double expecetedCtc, String currentLocation, String preferredLocations, String professionalDetailJson,
			Date createdOn, Date updatedOn) {
		super();
		this.userId = userId;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfApplication = dateOfApplication;
		this.totalEperienceinMonths = totalEperienceinMonths;
		this.salaryPackage = salaryPackage;
		this.noticePeriod = noticePeriod;
		this.expecetedCtc = expecetedCtc;
		this.currentLocation = currentLocation;
		this.preferredLocations = preferredLocations;
		this.professionalDetailJson = professionalDetailJson;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	public ProfessionalDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
