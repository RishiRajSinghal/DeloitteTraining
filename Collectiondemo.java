package Day6;
import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class Collectiondemo {
public static void main(String[] args) {
	//Set s = new TreeSet();//arranges in ascending order and removes duplicates
	//List s = new ArrayList();
	List s =new LinkedList();
	s.add("Neha");
	s.add("arun");
	s.add("rishi");
	s.add("aruna");
	s.add("arun");
	s.add("arundhati");
	s.add(122);
	s.add(true);
	System.out.println(s);
	
	Iterator i =s.iterator();
	
}
}
