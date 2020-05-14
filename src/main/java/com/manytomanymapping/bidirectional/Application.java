package com.manytomanymapping.bidirectional;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernates.util.HibernateUtil;

public class Application {

	public static void main(String[] args) {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

			Session session = sessionFactory.openSession();

			session.beginTransaction();

			
			Project project1 = new Project("GermanLanguageProject");
			Project project2 = new Project("AngularProject");
			Project project3 = new Project("Mysql Project");
			Employee employee1 = new Employee("Shreya", "Jalihal");
			employee1.addProject(project1);
			employee1.addProject(project2);
			employee1.addProject(project3);
			System.out.println(employee1);
			Employee employee2 = new Employee("Shridha", "Jalihal");
			employee2.addProject(project3);
			employee2.addProject(project2);
			
			session.persist(employee1);
			session.persist(employee2);
			session.getTransaction().commit();
			session.close();
			System.out.println("Saved the Employee and Project details successfully");
		
	}

}
