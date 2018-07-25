package Day6;
import java.util.*;
public class Iterators {
public static void main(String[] args) {
	//Set s = new TreeSet();
	List<Integer> s =new ArrayList<Integer>();
;
	s.add(1);

	s.add(2);
	s.add(3);
	s.add(4);
	s.add(5);
	System.out.println(s);
	s.remove(3);
	//s.remove(3);
	s.add(3, 12);
	Iterator i =s.iterator();//prints vertically (one after another)
	//s.add(3, 12);
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println("3rd");
	for(Integer ii:s)
	{
		System.out.println(ii);
	}
}
}
