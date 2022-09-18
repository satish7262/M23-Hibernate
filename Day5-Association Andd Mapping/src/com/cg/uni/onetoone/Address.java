package com.cg.uni.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address 
{
	@Id
	@Column(name="Streetno")
	private int streetno;
	@Column(name="Area")
	private String area;
	@Column(name="City")
	private String city;
	@Column(name="State")
	private String state;public Address() {
		super();

	}
	public Address(int streetno, String area, String city, String state) {
		super();
		this.streetno = streetno;
		this.area = area;
		this.city = city;
		this.state = state;
	}
	//getters and setters
	public int getStreetno() {
		return streetno;
	}
	public void setStreetno(int streetno) {
		this.streetno = streetno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [streetno=" + streetno + ", area=" + area + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	

}
