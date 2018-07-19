package day4;

public class Passenger {
private int pnrnumber;
private String passengername;
private int fare;


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + fare;
	result = prime * result + ((passengername == null) ? 0 : passengername.hashCode());
	result = prime * result + pnrnumber;
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
	Passenger other = (Passenger) obj;
	if (fare != other.fare)
		return false;
	if (passengername == null) {
		if (other.passengername != null)
			return false;
	} else if (!passengername.equals(other.passengername))
		return false;
	if (pnrnumber != other.pnrnumber)
		return false;
	return true;
}
public int getPnrnumber() {
	return pnrnumber;
}
public void setPnrnumber(int pnrnumber) {
	this.pnrnumber = pnrnumber;
}
public String getPassengername() {
	return passengername;
}
public void setPassengername(String passengername) {
	this.passengername = passengername;
}
public int getFare() {
	return fare;
}
public void setFare(int fare) {
	this.fare = fare;
}
public Passenger(int pnrnumber, String passengername, int fare) {
	super();
	this.pnrnumber = pnrnumber;
	this.passengername = passengername;
	this.fare = fare;
}
@Override
public String toString() {
	return "Passenger [pnrnumber=" + pnrnumber + ", passengername=" + passengername + ", fare=" + fare + "]";
}

}
