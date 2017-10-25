package org.quasio.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Detail")
public class Student {
	
//	Can put @Id and @Column annotation either on class fields or on getter method for that field
	
@Id /*@GeneratedValue  annotation is used to generate primary key by itself , and it is used in case of surrogate key where value is not imp from business perspective*/
@Column(name="Student_ID")
private int id;

@Column(name="Student_Name")
private String name;

@Column(name="Student_SurName")
private String surname;
public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}
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



}
