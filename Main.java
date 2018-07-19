package day4;

abstract class vehicle
{
	int price;
	public vehicle()
	{
		System.out.println("vehicle cons");
	}
	public abstract void start();
	public abstract void stop();
public void music()
{
	System.out.println("has music player");
}
}

class car extends vehicle
{
	public car()
	{
		System.out.println("car cons");
	}
	@Override
	public void start() {
		int price = 9200000;
		System.out.println("car started");
		System.out.println(this.price);
		System.out.println(price);
		
	}
	@Override
	public void stop() {
		System.out.println("car stopped");
		
	}
	public void stearing()
	{
		System.out.println("replace stearing");
	}
}
public class Main {
public static void main(String[] args) {
	vehicle v = new car();
	v.music();
	v.start();
	v.stop();
	//v.stearing gives error on writing u get 2 quick fixes use 2nd one
	((car) v).stearing();
}
}