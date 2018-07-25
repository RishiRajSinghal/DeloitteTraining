package Day7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo10 {
public static void main(String[] args) throws IOException {
	
	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	//BufferedInputStream r1 = new BufferedInputStream(new FileInputStream(new File("c:\\Copy\\A.txt")));
	System.out.println("tell me ur name ");
	String name = r.readLine();
	
	System.out.println("tell me ur age");
	int age = Integer.parseInt(r.readLine());
	
	System.out.println("tell me ur address");
	String address = r.readLine();
	
	System.out.println("tell me ur quantity");
	int qty = Integer.parseInt(r.readLine());

	System.out.println("tell me ur price of one");
	int amt = Integer.parseInt(r.readLine());
	FileOutputStream fs = new FileOutputStream("myrecord.txt");
	BufferedOutputStream bs = new BufferedOutputStream(fs);
	DataOutputStream ds = new DataOutputStream(bs);
	//BufferedWriter w = new BufferedWriter(new FileWriter(new DataInputStream(new File("record.txt"))));
	
	ds.writeUTF(name); //uniform text format
	ds.writeInt(age);
	ds.writeUTF(address); 
	ds.writeInt(qty);
	ds.writeInt(amt);
	
	System.out.println(name +"your data is stored safely");
	ds.close();
	bs.close();
	fs.close();
	
	//System.out.println("your age is "+age);
	
}
}
