package Day6;

import java.io.Serializable;

public class Customer implements Comparable <Customer>,Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 3582156630196852931L;
private int custid;
private String custname;
private int billamt;
private transient String address;

public Customer()
{
	
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + billamt;
	result = prime * result + custid;
	result = prime * result + ((custname == null) ? 0 : custname.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (billamt != other.billamt)
		return false;
	if (custid != other.custid)
		return false;
	if (custname == null) {
		if (other.custname != null)
			return false;
	} else if (!custname.equals(other.custname))
		return false;
	return true;
}

@Override
public String toString() {
	return "Customer [custid=" + custid + ", custname=" + custname + ", billamt=" + billamt + ", address=" + address
			+ "]";
}

public Customer(int custid, String custname, int billamt, String address) {
	super();
	this.custid = custid;
	this.custname = custname;
	this.billamt = billamt;
	this.address = address;
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

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public int compareTo(Customer o) {
	// TODO Auto-generated method stub
	//saorting on the basis of bill amt
	/*if(this.billamt>o.billamt)
	{
		return 1;
	}
	else
	{
	return -1;*/
	//sorting on the basis of name
	if(this.getCustname().compareTo(o.getCustname())>0)
	{
		return -1;
	}
	else
	{
		return 1;
}
}
}