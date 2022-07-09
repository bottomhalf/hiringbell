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
@Table(name = "skilldetail")
public class SkillDetail {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SkillDetailId")
	long skillDetailId;
	
	@Column(name = "SkillIndex")
	int skillIndex;
	
	@Column(name = "Language")
	String language;
	
	@Column(name = "Version")
	int version;
	
	@Column(name = "LastUsed")
	Date lastUsed;
	
	@Column(name = "ExperienceInYear")
	int experienceInYear;
	
	@Column(name = "ExperienceInMonth")
	int experienceInMonth;
	
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
		return "SkillDetail [skillDetailId=" + skillDetailId + ", skillIndex=" + skillIndex + ", language=" + language
				+ ", version=" + version + ", lastUsed=" + lastUsed + ", experienceInYear=" + experienceInYear
				+ ", experienceInMonth=" + experienceInMonth + ", AdminId=" + AdminId + "]";
	}

	public long getSkillDetailId() {
		return skillDetailId;
	}

	public void setSkillDetailId(long skillDetailId) {
		this.skillDetailId = skillDetailId;
	}

	public int getSkillIndex() {
		return skillIndex;
	}

	public void setSkillIndex(int skillIndex) {
		this.skillIndex = skillIndex;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Date getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(Date lastUsed) {
		this.lastUsed = lastUsed;
	}

	public int getExperienceInYear() {
		return experienceInYear;
	}

	public void setExperienceInYear(int experienceInYear) {
		this.experienceInYear = experienceInYear;
	}

	public int getExperienceInMonth() {
		return experienceInMonth;
	}

	public void setExperienceInMonth(int experienceInMonth) {
		this.experienceInMonth = experienceInMonth;
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

	public SkillDetail(long skillDetailId, int skillIndex, String language, int version, Date lastUsed,
			int experienceInYear, int experienceInMonth, Long adminId) {
		super();
		this.skillDetailId = skillDetailId;
		this.skillIndex = skillIndex;
		this.language = language;
		this.version = version;
		this.lastUsed = lastUsed;
		this.experienceInYear = experienceInYear;
		this.experienceInMonth = experienceInMonth;
		AdminId = adminId;
	}

	public SkillDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
}
