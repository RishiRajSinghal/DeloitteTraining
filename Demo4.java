package Day7;

public class Demo4 extends Thread{
	public Demo4(int i)
	{
		//this will call and create a thread with a name i
		super(i+""); //allocate name to thread name ranges from 1-5 only else it can be anything
		start();
	}
	public void run()
	{
		System.out.println("run called by :"+currentThread().getName());
	}
public static void main(String[] args) {
	for(int i =1;i<=5;i++)
	{
		new Demo4(i);
	}
}
}
