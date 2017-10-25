package org.quasio.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainForEmbeddableExample {

	public static void main(String[] args) {
		Address homeAddress =new Address("Royal Imperio", "Pune", "Maharashtra", 411027);
		Address officeAddress =new Address("Infosys", "Pune", "Maharashtra", 411027);
		Teacher teacher = new Teacher();
		teacher.setName("Abhinav");
		teacher.setHomeAddress(homeAddress);
		teacher.setOfficeAddress(officeAddress);
		

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(teacher);
		session.getTransaction().commit();
		session.close();

	}

}

