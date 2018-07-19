package day4;

import java.util.Scanner;



public class Usingdata implements PhysicalConstants {
public double energy()
{
	System.out.println("calculating energy");
	double e;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter mass");
	double m = sc.nextDouble();
	return (m*Math.pow(c,2));
}
public double force()
{
	System.out.println("calculating gravitational force");
	Scanner sc1 = new Scanner(System.in);
	System.out.println("enter mass 1");
	double m1 = sc1.nextDouble();
	Scanner sc2 = new Scanner(System.in);
	System.out.println("enter mass 2");
	double m2 = sc2.nextDouble();
	Scanner sc3 = new Scanner(System.in);
	System.out.println("enter distance");
	double r = sc3.nextDouble();
	return (G*m1*m2)/(Math.pow(r, 2));
}
public double distance()
{
	System.out.println("calculating distance");
	Scanner sc4 = new Scanner(System.in);
	System.out.println("enter time");
	double t = sc4.nextDouble();
	return (0.5*g*t);
}
public static void main(String[] args) {
	Usingdata d = new Usingdata();
	double t1 = d.energy();
	System.out.println("energy is "+t1);
	double t2 = d.force();
	System.out.println("gravitational force is "+t2);
	double t3 = d.distance();
	System.out.println("distance is "+t3);
}
}
