package Day8;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Day6.Customer;

public class Customermain  {
public static void main(String[] args) throws IOException {
	Customer c = new Customer(122,"Kritika",43687,"mumbai");
	//c.setAddress(null);
	FileOutputStream fs = new FileOutputStream("customer.txt");
	BufferedOutputStream bs = new BufferedOutputStream(fs);
	ObjectOutputStream ot =  new ObjectOutputStream(bs);
	ot.writeObject(c);
	ot.close();
	System.out.println(c.getCustname()+" your record saved");
}
}
