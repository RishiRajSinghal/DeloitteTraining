package Test_1;

import java.util.Scanner;

public class Calculator {

	public Calculator() {
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		System.out.println("enter choice ");/*enter the required choice according to which you want to do the calculation */
		System.out.println("1.add 2.sub 3.mul 4.div");
		choice = sc.nextInt();

		Arithmetic[] arth = { new Addition(0, 0, 0), new Subtraction(0, 0, 0), new Multiply(0, 0, 0),
				new Division(0, 0, 0) };

		arth[choice - 1].read();/* calls read function of Arithmetic class and sets the values of num1 and num2*/
		
		try {
			arth[choice - 1].calculate();
			arth[choice - 1].display();
		}
		catch(ArithmeticException e){
			System.out.println("cannot divide by zero"); /* handles exception in case user enters second number as 0 while division*/
			
		}
		finally {
			sc.close();
		}

	}

	public static void main(String[] args) {

		new Calculator();

	}

}