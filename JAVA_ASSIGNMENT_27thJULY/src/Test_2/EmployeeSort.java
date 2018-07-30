package Test_2;

import java.util.Comparator;

public class EmployeeSort implements Comparator<EmployeeVo> {
	@Override
	public int compare(EmployeeVo o1, EmployeeVo o2) 
	{	
		if(o1.getIncometax()>(o2.getIncometax()))
		{
			return -1;  // it arranges the output in descending order
		}
		else
		{
			return 1; //it arranges the output in ascending order
		}
		
}	
}
