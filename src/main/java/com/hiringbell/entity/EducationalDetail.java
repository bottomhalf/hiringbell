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
@Table(name = "educationaldetail")
public class EducationalDetail {
	
	@Id
	@Column(name = "EducationalDetail_Id")
	long edId;
	
	@Column(name = "Degree_Name")
	String degreeName;
	
	@Column(name = "Passout_Year")
	Date passoutYear;
	
	@Column(name = "Specialization")
	String specialization;
	
	@Column(name = "University_Name")
	String universityName;
	
	@Column(name = "Course_Type")
	String courseType;
	
	@Column(name = "Grading_System")
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
		return "EducationalDetail [edId=" + edId + ", degreeName=" + degreeName + ", passoutYear=" + passoutYear
				+ ", specialization=" + specialization + ", universityName=" + universityName + ", courseType="
				+ courseType + ", gradingSystem=" + gradingSystem + ", course=" + course + ", AdminId=" + AdminId + "]";
	}

	public long getEdId() {
		return edId;
	}

	public void setEdId(long edId) {
		this.edId = edId;
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

	public EducationalDetail(long edId, String degreeName, Date passoutYear, String specialization,
			String universityName, String courseType, String gradingSystem, String course, Long adminId) {
		super();
		this.edId = edId;
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
