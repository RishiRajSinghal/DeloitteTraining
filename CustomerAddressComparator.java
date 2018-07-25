package Day6;

import java.util.Comparator;

public class CustomerAddressComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		
		//sorting on the basis of address
		if(o1.getAddress().compareTo(o2.getAddress())>0)
		{
			return -1;
		}
		else
		{
			return 1;
	}
	}

}
