package org.quasio.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainPersonVehicleManyToOneMapping {

	public static void main(String[] args) {
		Person p =new Person();
		p.setName("Arvind");
		
		Vehicle v1 =new Vehicle();
		v1.setName("i20");
		v1.setPerson(p);
		
		Vehicle v2 =new Vehicle();
		v2.setName("Swift");
		v2.setPerson(p);
		
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		Session session =factory.openSession();
		session.beginTransaction();
//		session.save(p);
		session.persist(v1);
		session.save(v2);
		session.getTransaction().commit();
		session.close();

	}

}
