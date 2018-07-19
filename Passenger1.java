package day4;

public class Passenger1 {
	public static void main(String[] args) {
		Passenger p1 = new Passenger(192,"radhika",254);
		Passenger p2 = new Passenger(192,"radhika",254);
		//Passenger p3=p1;
				System.out.println(p1.equals(p2));
				System.out.println(p1);
				System.out.println(p2);
	}
}
