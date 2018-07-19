
public class Count {
 static int counter = 0;
public Count()
{
	counter++;
}
public static void main(String[] args) {
	Count s1 = new Count();
	Count s2 = new Count();
	Count s3 = new Count();
	Count s4 = new Count();
	Count s5 = new Count();
	System.out.println(Count.counter);
}
}
