import java.util.Scanner;

public class assignment {
	
	double temp;
	public assignment()
	{
		this.temp=0.0;
	}
	public double print_temp(int ch)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the temperature");
		double temp = sc1.nextDouble();
		if (ch==1)
		{
			temp = temp;
			System.out.println("u have entered the temperature in celsius");
			System.out.println("temperature is "+ temp);
			
		}
		if(ch==0) 
		{
			System.out.println("u have entered in farhenheit so we need to convert it into celsius");
			temp =(5*(temp-32))/19;
			System.out.println("temperature is "+ temp);
			
		}
		return temp;
	}
	public void check(int choice)
	{
		double t =print_temp(choice);
		if(t > 60.0 || t < -10.0)
		{
			System.out.println("temperature is not in tolerable range please warn the people of this country");
		}
		else
		{
			System.out.println("temperature is tolerable people of this country are safe");
		}
	}
	
		public static void main(String[] args) {
			
			
			int choice; 
			for(;;)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the choice : 0 if u want to enter in farhenheit and 1 if u want to enter in celsius");
				choice= sc.nextInt();
				if(choice==1 || choice==0)
					break;
				else
					System.out.println("enter choice either 1 or 0");
			}
			assignment a = new assignment();
			a.check(choice);	
		}
}
