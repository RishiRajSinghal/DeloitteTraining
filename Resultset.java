package Day9;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Day9.connection.Myconnection;

public class Resultset {
public static void main(String[] args) throws SQLException {
	Connection conn = Myconnection.getConnection();
	DatabaseMetaData dbinfo = conn.getMetaData();
	System.out.println(dbinfo.storesUpperCaseQuotedIdentifiers());
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter table name");
	String tablename  = sc.next();
	
	Statement stmt = conn.createStatement();
	conn.setAutoCommit(false);
	ResultSet rs = stmt.executeQuery("select * from "+tablename);
	ResultSetMetaData rsmd = rs.getMetaData();
	int columncount = rsmd.getColumnCount();
	System.out.println("the result is ");
	
	while(rs.next())
	{
		for(int i =1;i<=columncount;i++)
		{
			System.out.println(rs.getString(i)+" ");
		}
		System.out.println();
	}
	conn.commit();
	conn.close();
}
}
