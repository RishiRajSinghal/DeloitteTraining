package Day6;
import java.util.*;
public class Raaa {
public static void main(String[] args) {
	String str[]= {"ramu","raja","rishi","yamini"};
	List<String> list = Arrays.asList(str);
	System.out.println(list);
	List<String> pp  = new ArrayList(); //copying all contents to new list
	System.out.println(pp);
	pp.addAll(list);
	pp.add(3, "shivam");
	System.out.println(pp);
	}
}
