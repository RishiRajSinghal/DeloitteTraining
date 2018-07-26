package Day9;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Day9.connection.Myconnection;

public class Inserttest2 {
public static void main(String[] args) throws SQLException {
	Connection conn = Myconnection.getConnection();
	
Scanner  sc =new Scanner(System.in);
	
	System.out.println("enter roll");
	int roll = sc.nextInt();
	
	System.out.println("enter name");
	String name = sc.next();
	
	PreparedStatement stmt = conn.prepareStatement("insert into balak values(?,?)");
	stmt.setInt(1, roll);
	stmt.setString(2, name);
	stmt.executeUpdate();
	conn.close();
}
}
