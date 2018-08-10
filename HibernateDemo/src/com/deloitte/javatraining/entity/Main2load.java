package com.deloitte.javatraining.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main2load {
public static void main(String[] args) {
	Customer customer = new Customer(1,"rishi","blore",437);
	
	//load hibernate connection
	Configuration configuration = new Configuration().configure();
	
	//create sessionfactory
	SessionFactory factory = configuration.buildSessionFactory();
	
	//open session
	Session session = factory.openSession();
	
	
	//Transaction transaction = session.beginTransaction();
	
	//customer = (Customer) session.get(Customer.class, 13);
	//System.out.println(customer);
	
	customer = (Customer) session.load(Customer.class, 13);
	System.out.println(customer);
	session.save(customer); //in .get u dont have to use save
	//transaction.commit();
	session.close();
	factory.close();
	
System.out.println("done");
}
}
