package Day7;

public class Demo5 {
public static void main(String[] args) {
	System.out.println("mains called by "+Thread.currentThread().getName());
	Thread t1= new Thread()
			{
		public void run() {
			for(int i=0;i<=9;i++)
			{
				//t1.setName(i);
			System.out.println("run called by "+Thread.currentThread().getName());
		}
		}
		};
		t1.start();
			}
}
