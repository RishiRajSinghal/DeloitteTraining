package Day6;
import java.util.*;
public class Customermain {
public static void main(String[] args) {
	List<Customer> allcustomers = new ArrayList<Customer>();
	Customer c1= new Customer(10,"uma",75000,"pune");
	allcustomers.add(c1);
	allcustomers.add(new Customer(11,"anu",45678,"bangalore"));
	allcustomers.add(new Customer(12,"anuradha",49078,"bangalore"));
	allcustomers.add(new Customer(13,"anil",85000,"hyderabad"));
	allcustomers.add(new Customer(14,"nike",55000,"mumbai"));
	System.out.println("printing all customers");
	;;;;;
	for(Customer c:allcustomers)
	{
		System.out.println(c);
	}
	Collections.sort(allcustomers); //calls compare to method
	System.out.println("after sorting - printing all customer records");
	for(Customer c:allcustomers)
	{
		System.out.println(c);
	}
	Collections.sort(allcustomers,new CustomerAddressComparator());
	
	System.out.println("after sorting - via comparator");
	for(Customer c:allcustomers)
	{
		System.out.println(c);
	}
}
}
