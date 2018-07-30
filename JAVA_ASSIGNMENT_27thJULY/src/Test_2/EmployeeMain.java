package Test_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain
{
public static void main(String[] args) {
	
	List<EmployeeVo> evo = new ArrayList<EmployeeVo>(); /* an arraylist to store all values o data members of class EmployeeVo*/
		

	int Noe ; //stores number of employees
	int empid;//stores employee id
	String empName;//stores employee name
	double annualincome;//stores annual income of employee
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter No. of Employees : ");
	Noe= sc.nextInt();
	
	for(int i=1;i<=Noe;i++) 
	{
		System.out.println("Enter EmpID :");
	 empid=sc.nextInt();
	
	System.out.println("Enter Employee Name : ");
	empName = sc.next();
	
	System.out.println("Enter Annual Income of :");
	annualincome = sc.nextDouble();
	
	EmployeeVo e = new EmployeeVo(empid, empName, annualincome);
	EmployeeBo ebo = new EmployeeBo();
	ebo.calincomeTax(e); //calls calincomeTax function of EmployeeBo class which calculates incometax on basis of annual income
	evo.add(e);
	
	}
	
	System.out.println("before sorting the values are :");
	
	for(EmployeeVo e:evo)
	{
		System.out.println(e);
	}
	
	
	System.out.println();
	System.out.println();
	System.out.println();
	
	Collections.sort(evo,new EmployeeSort());//sorts the data in descending order of annual income
	
	System.out.println("after sorting the values are :");
	for(int j=0;j<evo.size();j++)
	{
		System.out.println(evo.get(j));
	}
		
	
	
}
}