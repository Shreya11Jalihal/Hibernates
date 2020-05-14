package com.onetoone.unidirectionalmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernates.util.HibernateUtil;

public class DatabaseOperations {
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		/*
		 * Customer customer=session.get(Customer.class, 2);
		 * System.out.println(customer);
		 */
		//with this you will retrieve only the Address data contents and not 
		//the customer data
		Address address=session.get(Address.class,new Long(2));
		System.out.println(address);
	}

}
