package com.hiringbell.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "onlineprofile")
public class OnlineProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OnlineProfileId")
	long onlineProfileId;
	
	@Column(name = "UserId")
	Long userId;
	
	@Column(name = "SocialProfile")
	String socialProfile;
	
	@Column(name = "URL")
	String url;
	
	@Column(name = "Description")
	String description;
	
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
		return "OnlineProfile [onlineProfileId=" + onlineProfileId + ", userId=" + userId + ", socialProfile="
				+ socialProfile + ", url=" + url + ", description=" + description + ", AdminId=" + AdminId
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}

	public long getOnlineProfileId() {
		return onlineProfileId;
	}

	public void setOnlineProfileId(long onlineProfileId) {
		this.onlineProfileId = onlineProfileId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getSocialProfile() {
		return socialProfile;
	}

	public void setSocialProfile(String socialProfile) {
		this.socialProfile = socialProfile;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public OnlineProfile(long onlineProfileId, Long userId, String socialProfile, String url, String description,
			Long adminId, Long createdBy, Long updatedBy) {
		super();
		this.onlineProfileId = onlineProfileId;
		this.userId = userId;
		this.socialProfile = socialProfile;
		this.url = url;
		this.description = description;
		AdminId = adminId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public OnlineProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

}
