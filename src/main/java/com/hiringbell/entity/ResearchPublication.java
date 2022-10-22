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
@Table(name = "researchpublication")
public class ResearchPublication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ResearchPublicationId")
	long researchPublicationId;
	
	@Column(name = "UserId")
	long userId;
	
	@Column(name = "Title")
	String titleResearchPublication;
	
	@Column(name = "URL")
	String urlResearchPublication;
	
	@Column(name = "YearPublicationOn")
	int yearPublicationOn;
	
	@Column(name = "MonthPublicationOn")
	String monthPublicationOn;
	
	@Column(name = "Description")
	String descriptionResearchPublication;
	
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
		return "ResearchPublication [researchPublicationId=" + researchPublicationId + ", userId=" + userId
				+ ", titleResearchPublication=" + titleResearchPublication + ", urlResearchPublication="
				+ urlResearchPublication + ", yearPublicationOn=" + yearPublicationOn + ", monthPublicationOn="
				+ monthPublicationOn + ", descriptionResearchPublication=" + descriptionResearchPublication
				+ ", AdminId=" + AdminId + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}

	public long getResearchPublicationId() {
		return researchPublicationId;
	}

	public void setResearchPublicationId(long researchPublicationId) {
		this.researchPublicationId = researchPublicationId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getTitleResearchPublication() {
		return titleResearchPublication;
	}

	public void setTitleResearchPublication(String titleResearchPublication) {
		this.titleResearchPublication = titleResearchPublication;
	}

	public String getUrlResearchPublication() {
		return urlResearchPublication;
	}

	public void setUrlResearchPublication(String urlResearchPublication) {
		this.urlResearchPublication = urlResearchPublication;
	}

	public int getYearPublicationOn() {
		return yearPublicationOn;
	}

	public void setYearPublicationOn(int yearPublicationOn) {
		this.yearPublicationOn = yearPublicationOn;
	}

	public String getMonthPublicationOn() {
		return monthPublicationOn;
	}

	public void setMonthPublicationOn(String monthPublicationOn) {
		this.monthPublicationOn = monthPublicationOn;
	}

	public String getDescriptionResearchPublication() {
		return descriptionResearchPublication;
	}

	public void setDescriptionResearchPublication(String descriptionResearchPublication) {
		this.descriptionResearchPublication = descriptionResearchPublication;
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

	public ResearchPublication(long researchPublicationId, long userId, String titleResearchPublication,
			String urlResearchPublication, int yearPublicationOn, String monthPublicationOn,
			String descriptionResearchPublication, Long adminId, Long createdBy, Long updatedBy) {
		super();
		this.researchPublicationId = researchPublicationId;
		this.userId = userId;
		this.titleResearchPublication = titleResearchPublication;
		this.urlResearchPublication = urlResearchPublication;
		this.yearPublicationOn = yearPublicationOn;
		this.monthPublicationOn = monthPublicationOn;
		this.descriptionResearchPublication = descriptionResearchPublication;
		AdminId = adminId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public ResearchPublication() {
		super();
		// TODO Auto-generated constructor stub
	}

}
