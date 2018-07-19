package day4;
class A 
{
	private A()
	{
		System.out.println("in private A");
	}
	public static String dd()
	{
		A x = new A();
		return "new password";
	}
}
class B 
{
	public B()
	{
		System.out.println("in default B");
	}
	void display()
	{
		System.out.println("B display");
	}
}
class C extends B
{
	public C()
	{
		System.out.println("in default C");
	}
	void display()
	{
		System.out.println("C display");
	}
}
public class Privateconstructor
{
	public static void main(String[] args) {
		System.out.println(A.dd());
		B v = new B();
		v.display();
		B v1 = new C();
		v1.display();
	}
}
