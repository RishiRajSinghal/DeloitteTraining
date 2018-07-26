package Day9;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

import Day9.connection.Myconnection;

public class JDBCCreatetest {
public static void main(String[] args) throws SQLException {
	Connection conn = Myconnection.getConnection();
	Statement stmt = conn.createStatement();
	stmt.execute("create table balak(roll number,sname varchar(20))");
	System.out.println("table created");
	//stmt.executeQuery("insert into balak values (1,'raja')");
	
}
}
