import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernates.util.HibernateUtil;
import com.oneToManyBidirectionalmapping.Student;
import com.oneToManyBidirectionalmapping.University;

public class Application {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Student student1 = new Student("Sam","Disilva","Maths");
        Student student2 = new Student("Joshua", "Brill", "Science");
        Student student3 = new Student("Peter", "Pan", "Physics");
         
        University university = new University("CAMBRIDGE", "ENGLAND");
 
        student1.setUniversity(university);
        student2.setUniversity(university);
        student3.setUniversity(university);
 
 
        session.persist(university);
        session.persist(student1);
        session.persist(student2);
        session.persist(student3);
         
		
		
		session.beginTransaction().commit();

	}

}
