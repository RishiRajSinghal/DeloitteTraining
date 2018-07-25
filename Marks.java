package Day6;

public class Marks {
public void display()
{
	String x="90";
	int num= Integer.parseInt(x); //object to primitive
	//int num = i;
	
	/*char c='6';
	int m = c;*/
	
	Integer p =190;
	//object-primitive
	int g= new Integer(p); //unboxing
	
	
	int q=p; //auto unboxing
	
	//primitive to object
	
	Integer qq= p; //autoboxing
	Integer rr= new Integer(p);//boxing
}
}
