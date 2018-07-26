package Day9;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Day9.connection.Myconnection;

public class Batch {
public static void main(String[] args) throws SQLException {
	Connection conn = Myconnection.getConnection();
	conn.setAutoCommit(false);
	Statement stmt = conn.createStatement();
	stmt.addBatch("insert into balak values(125,'radika')");
	stmt.addBatch("insert into balak values(126,'akshay')");
	stmt.addBatch("insert into balak values(127,'ankit')");
	
	int[] count = stmt.executeBatch();
	conn.commit();
	conn.close();
	for (int i = 0; i < count.length; i++) {
		System.out.println("no of records entered = "+i );
	}
	
}
}
