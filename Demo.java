package Day7;
//MAPS
import java.security.KeyStore.Entry;
import java.util.*;
public class Demo {
public static void main(String[] args) {
	TreeMap<String,Double> tm= new TreeMap<String,Double>(); //creating a treemap
	tm.put("rishi", new Double(456321.32));
	tm.put("raja", new Double(56321.32));
	tm.put("ishita", new Double(45000.82));
	tm.put("ishaani", new Double(45632.85));
	tm.put("aruhi", new Double(45000.82));
	
	Set<java.util.Map.Entry<String, Double>> s = tm.entrySet(); //converts map to set
	Iterator i = s.iterator();
	while(i.hasNext())
	{
		Map.Entry me = (Map.Entry)i.next(); //used because we r having 2 values primary key and value
		System.out.println(me.getKey()+":");
		System.out.println(me.getValue());
	}
	System.out.println();
	double balance = ((Double)tm.get("rishi")).doubleValue();
	tm.put("rishi", new Double (balance+1000));
	System.out.println("rishi's new balance :"+tm.get("rishi"));
	 
}
}
