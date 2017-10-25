package org.quasio.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name="Colony")
private String colony;
	@Column(name="City")
private String city;
	@Column(name="State")
private String state;
	@Column(name="PinCode")
private double pincode;
public Address() {
	super();
}
public Address(String colony, String city, String state, double pincode) {

	this.colony = colony;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
}
public String getColony() {
	return colony;
}
public String getCity() {
	return city;
}
public String getState() {
	return state;
}
public double getPincode() {
	return pincode;
}
}
