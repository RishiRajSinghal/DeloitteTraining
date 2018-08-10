package src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
public static void main(String[] args) {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
	
	Employee employee = context.getBean(Employee.class);
	Address address= context.getBean(Address.class);
	employee.setEmployeename("rishi");
	address.setId(25);
	address.setCity("sambalpur");
	address.setState("odisha");
	employee.setAddress(address);
	System.out.println(employee);
	Employee employee1 = context.getBean(Employee.class);
	Address address1= context.getBean(Address.class);
	employee1.setEmployeename("ranjan");
	address1.setId(45);
	address1.setCity("bangalore");
	address1.setState("karnataka");
	employee1.setAddress(address1);
	
	 
	 System.out.println(employee1);
}
}
