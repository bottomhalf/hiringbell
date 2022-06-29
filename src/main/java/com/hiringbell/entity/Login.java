package com.hiringbell.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "login")
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LoginId")
	private Long loginId;

	@Column(name = "UserId")
	private Long userId;

	@Column(name = "UserTypeId")
	private int userTypeId;
	
	@Column(name = "createdBy")
	Long createdBy;

	@Column(name = "UpdatedBy")
	Long updatedBy;

	@Column(name = "CreatedOn")
	Date createdOn;

	@Column(name = "UpdatedOn")
	Date updatedOn;

	int roleId;
	String password;
	String email;
	String mobile;
	
	
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", userId=" + userId + ", userTypeId=" + userTypeId + ", createdBy="
				+ createdBy + ", updatedBy=" + updatedBy + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn
				+ ", roleId=" + roleId + ", password=" + password + ", email=" + email + ", mobile=" + mobile + "]";
	}
	public Long getLoginId() {
		return loginId;
	}
	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public int getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
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
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
}
