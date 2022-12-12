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
	
	@Column(name = "UserId")
	long userId;
	
	@Column(name = "Education")
	int education;
	
	@Column(name = "Board")
	int board;
	
	@Column(name = "SchoolMedium")
	String schoolMedium;
	
	@Column(name = "TotalMarks")
	String totalMarks;
	
	@Column(name = "EnglishMarks")
	Double englishMarks;
	
	@Column(name = "MathsMarks")
	Double mathsMarks;
	
	@Column(name = "Course")
	int course;
	
	@Column(name = "OtherCourse")
	String otherCourse;
	
	@Column(name = "Specialization")
	int specialization;
	
	@Column(name = "OtherSpecialization")
	String otherSpecialization;
	
	@Column(name = "UniversityInstitute")
	String universityInstitute;
	
	@Column(name = "CourseType")
	int courseType;
	
	@Column(name = "PassingOutYear")
	int passingOutYear;
	
	@Column(name = "GradingSystem")
	String gradingSystem;
	
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
		return "EducationalDetail [educationalDetailId=" + educationalDetailId + ", userId=" + userId + ", education="
				+ education + ", board=" + board + ", schoolMedium=" + schoolMedium + ", totalMarks=" + totalMarks
				+ ", englishMarks=" + englishMarks + ", mathsMarks=" + mathsMarks + ", course=" + course
				+ ", otherCourse=" + otherCourse + ", specialization=" + specialization + ", otherSpecialization="
				+ otherSpecialization + ", universityInstitute=" + universityInstitute + ", courseType=" + courseType
				+ ", passingOutYear=" + passingOutYear + ", gradingSystem=" + gradingSystem + ", AdminId=" + AdminId
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}

	public long getEducationalDetailId() {
		return educationalDetailId;
	}

	public void setEducationalDetailId(long educationalDetailId) {
		this.educationalDetailId = educationalDetailId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getEducation() {
		return education;
	}

	public void setEducation(int education) {
		this.education = education;
	}

	public int getBoard() {
		return board;
	}

	public void setBoard(int board) {
		this.board = board;
	}

	public String getSchoolMedium() {
		return schoolMedium;
	}

	public void setSchoolMedium(String schoolMedium) {
		this.schoolMedium = schoolMedium;
	}

	public String getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(String totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Double getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(Double englishMarks) {
		this.englishMarks = englishMarks;
	}

	public Double getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(Double mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getOtherCourse() {
		return otherCourse;
	}

	public void setOtherCourse(String otherCourse) {
		this.otherCourse = otherCourse;
	}

	public int getSpecialization() {
		return specialization;
	}

	public void setSpecialization(int specialization) {
		this.specialization = specialization;
	}

	public String getOtherSpecialization() {
		return otherSpecialization;
	}

	public void setOtherSpecialization(String otherSpecialization) {
		this.otherSpecialization = otherSpecialization;
	}

	public String getUniversityInstitute() {
		return universityInstitute;
	}

	public void setUniversityInstitute(String universityInstitute) {
		this.universityInstitute = universityInstitute;
	}

	public int getCourseType() {
		return courseType;
	}

	public void setCourseType(int courseType) {
		this.courseType = courseType;
	}

	public int getPassingOutYear() {
		return passingOutYear;
	}

	public void setPassingOutYear(int passingOutYear) {
		this.passingOutYear = passingOutYear;
	}

	public String getGradingSystem() {
		return gradingSystem;
	}

	public void setGradingSystem(String gradingSystem) {
		this.gradingSystem = gradingSystem;
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

	public EducationalDetail(long educationalDetailId, long userId, int education, int board, String schoolMedium,
			String totalMarks, Double englishMarks, Double mathsMarks, int course, String otherCourse,
			int specialization, String otherSpecialization, String universityInstitute, int courseType,
			int passingOutYear, String gradingSystem, Long adminId, Long createdBy, Long updatedBy) {
		super();
		this.educationalDetailId = educationalDetailId;
		this.userId = userId;
		this.education = education;
		this.board = board;
		this.schoolMedium = schoolMedium;
		this.totalMarks = totalMarks;
		this.englishMarks = englishMarks;
		this.mathsMarks = mathsMarks;
		this.course = course;
		this.otherCourse = otherCourse;
		this.specialization = specialization;
		this.otherSpecialization = otherSpecialization;
		this.universityInstitute = universityInstitute;
		this.courseType = courseType;
		this.passingOutYear = passingOutYear;
		this.gradingSystem = gradingSystem;
		AdminId = adminId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public EducationalDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
