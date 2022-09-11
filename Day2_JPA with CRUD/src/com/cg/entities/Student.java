package com.cg.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student implements  Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int rollno;
	private String name;
	
	//getters and setter
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
	

}
