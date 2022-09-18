package com.cg.entites;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name="student")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int Id;
	
	@Column(name="Name")
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="college_id")
	private College college;
	
	@Column(name="RollNo")
	private int rollno;
	
	@Column(name="Qualification")
	private String qualification;
	
	@Column(name="Courses")
	private String courses;
	
	@Column(name="Year")
	private int year;
	
	@Column(name="HallTicket")
	private int hallTicketNo;
	
	//@OneToOne annotation is used for connecting student and certificate table
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="certificate_id")
	private Certificate certificate;

	//getters and setters
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHallTicketNo() {
		return hallTicketNo;
	}

	public void setHallTicketNo(int hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	
	
	
}
