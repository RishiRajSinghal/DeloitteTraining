package com.javatraining.deloitte.assessment;

abstract class Shape { //creation of abstract class
	
	//abstract methods
public abstract double area(double a, double b,double c);
public abstract double volume(double d, double e, double f);

}

//class cube which overrides methods of class Shape by inheriting it
class Cube extends Shape
{

	@Override
	public double area(double a, double b,double c) { //calculating area of cube
		// TODO Auto-generated method stub
		
		double area = 2*((a*b)+(b*c)+(c*a));
		return area;
	}

	@Override
	public double volume(double d, double e, double f) { //calculating volume of cube
		// TODO Auto-generated method stub
		double volume = (d*e*f);
		return volume;
	}
	
}

//class rectangle which overrides methods of class Shape by inheriting it
class Rectangle extends Shape
{

	@Override
	public double area(double a, double b,double c) { //calculating area of rectangle
		// TODO Auto-generated method stub
		double area= a*b;
		return area;
	}

	@Override
	public double volume(double d, double e, double f) { //calculating volume of rectangle
		// TODO Auto-generated method stub
		return -1;
	}
	
}

//class triangle which overrides methods of class Shape by inheriting it
class Triangle extends Shape{

	@Override
	public double area(double a, double b,double c) { //calculating area of triangle
		// TODO Auto-generated method stub
		double area  = 0.5*a*b;
		return area;
	}

	@Override
	public double volume(double d, double e, double f) {  //calculating volume of triangle
		// TODO Auto-generated method stub
		return -1;
	}
	
}


//class Sphere which overrides methods of class Shape by inheriting it
class Sphere extends Shape
{

	@Override
	public double area(double a, double b,double c) {  //calculating area of sphere
		// TODO Auto-generated method stub
		double area = 4*Math.PI*Math.pow(a, 2);
		return area;
	}

	@Override
	public double volume(double d, double e, double f) {  //calculating volume of sphere
		// TODO Auto-generated method stub
		double volume = (4*Math.PI*Math.pow(d, 3))/3;
		return volume;
	}
	
}
public class Main {
	public static void main(String[] args) {
		Cube c= new Cube(); //creating object 'c' of class cube 
		Rectangle r = new Rectangle(); //creating object 'r' of class rectangle
		Triangle t = new Triangle(); //creating object 't' of class triangle
		Sphere s = new Sphere();  //creating object 's' of class sphere
		
		/*calling the functions of above classes using their respective objects and 
		calculating the area and volume of respective shapes*/
		
		System.out.println("area of cube is "+c.area(1, 2, 3));
		System.out.println("volume of cube is "+c.volume(1, 2, 3));
		System.out.println("area of rectangle is "+r.area(1, 2, 0));
		System.out.println("volume of rectangle is "+r.volume(1, 2, 0));
		System.out.println("area of triangle is "+t.area(1, 2, 0));
		System.out.println("volume of triangle is "+t.volume(1, 2, 0));
		System.out.println("area of sphere is "+s.area(1, 0,0));
		System.out.println("volume of sphere is "+s.volume(1, 0,0));
	}

}
