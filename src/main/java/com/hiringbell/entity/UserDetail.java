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
@Table(name = "userdetail")
public class UserDetail extends LoginDetail {
	
	
	@Id
	@Column(name = "UserDetail_Id")
	long userDetailId;
	
	@Column(name = "DOB")
	Date dob;
	
	@Column(name = "State")
	String state;
	
	@Column(name = "City")
	String city;
	
	@Column(name = "Designation")
	String designation;
	
	@Column(name = "Token")
	String token;
	
	@Column(name = "TokenExpiryDuration")
	Date tokenExpiryDuration;
	
	@Column(name = "RefreshToken")
	String refreshToken;
	
	@Column(name = "Password")
	String password;
	
	@Column(name = "NewPassword")
	String newPassword;
	
	@Column(name = "MediaName")
	String mediaName;
	
	@Column(name = "AccessToken")
	String accessToken;
	
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
		return "UserDetail [userDetailId=" + userDetailId + ", dob=" + dob + ", state=" + state + ", city=" + city
				+ ", designation=" + designation + ", token=" + token + ", tokenExpiryDuration=" + tokenExpiryDuration
				+ ", refreshToken=" + refreshToken + ", password=" + password + ", newPassword=" + newPassword
				+ ", mediaName=" + mediaName + ", accessToken=" + accessToken + ", AdminId=" + AdminId + "]";
	}

	public long getUserDetailId() {
		return userDetailId;
	}

	public void setUserDetailId(long userDetailId) {
		this.userDetailId = userDetailId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getTokenExpiryDuration() {
		return tokenExpiryDuration;
	}

	public void setTokenExpiryDuration(Date tokenExpiryDuration) {
		this.tokenExpiryDuration = tokenExpiryDuration;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getMediaName() {
		return mediaName;
	}

	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Long getAdminId() {
		return AdminId;
	}

	public void setAdminId(Long adminId) {
		AdminId = adminId;
	}

	public UserDetail(long userDetailId, Date dob, String state, String city, String designation, String token,
			Date tokenExpiryDuration, String refreshToken, String password, String newPassword, String mediaName,
			String accessToken, Long adminId) {
		super();
		this.userDetailId = userDetailId;
		this.dob = dob;
		this.state = state;
		this.city = city;
		this.designation = designation;
		this.token = token;
		this.tokenExpiryDuration = tokenExpiryDuration;
		this.refreshToken = refreshToken;
		this.password = password;
		this.newPassword = newPassword;
		this.mediaName = mediaName;
		this.accessToken = accessToken;
		AdminId = adminId;
	}

	public UserDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
