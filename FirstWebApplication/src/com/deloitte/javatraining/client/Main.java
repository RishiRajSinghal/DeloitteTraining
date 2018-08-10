package com.deloitte.javatraining.client;

import com.deloitte.javatraining.dao.CustomerDAO;
import com.deloitte.javatraining.dao.impl.CustomerDAOImpl;
import com.deloitte.javatraining.entity.Customer;

public class Main
{
	public static void main(String[] args) {
		Customer customer = new Customer(1,"neha","pune",12000);
		//CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
		//String result = customerDAOImpl.insertcustomerdetails(customer);
		CustomerDAO customerDAO = new CustomerDAOImpl();
		
		String result = customerDAO.insertcustomerdetails(customer);
		System.out.println(result);
	}
}
