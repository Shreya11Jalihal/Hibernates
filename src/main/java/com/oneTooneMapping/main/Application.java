package com.oneTooneMapping.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernates.util.HibernateUtil;

public class Application {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		Applicant applicant2 = new Applicant("Chetan", 30, "Germany");

		Passport passport2 = new Passport("KDSDR681", new Date(), new Date());
		passport2.setApplicant(applicant2);
		session.save(passport2);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			transaction.commit();
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}

		System.out.println("Successfully persisted the Applicant Details");

	}

}
