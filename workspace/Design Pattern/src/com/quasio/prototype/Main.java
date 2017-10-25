package com.quasio.prototype;

public class Main {

	public static void main(String[] args) {
//		Making first object :
		Person p1 = new Person();
		p1.setName("Abhay");
		p1.setId(1);
		
		

		Person p2 =null;
		try {
			 p2 =(Person) p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Changing values after clonning
		p1.setName("Abhinav");
		p2.setId(2);
		p2.setName("Bhuwan");
		
		
//		Checking the values in object :
		System.out.println(p1);
		System.out.println(p2);
	}

}
