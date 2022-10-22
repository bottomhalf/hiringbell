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
@Table(name = "presentation")
public class Presentation {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PresentationId")
	long presentationId;
	
	@Column(name = "UserId")
	long userId;
	
	@Column(name = "PresentationTitle")
	String presentationTitle;
	
	@Column(name = "Url")
	String urlPresentation;
	
	@Column(name = "Descriptions")
	String descriptionPresentation;
	
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

	public long getPresentationId() {
		return presentationId;
	}

	public void setPresentationId(long presentationId) {
		this.presentationId = presentationId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getPresentationTitle() {
		return presentationTitle;
	}

	public void setPresentationTitle(String presentationTitle) {
		this.presentationTitle = presentationTitle;
	}

	public String getUrlPresentation() {
		return urlPresentation;
	}

	public void setUrlPresentation(String urlPresentation) {
		this.urlPresentation = urlPresentation;
	}

	public String getDescriptionPresentation() {
		return descriptionPresentation;
	}

	public void setDescriptionPresentation(String descriptionPresentation) {
		this.descriptionPresentation = descriptionPresentation;
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

	public Presentation(long presentationId, long userId, String presentationTitle, String urlPresentation,
			String descriptionPresentation, Long adminId, Long createdBy, Long updatedBy) {
		super();
		this.presentationId = presentationId;
		this.userId = userId;
		this.presentationTitle = presentationTitle;
		this.urlPresentation = urlPresentation;
		this.descriptionPresentation = descriptionPresentation;
		AdminId = adminId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public Presentation() {
		super();
		// TODO Auto-generated constructor stub
	}

}
