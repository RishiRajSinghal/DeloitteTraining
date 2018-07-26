package Day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFile {
public static void main(String[] args) throws IOException {
	File f= new File("A.txt");
	RandomAccessFile ra = new RandomAccessFile(f,"rw");
	//append
	ra.seek(ra.length());
	System.out.println("file pointer before writing is at"+ra.getFilePointer());
	//writing
	ra.writeUTF("I am Rishi");
	System.out.println("file pointer after writing is at"+ra.getFilePointer());
	ra.seek(2);
	byte bytes[]=new byte[298];
	ra.read(bytes);
	ra.close();
	System.out.println(new String(bytes));
	/*System.out.println("file pointer now is at"+ra.getFilePointer());
	System.out.println("the contents of file is "
	
			);*/
	/*try
	{
	do
	{
		String n = ra.readUTF();
		System.out.println(n);
	}
	while(true);
	
}
	catch(Exception e){
		
	}*/
}
}
