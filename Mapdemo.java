package Day7;
import java.util.*;
import java.util.Map;
import java.util.TreeMap;


public class Mapdemo {
public static void main(String[] args) {
	//Map<String,Integer> map = new TreeMap<String,Integer>();
	//Map<String,Integer> map = new HashMap<String,Integer>();
	Map<String,Integer> map = new LinkedHashMap<String,Integer>();
	map.put("arun", 48000);
	map.put("aruna", 58000);
	map.put("arun", 45000);
	map.put("aruna", 49000);
	map.put("ajay", 56300);
	map.put("rishi", 9000);
	System.out.println(map);
}
}
