package com.oneToManyBidirectionalmapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernates.util.HibernateUtil;

public class OneToManyBidirectionalApplication {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		/*
		 * List<Student> listofStudents = Arrays.asList(new Student("Shreya", "Jalihal",
		 * "Electronics"), new Student("Shridha", "Jalihal", "ComputerScience"), new
		 * Student("Chetan", "Basavaraj", "ElectronicsCommunication"));
		 */
		Student student1 = new Student("Shridha", "Jalihal", "ComputerScience");
		Student student2 = new Student("Shreya", "Jalihal", "Electronics");
		University university = new University("Walchand", "India");
		Student student3 = new Student("Chetan", "Basavaraj", "ElectronicsCommunication");
		student1.setUniversity(university);
		student2.setUniversity(university);
		student3.setUniversity(university);
		
		List<Student> listofStudents = new ArrayList<Student>();
		listofStudents.add(student1);
		listofStudents.add(student2);
		listofStudents.add(student3);
		university.setStudents(listofStudents);
		/*
		 * session.save(student1); session.save(student2); session.save(student3);
		 */
		session.save(university);
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

		System.out.println("Successfully persisted the University Details");

	}

}
