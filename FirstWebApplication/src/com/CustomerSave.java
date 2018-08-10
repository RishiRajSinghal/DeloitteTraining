package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.javatraining.dao.CustomerDAO;
import com.deloitte.javatraining.dao.impl.CustomerDAOImpl;
import com.deloitte.javatraining.entity.Customer;

/**
 * Servlet implementation class CustomerSave
 */
public class CustomerSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerSave() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int custid=Integer.parseInt(request.getParameter("customerId"));
		String custName = request.getParameter("customerName");
		String custAddress = request.getParameter("customerAddress");
		int BillAmount = Integer.parseInt(request.getParameter("BillAmount"));
		
		
		CustomerDAO d = new CustomerDAOImpl();
		
		Customer c = new Customer();
		c.setCustomerId(custid);
		c.setCustomerName(custName);
		c.setCustomerAddress(custAddress);
		c.setBillAmount(BillAmount);
		
		d.insertcustomerdetails(c);
		
		/*Connection conn = Myconnection.getConnection();
		
		PreparedStatement st;
		
		
		try {
			st = conn.prepareStatement("insert into customer values(?,?,?,?)");
			st.setInt(1, custid);
			st.setString(2, custName);
			st.setString(3, custAddress);
			st.setInt(4,BillAmount);
			
			st.executeUpdate();
			System.out.println("saved");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//CustomerDAOImpl customer= new CustomerDAOImpl();
*/		
		response.getWriter().println("<a href = Success>Data Stored Successfully</a>");
		
		RequestDispatcher r = request.getRequestDispatcher("Success");
		//r.forward(request, response);
		r.include(request, response);
	}

}
