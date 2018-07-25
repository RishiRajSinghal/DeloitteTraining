package Day6;

public class Names {

	public void display()
	{
		String name= "anu";
		name = "rishi";//earlier anu goes to garbage
		//System.out.println(name);
		String name2 = "anu"; //might point to earlier anu or create a new one
		String name3=/* new String*/"anu";
		String name4= new String ("anu");
		System.out.println(name.equals(name2));
		System.out.println(name==name2);
		System.out.println(name2.equals(name3));
		System.out.println(name2==name3); //checks address or location where that is stored
		System.out.println(name2.equals(name4));
		System.out.println(name2==name4);
		String naam = "Anu";
		System.out.println(naam.concat("sharma"));
		System.out.println(naam.concat("singhal"));
		name.concat("Agarwal")
		;
		String name5 = naam.concat("mendon");
		//String name5 = name;
		System.out.println(name5);
		System.out.println("full name is "+naam);
		System.out.println(name+"Agarwala");
		char c[]= {'r','t','y','u','p'};
		String raa = new String(c,2,2);
		String nn = new String (c); //converting character array to string
		char[] xx = nn.toCharArray(); //converting string to character array
		System.out.println(raa);
		System.out.println(c);
		System.out.println(xx);
		String x ="sharmamarriedsharma";
		int i,y,p;
		i=(x.length());
		y=(x.lastIndexOf('a'));
		System.out.println(x.lastIndexOf('a',11));
	p=	(x.indexOf('a'));
	System.out.println(x.lastIndexOf('a',p));
	StringBuffer b =new StringBuffer("PK");
	b.append("hai kya123546546");
	System.out.println(b);
	System.out.println(b.length());
	System.out.println(b.capacity());
	
	}
	public static void main(String[] args) {
		Names n = new Names();
		n.display();
	}
}
