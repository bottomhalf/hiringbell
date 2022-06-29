package com.hiringbell.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;


@Entity
@Component
@Table(name = "professionaluser")
public class ProfessionalUser {
	
	
	@Id
	@Column(name = "UserId")
	long userId;
	
	@Column(name = "FileId")
	long fileId;
	
	@Column(name = "Name")
	String name;
	
	@Column(name = "FirstName")
	String firstName;
	
	@Column(name = "LastName")
	String lastName;
	
	@Column(name = "ResumeHeadline")
	String resumeHeadline;
	
	@Column(name = "Email")
	String email;
	
	@Column(name = "Gender")
	String gender;
	
	@Column(name = "Job_Title")
	String jobTitle;
	
	@Column(name = "Expeceted_CTC")
	double expecetedCTC;
	
	@Column(name = "Mobile_Number")
	String mobileNumber;
	
	@Column(name = "Notice_Period")
	int noticePeriod;
	
	@Column(name = "Salary_Package")
	double salaryPackage;
	
	@Column(name = "Alternate_Number")
	long alternateNumber;
	
	@Column(name = "Current_Location")
	String currentLocation;
	
	@Column(name = "Date_Of_Application")
	Date dateOfApplication;
	
	@Column(name = "Total_Experience_In_Months")
	double totalExperienceInMonths;
	
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
		return "ProfessionalUser [userId=" + userId + ", fileId=" + fileId + ", name=" + name + ", firstName="
				+ firstName + ", lastName=" + lastName + ", resumeHeadline=" + resumeHeadline + ", email=" + email
				+ ", gender=" + gender + ", jobTitle=" + jobTitle + ", expecetedCTC=" + expecetedCTC + ", mobileNumber="
				+ mobileNumber + ", noticePeriod=" + noticePeriod + ", salaryPackage=" + salaryPackage
				+ ", alternateNumber=" + alternateNumber + ", currentLocation=" + currentLocation
				+ ", dateOfApplication=" + dateOfApplication + ", totalExperienceInMonths=" + totalExperienceInMonths
				+ ", AdminId=" + AdminId + "]";
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getFileId() {
		return fileId;
	}

	public void setFileId(long fileId) {
		this.fileId = fileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getResumeHeadline() {
		return resumeHeadline;
	}

	public void setResumeHeadline(String resumeHeadline) {
		this.resumeHeadline = resumeHeadline;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getExpecetedCTC() {
		return expecetedCTC;
	}

	public void setExpecetedCTC(double expecetedCTC) {
		this.expecetedCTC = expecetedCTC;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(int noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	public double getSalaryPackage() {
		return salaryPackage;
	}

	public void setSalaryPackage(double salaryPackage) {
		this.salaryPackage = salaryPackage;
	}

	public long getAlternateNumber() {
		return alternateNumber;
	}

	public void setAlternateNumber(long alternateNumber) {
		this.alternateNumber = alternateNumber;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public Date getDateOfApplication() {
		return dateOfApplication;
	}

	public void setDateOfApplication(Date dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}

	public double getTotalExperienceInMonths() {
		return totalExperienceInMonths;
	}

	public void setTotalExperienceInMonths(double totalExperienceInMonths) {
		this.totalExperienceInMonths = totalExperienceInMonths;
	}

	public Long getAdminId() {
		return AdminId;
	}

	public void setAdminId(Long adminId) {
		AdminId = adminId;
	}

	public ProfessionalUser(long userId, long fileId, String name, String firstName, String lastName,
			String resumeHeadline, String email, String gender, String jobTitle, double expecetedCTC,
			String mobileNumber, int noticePeriod, double salaryPackage, long alternateNumber, String currentLocation,
			Date dateOfApplication, double totalExperienceInMonths, Long adminId) {
		super();
		this.userId = userId;
		this.fileId = fileId;
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
		this.resumeHeadline = resumeHeadline;
		this.email = email;
		this.gender = gender;
		this.jobTitle = jobTitle;
		this.expecetedCTC = expecetedCTC;
		this.mobileNumber = mobileNumber;
		this.noticePeriod = noticePeriod;
		this.salaryPackage = salaryPackage;
		this.alternateNumber = alternateNumber;
		this.currentLocation = currentLocation;
		this.dateOfApplication = dateOfApplication;
		this.totalExperienceInMonths = totalExperienceInMonths;
		AdminId = adminId;
	}

	public ProfessionalUser() {
		super();
		// TODO Auto-generated constructor stub
	}
}
