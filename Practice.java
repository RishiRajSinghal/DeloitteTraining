
public class Practice {
int empid;
int p =0;
public void change()
{
	empid = 1909;
}
public void display()
{
	int h =0; //local variable initialization is compulsory by user if he has to use it//
	System.out.println(p+h);
}
public void change2()
{
	empid++;
}
public static void main(String[] args) {
	Practice p1 = new Practice();
	Practice p2 = new Practice();
	//separate references for objects p1 and p2 are created//
	// so separate values are stored and outputs are generated accordingly
	p1.change2();
	System.out.println(p1.empid);
System.out.println(p2.empid);
Practice p3 = new Practice();
p3.display();
	}
}

