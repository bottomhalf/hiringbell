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
@Table(name = "profilesummary")
public class ProfileSummary {	
	
	@Id
	@Column(name = "UserId")
	long userId;
	
	@Column(name = "ProfileSummary")
	String profileSummary;
	
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
		return "ProfileSummary [userId=" + userId + ", profileSummary=" + profileSummary + ", AdminId=" + AdminId
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getProfileSummary() {
		return profileSummary;
	}

	public void setProfileSummary(String profileSummary) {
		this.profileSummary = profileSummary;
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

	public ProfileSummary(long userId, String profileSummary, Long adminId, Long createdBy, Long updatedBy) {
		super();
		this.userId = userId;
		this.profileSummary = profileSummary;
		AdminId = adminId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public ProfileSummary() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
