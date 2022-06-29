package com.hiringbell.entity;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "personaldetail")
public class PersonalDetail {
	
	@Id
	@Column(name = "PersonalDetailId")
	long personalDetailId;
	
	@Column(name = "DOB")
	Date dob;
	
	@Column(name = "Gender")
	String gender;
	
	@Column(name = "Address")
	String address;
	
	@Column(name = "HomeTown")
	String homeTown;
	
	@Column(name = "PinCode")
	int pinCode;
	
	@Column(name = "MaritalStatus")
	String maritalStatus;
	
	@Column(name = "Category")
	String category;
	
	@Column(name = "DifferentlyAbled")
	String differentlyAbled;
	
	@Column(name = "PermitUSA")
	String permitUSA;
	
	@Column(name = "PermitOtherCountry")
	String permitOtherCountry;
	
	@Column(name = "LanguageDetails")
	ArrayList<LanguageDetail> languageDetails;
	
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
		return "PersonalDetail [personalDetailId=" + personalDetailId + ", dob=" + dob + ", gender=" + gender
				+ ", address=" + address + ", homeTown=" + homeTown + ", pinCode=" + pinCode + ", maritalStatus="
				+ maritalStatus + ", category=" + category + ", differentlyAbled=" + differentlyAbled + ", permitUSA="
				+ permitUSA + ", permitOtherCountry=" + permitOtherCountry + ", languageDetails=" + languageDetails
				+ ", AdminId=" + AdminId + "]";
	}

	public long getPersonalDetailId() {
		return personalDetailId;
	}

	public void setPersonalDetailId(long personalDetailId) {
		this.personalDetailId = personalDetailId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDifferentlyAbled() {
		return differentlyAbled;
	}

	public void setDifferentlyAbled(String differentlyAbled) {
		this.differentlyAbled = differentlyAbled;
	}

	public String getPermitUSA() {
		return permitUSA;
	}

	public void setPermitUSA(String permitUSA) {
		this.permitUSA = permitUSA;
	}

	public String getPermitOtherCountry() {
		return permitOtherCountry;
	}

	public void setPermitOtherCountry(String permitOtherCountry) {
		this.permitOtherCountry = permitOtherCountry;
	}

	public ArrayList<LanguageDetail> getLanguageDetails() {
		return languageDetails;
	}

	public void setLanguageDetails(ArrayList<LanguageDetail> languageDetails) {
		this.languageDetails = languageDetails;
	}

	public Long getAdminId() {
		return AdminId;
	}

	public void setAdminId(Long adminId) {
		AdminId = adminId;
	}

	public PersonalDetail(long personalDetailId, Date dob, String gender, String address, String homeTown, int pinCode,
			String maritalStatus, String category, String differentlyAbled, String permitUSA, String permitOtherCountry,
			ArrayList<LanguageDetail> languageDetails, Long adminId) {
		super();
		this.personalDetailId = personalDetailId;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.homeTown = homeTown;
		this.pinCode = pinCode;
		this.maritalStatus = maritalStatus;
		this.category = category;
		this.differentlyAbled = differentlyAbled;
		this.permitUSA = permitUSA;
		this.permitOtherCountry = permitOtherCountry;
		this.languageDetails = languageDetails;
		AdminId = adminId;
	}

	public PersonalDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
}
