package org.quasio.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setName("Chachi");
		student.setSurname("Stark");
		
// Creating a session factory :
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
//		Saving a object into database :
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();

//		Retrieving object from Database ;
		student = null;
	    session = factory.openSession();
		session.beginTransaction();
		student = session.get(Student.class, 1);
		System.out.println("Name : "+student.getName() +" "+student.getSurname()+" and ID is  "+student.getId());
	}

}

/*
Code for Teacher Class :

Teacher teacher = new Teacher();
teacher.setId(2);
teacher.setName("Bhawna");

session.save(teacher);

*/