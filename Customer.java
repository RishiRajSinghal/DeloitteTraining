package day4;


public class Customer {
private int custid;
private String custname;
private int billamt;
private boolean billpaid;

public Customer()
{
	custid=1000;
	custname  = "NA";
	billamt= 200;
}

public Customer(int custid, String custname, int billamt) {
	
	this.custid = custid;
	this.custname = custname;
	this.billamt = billamt;
}

public int getCustid() {
	return custid;
}

public void setCustid(int custid) {
	this.custid = custid;
}

public String getCustname() {
	return custname;
}

public void setCustname(String custname) {
	this.custname = custname;
}

public int getBillamt() {
	return billamt;
}

public void setBillamt(int billamt) {
	this.billamt = billamt;
}

public boolean isBillpaid() { //note while generating getter for boolean it takes "isbillpaid"//
	return billpaid;
}

public void setBillpaid(boolean billpaid) {
	this.billpaid = billpaid;
}

public Customer(boolean billpaid) {
	super();
	this.setBillpaid(billpaid);
}

public Customer(String custname, int billamt) {
	this();                
	this.custname = custname;
	this.billamt = billamt;
}

public Customer(int custid, int billamt) {
	this();
	this.custid = custid;
	this.billamt = billamt;
}

public Customer(int custid, String custname) {
	
	this();
	this.custid = custid;
	this.custname = custname;
}

/*public Customer(String custname, int custid) {
	super();
	this.custname = custname;
	this.custid = custid;
}
*/
public void display()
{
	System.out.println("customer details");
	System.out.println("customer id is"+custid);
	System.out.println("customer name is "+custname);
	System.out.println("bill is "+billamt);
}


}
