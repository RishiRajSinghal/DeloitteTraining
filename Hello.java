import deloitte.Raja;

public class Hello {

	public void display()
	{
		for(int i =1;i<=3;i++)
		{
			System.out.println("class 1"+ i);
			if(i==2)
				//break;
				continue;
			
			System.out.println("class 2"+ i);
		}
	}
	public void disp(int p, int m)
	{
		System.out.println("adding two numbers"+(p+m));
	}
	public void disp()
	{
		System.out.println("no addition");
	}
	public void disp(int...num)
	{
		for(int i:num)
			System.out.println(i);
	}

public static void main(String[] args) {
	
	System.out.println("hello and welcome to ide");
	Hello h = new Hello();
	h.display();
	h.disp();
	h.disp(8, 9);
	h.disp(1,7,2,3,4,5);
	deloitte.Raja r = new Raja();
	r.addnos(4, 5);
	r.addnos(1, 2);
	r.addnos(4, 5);
	r.addnos(8, 9);
}
}
