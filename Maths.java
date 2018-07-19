package day4;
class Animal {
int age=100;
public Animal()
{
	System.out.println("animal cons"+" " +age);
}
 }
 class Meen extends Animal
{
	 int age=90;
	int salary;
	public Meen()
	{
		age = 98; //try writing int age = 98; (both will give different outputs)
		System.out.println("men cons"+" " +age);
		System.out.println("men cons1"+" "+this.age);
		System.out.println("men cons2"+" " +super.age);
	}
}
 
  public class Maths {
	
	public static void main(String[] args) {
		Meen m = new Meen();
	}
}


