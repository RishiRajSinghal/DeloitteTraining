package Day7;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//reading from file
public class Demo10again {
public static void main(String[] args) throws IOException {
	String n,m; int p=0;
	int q=0;
	int y=0;
	
	@SuppressWarnings("resource")
	DataInputStream stream = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("myrecord.txt"))));
	n=stream.readUTF();
	p=stream.readInt();
	m=stream.readUTF();
	q=stream.readInt();
	y=stream.readInt();
	
	System.out.println( n +" your total bill is "+ (q*y));
}
}
