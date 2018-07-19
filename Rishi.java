

public class Rishi {
public static void main(String[] args) {

	//1)short circuit operator
	int i,j;
	i=0;
	j=2;
	boolean b = (i>j)||(j-->i);
	System.out.println(j);
	boolean b1 = (i>j)|(j-->i);
	System.out.println(j);
	boolean b2 = (i>j)&&(j-->i);
	System.out.println(j);
	boolean b3 = (i>j)&(j-->i);
	System.out.println(j);
	//2)give the output//
	int num1=39;
	int num2 = 98;
	num1=num2++;
	num2--;
	System.out.println(--num1);
	System.out.println(num2++);
System.out.println(num1+num2);
	
	
}
}
