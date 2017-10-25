package org.quasio.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teacher_Details")
public class Teacher {
@Id @GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="Teacher_ID")
private int id;

@Column(name="Teacher_Name")
private String name;

// @Embedded is optional as we have already declared @Embeddable on Address class :
@Embedded
@AttributeOverrides({
	@AttributeOverride(name="colony", column=@Column(name="Home_Colony")),
	@AttributeOverride(name="city", column=@Column(name="Home_City")),
	@AttributeOverride(name="state", column=@Column(name="Home_State")),
	@AttributeOverride(name="pincode", column=@Column(name="Home_Pincode")),
})
private Address homeAddress;

@Embedded
private Address officeAddress;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Address getHomeAddress() {
	return homeAddress;
}
public void setHomeAddress(Address address) {
	this.homeAddress = address;
}

public Address getOfficeAddress() {
	return officeAddress;
}
public void setOfficeAddress(Address address) {
	this.officeAddress = address;
}

}
