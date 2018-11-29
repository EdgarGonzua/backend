package com.gonzua.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
@Access(AccessType.FIELD)
public class User extends ParentEntity{

	private static final long serialVersionUID = 808764319939920659L;
	
	@Column(name="first_name", nullable = false, length=255 ) 
	private String firstName;
	
	@Column(name="second_name", nullable = true, length=255 )
 	private String secondName;
	
	@Column(name="first_surname", nullable = false, length=255 )
	private String firstSurname;
	
	@Column(name="secod_surname", nullable = true, length=255 )
	private String secodSurname;
	
	@Column(name="phone", nullable = true, length=30 )
	private String phone;
	
	@Column(name="addres", nullable = false, length=255 )
	private String addres;
	 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getFirstSurname() {
		return firstSurname;
	}
	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}
	public String getSecodSurname() {
		return secodSurname;
	}
	public void setSecodSurname(String secodSurname) {
		this.secodSurname = secodSurname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}

}
