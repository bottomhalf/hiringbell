package com.hiringbell.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "educationlist")
public class EducationList {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EducationListId")
	long educationListId;
	
	@Column(name = "EducationName")
	String educationName;
	
	@Column(name = "EducationNameValue")
	String educationNameValue;
	
	@Column(name = "ChildId")
	long childId;

	@Override
	public String toString() {
		return "EducationList [educationListId=" + educationListId + ", educationName=" + educationName
				+ ", educationNameValue=" + educationNameValue + ", childId=" + childId + "]";
	}

	public long getEducationListId() {
		return educationListId;
	}

	public void setEducationListId(long educationListId) {
		this.educationListId = educationListId;
	}

	public String getEducationName() {
		return educationName;
	}

	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}

	public String getEducationNameValue() {
		return educationNameValue;
	}

	public void setEducationNameValue(String educationNameValue) {
		this.educationNameValue = educationNameValue;
	}

	public long getChildId() {
		return childId;
	}

	public void setChildId(long childId) {
		this.childId = childId;
	}

	public EducationList(long educationListId, String educationName, String educationNameValue, long childId) {
		super();
		this.educationListId = educationListId;
		this.educationName = educationName;
		this.educationNameValue = educationNameValue;
		this.childId = childId;
	}

	public EducationList() {
		super();
		// TODO Auto-generated constructor stub
	}

}
