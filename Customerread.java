package Day8;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Day6.Customer;

public class Customerread  {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	FileInputStream fs = new FileInputStream("customer.txt");
	BufferedInputStream bs = new BufferedInputStream(fs);
	ObjectInputStream ot =  new ObjectInputStream(bs);
	Customer c= (Customer) ot.readObject();
	System.out.println("your details are ");
	System.out.println(c);
	
}
}
