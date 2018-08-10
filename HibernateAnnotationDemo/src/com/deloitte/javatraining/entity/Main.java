package com.deloitte.javatraining.entity;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	Customer customer = new Customer(4,"rishi","blore",437);
	
	//load hibernate connection
	AnnotationConfiguration configuration = new AnnotationConfiguration().configure();
	
	//create sessionfactory
	SessionFactory factory = configuration.buildSessionFactory();
	
	//open session
	Session session = factory.openSession();
	
	
	Transaction transaction = session.beginTransaction();
	
	
	session.save(customer);
	customer.setCustomerAddress("jalandhar");//change reflected in database
	session.save(customer);
	transaction.commit();
	customer.setCustomerAddress("gandhinagar"); //change not reflected in database
	session.close();
	factory.close();
	
System.out.println("done");
}
}
