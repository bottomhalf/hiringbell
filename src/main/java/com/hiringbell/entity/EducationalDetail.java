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
@Table(name = "educationaldetail")
public class EducationalDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EducationalDetailId")
	long educationalDetailId;
	
	@Column(name = "DegreeName")
	String degreeName;
	
	@Column(name = "PassoutYear")
	Date passoutYear;
	
	@Column(name = "Specialization")
	String specialization;
	
	@Column(name = "UniversityName")
	String universityName;
	
	@Column(name = "CourseType")
	String courseType;
	
	@Column(name = "GradingSystem")
	String gradingSystem;
	
	@Column(name = "Course")
	String course;
	
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
		return "EducationalDetail [educationalDetailId=" + educationalDetailId + ", degreeName=" + degreeName
				+ ", passoutYear=" + passoutYear + ", specialization=" + specialization + ", universityName="
				+ universityName + ", courseType=" + courseType + ", gradingSystem=" + gradingSystem + ", course="
				+ course + ", AdminId=" + AdminId + "]";
	}

	public long getEducationalDetailId() {
		return educationalDetailId;
	}

	public void setEducationalDetailId(long educationalDetailId) {
		this.educationalDetailId = educationalDetailId;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public Date getPassoutYear() {
		return passoutYear;
	}

	public void setPassoutYear(Date passoutYear) {
		this.passoutYear = passoutYear;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getGradingSystem() {
		return gradingSystem;
	}

	public void setGradingSystem(String gradingSystem) {
		this.gradingSystem = gradingSystem;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Long getAdminId() {
		return AdminId;
	}

	public void setAdminId(Long adminId) {
		AdminId = adminId;
	}

	public EducationalDetail(long educationalDetailId, String degreeName, Date passoutYear, String specialization,
			String universityName, String courseType, String gradingSystem, String course, Long adminId) {
		super();
		this.educationalDetailId = educationalDetailId;
		this.degreeName = degreeName;
		this.passoutYear = passoutYear;
		this.specialization = specialization;
		this.universityName = universityName;
		this.courseType = courseType;
		this.gradingSystem = gradingSystem;
		this.course = course;
		AdminId = adminId;
	}

	public EducationalDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
