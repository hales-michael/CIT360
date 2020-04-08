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
		inv.setName("Doohickey");
		inv.setColor("Green");
		inv.setPrice((float) 19.99);
		session.save(inv);
		tr.commit();
		System.out.println("Successfully inserted");
		sessFact.close();
	}

}
