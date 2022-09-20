package com.cg.joinedinheritance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Employee2")
@Inheritance(strategy=InheritanceType.JOINED)

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	//it creates Id automatically in MySql
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int EmpId;
	private String name;
	private float salary;
	
	//getters and setters method
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	
	

}