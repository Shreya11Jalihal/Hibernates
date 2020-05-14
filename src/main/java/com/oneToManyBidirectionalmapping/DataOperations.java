package com.oneToManyBidirectionalmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernates.util.HibernateUtil;
import com.manytomanymapping.bidirectional.Employee;

public class DataOperations {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Employee employee = session.get(Employee.class, new Long(3));
		employee.removeEmployee();
		session.delete(employee);
		session.getTransaction().commit();
		System.out.println("Employee Deleted");

	}
	

	
	

}
