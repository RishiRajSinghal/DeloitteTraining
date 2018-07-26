package Day9;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbc {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");//load driver
	System.out.println("driver loaded");
	//define and establish connection
	Connection conn = 
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
	System.out.println("connected");
	//create statement
	Statement stat = conn.createStatement();
	//executing query
	ResultSet rs =  stat.executeQuery("select * from student where sname like '%s%'");
	System.out.println("the result is ");
	 while(rs.next())
	 {
		 System.out.print(rs.getString(1) +" ");
		 System.out.println(rs.getString(2));
		 System.out.println(rs.getString(3));
		 System.out.println(rs.getString(4));
	 }
	conn.close();
}
}
