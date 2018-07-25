package Day7;
//static inner class
class A
{
	 public static String password = "hello@rishi";
	 //private String password = "hello@rishi";
	
	static class changepassword
	 
	{
		int passwordchangeddays = 10;
	
	public void display()
	{
		System.out.println(passwordchangeddays);
		//System.out.println("original password is "+password);
		 //String password = "abc@23456";
		 /*//or write*/  String password = "abc@3455";
	}
	}

public void changepwd()
{
	changepassword p =new changepassword();
	p.display();
	System.out.println("change password "+ password);
	
}
}
public class B {
public static void main(String[] args) {
	A a = new A();
	a.changepwd();
	//A.changepassword f = a.new changepassword(); //before allocating memory to parent class we need to allocate memory to parent class
	A.changepassword f = new A.changepassword();
	f.display();
}
}
