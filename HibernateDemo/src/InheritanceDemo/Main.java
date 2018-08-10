package InheritanceDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
		 public static void main(String[] args) {
				//load hibernate connection
				Configuration configuration = new Configuration().configure("InheritanceDemo/hello.cfg.xml");
				
				//create a sessionfactory
				SessionFactory factory = configuration.buildSessionFactory();
				
				//open session
				Session session = factory.openSession();
				
				Transaction transaction = session.beginTransaction();
		
					RegularEmployee employee= new RegularEmployee();
					employee.setEmployeeId(125);
					employee.setEmployeeName("ritu");
					employee.setRegulareEmployeeBonus(50000);
					employee.setRegulareEmployeeSalary(100000);
					session.save(employee);
					
				transaction.commit();
				session.close();
				factory.close();
		}
}
