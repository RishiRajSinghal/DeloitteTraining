package com.deloitte.javatraining.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.deloitte.javatraining.dao.CustomerDAO;
import com.deloitte.javatraining.entity.Customer;
import com.deloitte.javatraining.dbcon.*;
public class CustomerDAOImpl implements CustomerDAO {

	Connection connection =DBConnection.getConnection();
	int results;
	@Override
	public String insertcustomerdetails(Customer customer) {
		PreparedStatement prepareStatement;
		try {
			prepareStatement = connection.prepareStatement("insert into customer values(?,?,?,?)");
			prepareStatement.setInt(1, customer.getCustomerId());
			prepareStatement.setString(2, customer.getCustomerName());
			prepareStatement.setString(3, customer.getCustomerAddress());
			prepareStatement.setInt(4, customer.getBillAmount());
			results =prepareStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(results == 0)
			return "insert failed";
		else
			return "insert successful";
		
	}

	@Override
	public Customer findbycustomerid(int customerid) {
		PreparedStatement prepareStatement;
		Customer customer = null;
		
		try {
			prepareStatement = connection.prepareStatement("select * from customer where customerId=?");
			prepareStatement.setInt(1, customerid);
			
			ResultSet data = prepareStatement.executeQuery();
			data.next();
			customer.setCustomerId(data.getInt(1));
			customer.setCustomerName(data.getString(2));
			customer.setCustomerAddress(data.getString(3));
			customer.setBillAmount(data.getInt(4));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
		
		
	}

	@Override
	public boolean isCustomerExists(int customerid) {
		PreparedStatement prepareStatement;
		boolean recordExists = false;
		try {
			prepareStatement = connection.prepareStatement("select * from customer where customerid = ?");
			prepareStatement.setInt(1, customerid);
			
			ResultSet data =prepareStatement.executeQuery();
			recordExists = data.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return recordExists;
		
	}

	@Override
	public boolean deleteCustomer(int customerid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer updateCustomer(int customerid, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> listAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
