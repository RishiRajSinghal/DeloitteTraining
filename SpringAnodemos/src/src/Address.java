package src;

public class Address {
private int id;
private String city;
private String state;
public Address()
{
	System.out.println("default address called");
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	System.out.println("set city called");
	this.city = city;
}


public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}


public Address(int id, String city, String state) {
	super();
	this.id = id;
	this.city = city;
	this.state = state;
}
@Override
public String toString() {
	return "Address [id=" + id + ", city=" + city + ", state=" + state + "]";
}

}
