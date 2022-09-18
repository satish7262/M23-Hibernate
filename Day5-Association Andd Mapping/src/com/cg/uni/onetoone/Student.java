package com.cg.uni.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table it is used to auto generate column in MySQL
@Table(name="Student")
public class Student 
{ 
	@Id
	//@Column annotation is used to auto generate column in MySQL
	@Column(name="Rollno")
	private int rollno;
	
	@Column(name="Name")
	private String name;
	
	@Column (name="Percentage")
	private float percentage;
	/*@OneToOne annotation whenever we are going to use one on one that we have address
	in address there are streetno, area, city, state*/
	@OneToOne(cascade=CascadeType.ALL)
	
	/* @JoinColumn we have to join all the column of address with the student so 
	we have to go with join column annotation*/ 
	@JoinColumn(name="Streetno") 
	private Address address;
	
	//Default constructor
	public Student() {
		super();
		
		
	}
	//parameterized constructor for all fields
	public Student(int rollno, String name, float percentage, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		this.address = address;
	}
	//getters and setters
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	//getters and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	

}