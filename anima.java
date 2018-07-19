package day4;
class animaa {
public animaa()
{
	System.out.println("anima cons");
}

public void eat()
{
	System.out.println("animal eats food");
}
}


class men extends animaa
{
	public men()
	{
		System.out.println("men cons");
	}
	//overriding
	public void eat()

{
		System.out.println("man eats both veg and nonveg");
		super.eat();//to print details of parent class as well
}
	
}
class dog extends animaa
{
	public dog()
	{
		System.out.println("dog cons");
	}
	
	public void eat()
	{
		System.out.println("dog eats pedigree");
		super.eat();
	}
	public void drink()
	{
		System.out.println("dog drinks water");
	}

}

public class anima
{
	public static void main(String[] args)
	{
		animaa a = new men();
		a.eat();
		a= new dog();
		a.eat();
	}
}
