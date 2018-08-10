package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcometoservlet
 */
public class Welcometoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcometoservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType("text/plain");//gives plain data
		response.setContentType("application/pdf");
		String nn = request.getParameter("username");
		java.util.Date d = new java.util.Date();
		//response.getWriter().println("<h1>welcome  Mohammad Tufail Ahmed Servlet");
		response.getWriter().println("<h1>welcome "+nn);
		response.getWriter().println("<h1>Current Date and time is"+d);
		response.getWriter().println("<h1><a href = 'thanks.html'>say thanks</a></h1>");
	}

}
