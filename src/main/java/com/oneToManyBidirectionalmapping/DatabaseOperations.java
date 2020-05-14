package com.oneToManyBidirectionalmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernates.util.HibernateUtil;

public class DatabaseOperations {
	
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		Student student=session.get(Student.class, new Long(4));
		System.out.println(student);
		
	}

}
