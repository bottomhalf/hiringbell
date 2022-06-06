package com.hiringbell.entity;

import com.hiringbell.model.CreationData;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "login")
public class Login extends CreationData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LoginId")
	private Long loginId;

	@Column(name = "UserId")
	private Long userId;

	@Column(name = "UserTypeId")
	private int userTypeId;

	private int roleId;
	private String password;
	private String email;
	private String mobile;

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
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", userId=" + userId + ", userTypeId=" + userTypeId + ", roleId=" + roleId
				+ ", password=" + password + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	
	
	

}
