package com.hibernate.mavenDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {

	public static void main(String[] args) {


		Student stud1 =new Student(1001,"Pradip","Gadekar",95036046);
		Student stud2 =new Student(1002,"Ganesh","Bhute",445555);
		Student stud3 =new Student(1003,"Xyz","Bhute",95035546);
		Student stud4 =new Student(1004,"Yogesh","Bhoote",566865);

		Configuration cfg = new Configuration();
		SessionFactory sfact = cfg.configure().buildSessionFactory();
		Session session = sfact.openSession();
		Transaction t = session.beginTransaction();

		session.save(stud1);
		session.save(stud2);
		session.save(stud3);
		session.save(stud4);
		t.commit();
		session.close();
		
		
		
		

		System.out.println("Successfull....");

	}

}
