package src;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
private String Employeename;

//@Autowired
private Address address;


public Address getAddress() {
	return address;
}

public Employee(Address address) {
	super();
	System.out.println("address cons called");
	this.address = address;
}

public void setAddress(Address address) {
	System.out.println("set address called");
	this.address = address;
}

public String getEmployeename() {
	return Employeename;
}

public Employee()
{
	System.out.println("Employee default called");
	
}

public Employee(String employeename) {
	super();
	System.out.println("employee constructor called");
	this.Employeename = employeename;
}

public Employee(String employeename, Address address) {
	super();
	System.out.println("both constructor called");
	this.Employeename = employeename;
	this.address = address;
}

public void setEmployeename(String employeename) {
	System.out.println("set name called");
	this.Employeename = employeename;
}

@Override
public String toString() {
	return "Employee [Employeename=" + Employeename + ", address=" + address + "]";
}

}
