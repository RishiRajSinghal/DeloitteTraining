package Day8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

class PrintStreamtest {
	 public static void main(String[] args) throws FileNotFoundException {
		 //FileOutputStream fout = new FileOutputStream("mfile.txt");
		 FileOutputStream fout = new FileOutputStream("C:\\Copy\\A.txt");
		//PrintStream pout = new PrintStream(System.out); //displays output on screen
		 PrintStream pout = new PrintStream(fout); //creates a file and adds data into it
		pout.println(1996);
		pout.println("hello rishi");
		pout.println("welcome to your family");
		pout.close();
	}

}
