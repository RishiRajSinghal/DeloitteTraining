package Day7;
class print
{
	public synchronized static void printsomething(String firstname, String lastname)
	{
		System.out.println("welcome "+firstname);
		System.out.println("bye "+lastname);
	}
}
public class Demo8 extends Thread{
private String firstname;
private String lastname;
	public Demo8(int i,String firstname, String lastname)
	{
		super(i+"");
		this.firstname=firstname;
		this.lastname = lastname;
		start();
	}
	@Override
	public void run() {
		print.printsomething(firstname,lastname);
	}
	public static void main(String[] args) {
		new Demo8(1, "tufail","ahmed");
		new Demo8(2, "raghav","tibdewal");
		new Demo8(3, "pooja","agarwal");
		new Demo8(4, "nidhi","bhatia");
	}
}
