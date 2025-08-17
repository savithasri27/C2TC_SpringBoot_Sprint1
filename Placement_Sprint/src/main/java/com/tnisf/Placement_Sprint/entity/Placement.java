package com.tnisf.Placement_Sprint.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Placement {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int placementId;

    @Column(name = "studentName")
    private String studentName;

    @Column(name = "studentDepartment")
    private String studentDepartment;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "jobRole")
    private String jobRole;

    @Column(name = "placementStatus")
    private String placementStatus; // e.g., Applied, Selected, Rejected

    @Column(name = "interviewDate")
    private String interviewDate;

	public int getPlacementId() {
		return placementId;
	}
	

	public Placement(int placementId, String studentName, String studentDepartment, String companyName, String jobRole,
			String placementStatus, String interviewDate) {
		super();
		this.placementId = placementId;
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
		this.companyName = companyName;
		this.jobRole = jobRole;
		this.placementStatus = placementStatus;
		this.interviewDate = interviewDate;
	}


	public void setPlacementId(int placementId) {
		this.placementId = placementId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDepartment() {
		return studentDepartment;
	}

	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public String getPlacementStatus() {
		return placementStatus;
	}

	public void setPlacementStatus(String placementStatus) {
		this.placementStatus = placementStatus;
	}

	public String getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}

	@Override
	public String toString() {
		return "Placement [placementId=" + placementId + ", studentName=" + studentName + ", studentDepartment="
				+ studentDepartment + ", companyName=" + companyName + ", jobRole=" + jobRole + ", placementStatus="
				+ placementStatus + ", interviewDate=" + interviewDate + "]";
	}
    
    

}