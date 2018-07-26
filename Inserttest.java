package Day9;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Day9.connection.Myconnection;

public class Inserttest {
public static void main(String[] args) throws SQLException {
	Connection connection = Myconnection.getConnection();
	Statement stmt = connection.createStatement();
	
	
	int rowsaffected = stmt.executeUpdate("insert into student values (5,'ranjana','03-FEB-1996','18-june-2018')");
	System.out.println(rowsaffected +" row(s)affected");
	ResultSet rs = stmt.executeQuery("select * from student");
	while(rs.next())
	{
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getString(4));
	}
	connection.close();
}
}
