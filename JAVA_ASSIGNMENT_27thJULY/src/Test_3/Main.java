package Test_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("enter the number of elements which you want to pass in the array");
		int m=sc.nextInt();//m represents size of array
		
		int[] b = new int[m];
		
		System.out.println("start entering the numbers");
		for(int i=0;i<m;++i)
		b[i]=sc.nextInt();
		if(UserMainCode.checkTripplets(b))
		System.out.println("TRUE");
		else
		System.out.println("FALSE");
		sc.close();

}
}
