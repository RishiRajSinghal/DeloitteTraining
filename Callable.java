package Day9;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import Day9.connection.Myconnection;

public class Callable {
public static void main(String[] args) throws SQLException {
	Connection conn = Myconnection.getConnection();
	CallableStatement stmt = conn.prepareCall("{call firstp(?,?)}");
	stmt.setInt(1,340);
	stmt.setString(2, "animesh");
	stmt.execute();
	conn.close();
	
	
}
}
