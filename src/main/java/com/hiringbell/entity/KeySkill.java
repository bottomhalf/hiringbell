package com.hiringbell.entity;

import java.sql.Date;
import java.util.ArrayList;

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
@Table(name = "keyskill")
public class KeySkill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "KeySkillId")
	long keySkillId;
	
	@Column(name = "UserId")
	long userId;
	
	@Transient
	ArrayList<String> keySkillData;
	
	@Column(name = "KeySkill")
	String keySkill;
	
	
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

	public long getKeySkillId() {
		return keySkillId;
	}

	public void setKeySkillId(long keySkillId) {
		this.keySkillId = keySkillId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public ArrayList<String> getKeySkillData() {
		return keySkillData;
	}

	public void setKeySkillData(ArrayList<String> keySkillData) {
		this.keySkillData = keySkillData;
	}

	public String getKeySkill() {
		return keySkill;
	}

	public void setKeySkill(String keySkill) {
		this.keySkill = keySkill;
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

	public KeySkill(long keySkillId, long userId, ArrayList<String> keySkillData, String keySkill, Long adminId,
			Long createdBy, Long updatedBy) {
		super();
		this.keySkillId = keySkillId;
		this.userId = userId;
		this.keySkillData = keySkillData;
		this.keySkill = keySkill;
		AdminId = adminId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public KeySkill() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
