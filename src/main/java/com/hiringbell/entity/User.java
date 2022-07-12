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
@Table(name = "user")
public class User {

	@Id
	@Column(name = "UserId")
	Long userId;

	@Transient
	String password;

	@Column(name = "FirstName")
	String firstName;

	@Column(name = "LastName")
	String lastName;

	@Column(name = "Address")
	String address;

	@Column(name = "Email")
	String email;

	@Column(name = "Mobile")
	String mobile;

	@Column(name = "CompanyName")
	String companyName;
	
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
		return "User [userId=" + userId + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", address=" + address + ", email=" + email + ", mobile=" + mobile + ", createdBy="
				+ createdBy + ", updatedBy=" + updatedBy + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn
				+ "]";
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public User(Long userId, String password, String firstName, String lastName, String address, String email,
			String mobile, String companyName, Long adminId, Long createdBy, Long updatedBy) {
		super();
		this.userId = userId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.companyName = companyName;
		AdminId = adminId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
