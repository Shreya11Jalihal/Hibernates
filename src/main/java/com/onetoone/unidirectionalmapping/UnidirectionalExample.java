package com.onetoone.unidirectionalmapping;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernates.util.HibernateUtil;

public class UnidirectionalExample {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Customer customer = new Customer("Shreya", 12);
		Address address = new Address("Bangalore", "India", 560037);
		customer.setAddress(address);

		Transaction tx = null;
		session.save(customer);
		try {
			tx = session.beginTransaction();
			tx.commit();
			System.out.println("Customer saved successfully");
		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}

	}
}