package Day7;
//anonymous class
abstract class Fruit
{
	public abstract void setColor();
	
}
public class Demo12 {
public static void main(String[] args) {
	Fruit f = new Fruit() //anonymous class
			{
	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		System.out.println("apple color is red");
	}
			
		
			};
			f.setColor();
			
}
}
