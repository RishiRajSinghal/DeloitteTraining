package Day7;
//threads overhead is the thing which will get printed first
public class Demo3 extends Thread {
Thread t1; //t1 is conceived
public Demo3()
{
	t1=new Thread(this); //allocating memory(5th month) //executed by main thread
	t1.setName("score"); //renaming sleep thread
	t1.start(); //born //executed by main thread
	System.out.println("t1d  satrted"); //printed by main thread
}
public void run()
{
	for(int i=0;i<=3;i++)
	{
		System.out.println("run called: "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//System.out.println("run called: "+Thread.currentThread().getName());
	System.out.println("run called afgain");
}
public static void main(String[] args) throws InterruptedException  {
	Thread m = Thread.currentThread();
	m.setName("deloitte"); //renaming main thread
	System.out.println("wait for 1 second");
	m.sleep(1000);
	System.out.println("wait for 3 seocnds");
	Thread.sleep(3000);
	Demo3 d = new Demo3();
	System.out.println("hello i m in main: "+Thread.currentThread().getName());
	System.out.println("main again");
}
}
