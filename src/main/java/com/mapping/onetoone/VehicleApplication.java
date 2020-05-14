package com.mapping.onetoone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernates.util.HibernateUtil;

public class VehicleApplication {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		Service service = null;

		Transaction trans = null;
		BufferedReader buffreader = null;
		try {
			FileReader reader = new FileReader("D:\\file.txt");
			buffreader = new BufferedReader(reader);
			String line;
			String[] splited = null;
			while ((line = buffreader.readLine()) != null) {
				splited = line.split(",");
			}
			service = new Service();
			Vehicle vehicle = service.setValues(splited);
			session.save(vehicle);
			trans = session.beginTransaction();
			trans.commit();

		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		
	}
}
