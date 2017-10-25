package com.quasio.prototype;

public class Person implements Cloneable{
public String name;
public int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	
	return "Name : '" + this.name + "'    Id : '"+this.id+"' ";
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}


}
