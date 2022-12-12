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
@Table(name = "certification")
public class Certification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CertificationId")
	long certificationId;
	
	@Column(name = "UserId")
	long userId;
	
	@Column(name = "CertificationName")
	String certificationName;
	
	@Column(name = "CompletionId")
	String certificationCompletionId;
	
	@Column(name = "Url")
	String certificationUrl;
	
	@Column(name = "YearCrtificationFrom")
	int yearCrtificationFrom;
	
	@Column(name = "MonthCertificationFrom")
	String monthCertificationFrom;
	
	@Column(name = "YearCrtificationTo")
	int yearCrtificationTo;
	
	@Column(name = "MonthCertificationTo")
	String monthCertificationTo;
	
	@Column(name = "IsCertificationNotExpire")
	boolean isCertificationNotExpire;
	
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
		return "Certification [certificationId=" + certificationId + ", userId=" + userId + ", certificationName="
				+ certificationName + ", certificationCompletionId=" + certificationCompletionId + ", certificationUrl="
				+ certificationUrl + ", yearCrtificationFrom=" + yearCrtificationFrom + ", monthCertificationFrom="
				+ monthCertificationFrom + ", yearCrtificationTo=" + yearCrtificationTo + ", monthCertificationTo="
				+ monthCertificationTo + ", isCertificationNotExpire=" + isCertificationNotExpire + ", AdminId="
				+ AdminId + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}

	public long getCertificationId() {
		return certificationId;
	}

	public void setCertificationId(long certificationId) {
		this.certificationId = certificationId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getCertificationName() {
		return certificationName;
	}

	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}

	public String getCertificationCompletionId() {
		return certificationCompletionId;
	}

	public void setCertificationCompletionId(String certificationCompletionId) {
		this.certificationCompletionId = certificationCompletionId;
	}

	public String getCertificationUrl() {
		return certificationUrl;
	}

	public void setCertificationUrl(String certificationUrl) {
		this.certificationUrl = certificationUrl;
	}

	public int getYearCrtificationFrom() {
		return yearCrtificationFrom;
	}

	public void setYearCrtificationFrom(int yearCrtificationFrom) {
		this.yearCrtificationFrom = yearCrtificationFrom;
	}

	public String getMonthCertificationFrom() {
		return monthCertificationFrom;
	}

	public void setMonthCertificationFrom(String monthCertificationFrom) {
		this.monthCertificationFrom = monthCertificationFrom;
	}

	public int getYearCrtificationTo() {
		return yearCrtificationTo;
	}

	public void setYearCrtificationTo(int yearCrtificationTo) {
		this.yearCrtificationTo = yearCrtificationTo;
	}

	public String getMonthCertificationTo() {
		return monthCertificationTo;
	}

	public void setMonthCertificationTo(String monthCertificationTo) {
		this.monthCertificationTo = monthCertificationTo;
	}

	public boolean getIsCertificationNotExpire() {
		return isCertificationNotExpire;
	}

	public void setIsCertificationNotExpire(boolean isCertificationNotExpire) {
		this.isCertificationNotExpire = isCertificationNotExpire;
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

	public Certification(long certificationId, long userId, String certificationName, String certificationCompletionId,
			String certificationUrl, int yearCrtificationFrom, String monthCertificationFrom, int yearCrtificationTo,
			String monthCertificationTo, boolean isCertificationNotExpire, Long adminId, Long createdBy,
			Long updatedBy) {
		super();
		this.certificationId = certificationId;
		this.userId = userId;
		this.certificationName = certificationName;
		this.certificationCompletionId = certificationCompletionId;
		this.certificationUrl = certificationUrl;
		this.yearCrtificationFrom = yearCrtificationFrom;
		this.monthCertificationFrom = monthCertificationFrom;
		this.yearCrtificationTo = yearCrtificationTo;
		this.monthCertificationTo = monthCertificationTo;
		this.isCertificationNotExpire = isCertificationNotExpire;
		AdminId = adminId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}

}
