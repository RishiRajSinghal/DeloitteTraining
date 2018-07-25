package Day7;

public class Demo7 extends Thread {
public void run()
{
	System.out.println("run called by "+currentThread().getName());
}
public static void main(String[] args) {
	Demo7 d=  new Demo7();
	System.out.println("main called by "+currentThread().getName());
	d.setName("mythread");
	d.start();
}
}
