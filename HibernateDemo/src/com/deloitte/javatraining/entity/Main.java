package com.deloitte.javatraining.entity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Main {
public static void main(String[] args) {
	Customer customer = new Customer(4,"rishi","blore",437);
	
	//load hibernate connection
	Configuration configuration = new Configuration().configure();
	
	//create sessionfactory
	SessionFactory factory = configuration.buildSessionFactory();
	
	//open session
	Session session = factory.openSession();
	
	
	Transaction transaction = session.beginTransaction();
	
	//Query q = session.createQuery("from com.deloitte.javatraining.entity.Customer");
	//for printing all records
	
	Criteria c=session.createCriteria(Customer.class)
	
	.add(Restrictions.like("customerName", "%i%"))
	.add(Restrictions.between("billAmount", new Integer(200),new Integer(500)));
	//.add(Restrictions.like(propertyName, value));
	List<Customer> list = c.list();
	
	
	//Iterator<Customer> i = q.iterate(); //for printing all records
	
	Iterator<Customer> i=list.iterator();
	while(i.hasNext())
	{
		Customer c1 = i.next();
		System.out.println(c1);
	}
	
	
	/*session.save(customer);
	customer.setCustomerAddress("jalandhar");//change reflected in database
	session.save(customer);
	transaction.commit();
	customer.setCustomerAddress("gandhinagar"); //change not reflected in database
*/	
	session.close();
	factory.close();
	
System.out.println("done");
}
}

