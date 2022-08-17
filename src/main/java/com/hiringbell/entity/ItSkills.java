package com.hiringbell.entity;

import java.sql.Date;

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
@Table(name = "itskills")
public class ItSkills {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ItSkillId")
	long itSkillId;
	
	@Column(name = "UserId")
	Long userId;
	
	@Column(name = "ItSkillName")
	String itSkillName;
	
	@Column(name = "SoftwareVersion")
	String softwareVersion;
	
	@Column(name = "LastUsed")
	int lastUsed;
	
	@Column(name = "YearsExperience")
	int yearsExperienceItSkill;
	
	@Column(name = "MonthExperience")
	int monthExperienceItSkill;
	
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
		return "ItSkills [itSkillId=" + itSkillId + ", userId=" + userId + ", itSkillName=" + itSkillName
				+ ", softwareVersion=" + softwareVersion + ", lastUsed=" + lastUsed + ", yearsExperienceItSkill="
				+ yearsExperienceItSkill + ", monthExperienceItSkill=" + monthExperienceItSkill + ", AdminId=" + AdminId
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}

	public long getItSkillId() {
		return itSkillId;
	}

	public void setItSkillId(long itSkillId) {
		this.itSkillId = itSkillId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getItSkillName() {
		return itSkillName;
	}

	public void setItSkillName(String itSkillName) {
		this.itSkillName = itSkillName;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	public int getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(int lastUsed) {
		this.lastUsed = lastUsed;
	}

	public int getYearsExperienceItSkill() {
		return yearsExperienceItSkill;
	}

	public void setYearsExperienceItSkill(int yearsExperienceItSkill) {
		this.yearsExperienceItSkill = yearsExperienceItSkill;
	}

	public int getMonthExperienceItSkill() {
		return monthExperienceItSkill;
	}

	public void setMonthExperienceItSkill(int monthExperienceItSkill) {
		this.monthExperienceItSkill = monthExperienceItSkill;
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

	public ItSkills(long itSkillId, Long userId, String itSkillName, String softwareVersion, int lastUsed,
			int yearsExperienceItSkill, int monthExperienceItSkill, Long adminId, Long createdBy, Long updatedBy) {
		super();
		this.itSkillId = itSkillId;
		this.userId = userId;
		this.itSkillName = itSkillName;
		this.softwareVersion = softwareVersion;
		this.lastUsed = lastUsed;
		this.yearsExperienceItSkill = yearsExperienceItSkill;
		this.monthExperienceItSkill = monthExperienceItSkill;
		AdminId = adminId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public ItSkills() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
