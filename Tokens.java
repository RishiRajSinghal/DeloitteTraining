package Day8;

import java.util.Calendar;
import java.util.Date;
//import java.sql.Date;
import java.util.Random;
import java.util.StringTokenizer;

public class Tokens {
public static void main(String[] args) {
	String value= "Sachit some times you see this side also";
	StringTokenizer t=new StringTokenizer(value, "i");
	System.out.println(t.countTokens());
	Random r = new Random();
	int Low = 10;
	int High = 20;
	//r.nextInt()
	int Result = r.nextInt(Low)+(High-Low);
	 
	System.out.println(Result);
	Date d = new Date(1000*60);
	
	//Date d1= new Date("04-03-2018");//depreciated date
	//Date d2= new Date("09-09-2009");
	System.out.println(d);
	
	Calendar c = Calendar.getInstance();
	System.out.println("the current date is :"+c.getTime());
	
	//c.setf
}
}
