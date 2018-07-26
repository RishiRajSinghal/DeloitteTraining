package Day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.omg.CORBA.Object;

public class Demo {
public static void main(String[] args) throws IOException {
	//PropertieEnumeration<E>m.getProperties();
	/*Properties p = System.getProperties();
	Enumeration<java.lang.Object> e=p.elements();*/
	/*while(e.hasMoreElements())
	{
		//System.out.println("value is : "+e.nextElement());
	}*/
	InputStream s = new FileInputStream("C:\\mydata\\config.properties");
	Properties p1 = new Properties();
	p1.load(s);
	/*System.out.println("your username is "+ p1.getProperty("username"));
	System.out.println("your password is "+p1.getProperty("password"));*/
	String username = p1.getProperty("Username");
	String password = p1.getProperty("Password");
	
	System.out.println("username is "+username);
	System.out.println("password is "+password);
	s.close();
	
}
}
