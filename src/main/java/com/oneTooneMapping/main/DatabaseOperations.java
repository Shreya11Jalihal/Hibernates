package com.oneTooneMapping.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernates.util.HibernateUtil;

public class DatabaseOperations {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Passport passport=session.get(Passport.class,1);
		System.out.println(passport);
		System.out.println(passport.getApplicant());
		
	}

}
