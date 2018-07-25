package Day7;

//printing data of any datatype or multiple data type together
import java.util.*;
public class Demo1<Z> {
public void display(Z name)
{
	System.out.println(name);
}
public static void main(String[] args) {
	Demo1<Integer>d = new Demo1<Integer>();
	d.display(123);
	Demo1<String> d1 = new Demo1<String>();
	d1.display("rishi");
}
}
