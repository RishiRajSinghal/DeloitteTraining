package day4;

public class Client {
	public static void main(String[] args) {
		

	Customer c= new Customer("rishi",8000);
	c.display();
	c.setBillamt(23000);
	c.display();
	int t = c.getBillamt();
	System.out.println(t);
	int r = input();
	System.out.println("value of result is "+r);
}

private static int input() {
	int a=0,b=0;
	int r = a+b;
	return r;
}
}
