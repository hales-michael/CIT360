package edu.byui.cit360;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


// Adds items to inventory
public class addInventory {
	public static void main(String[] args) throws Exception {

		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		Inventory inv = new Inventory();
		inv.setName("Slighty-used Severed Android Head");
		inv.setColor("Unknown");
		inv.setPrice((float) 2500000);
		session.save(inv);
		tr.commit();
		System.out.println("Successfully inserted");
		sessFact.close();
	}

}
