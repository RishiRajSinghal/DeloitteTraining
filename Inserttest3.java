package Day9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Day9.connection.Myconnection;

public class Inserttest3 {
	public static void main(String[] args) throws SQLException {
		Connection conn = Myconnection.getConnection();
		
		conn.setAutoCommit(false);
	try {
		Scanner  sc =new Scanner(System.in);
			
			System.out.println("enter roll");
			int roll = sc.nextInt();
			
			System.out.println("enter name");
			String name = sc.next();
			
			PreparedStatement stmt = conn.prepareStatement("insert into balak values(?,?)");
			stmt.setInt(1, roll);
			stmt.setString(2, name);
			
			stmt.executeUpdate();
			System.out.println("first record inserted"); 
			
			System.out.println("insert values again");
			
			System.out.println("enter roll");
			int roll1 = sc.nextInt();
			
			System.out.println("enter name");
			String name1 = sc.next();
			
			PreparedStatement stmt1 = conn.prepareStatement("insert into balak values(?,?)");
			stmt1.setInt(1, roll1);
			stmt1.setString(2, name1);
			
			
			stmt1.executeUpdate();
			System.out.println("2nd record inserted");
			
			conn.commit();
			conn.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		conn.rollback();
	}
	}
	}

