
public class Employee {
		int empid = 100;
	public void getdetails()
	{
		System.out.println("employee details");
	}
	class project
	{
		public void dowork()
		{
			Employee ee = new Employee();
			ee.empid = 100;
			System.out.println(ee.empid);
		}
	}
	class manager extends Employee
	{
		public void x()
		{
			System.out.println(empid+200);
		}
	}
	public static void main(String[] args) {
		
		System.out.println("hello and welcome to ide");
		//Employee e = new project();
		//e.dowork();
		///h.m();
	}



	}
