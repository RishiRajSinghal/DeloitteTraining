package Day6;

public class Arraydemo {
int []num= {1,2,3,4,5};
int marks[];

public void display()
{
	marks = new int[5];
	for (int i:num)
	{
		System.out.println(i);
	}
	num = new int[8]; //creates new array u can't resize an existing array
	System.out.println();
	for(int i:num)
	{
		System.out.println(i);
	}
}
public static void main(String[] args) {
	Arraydemo d = new Arraydemo();
	d.display();
	Arraydemo p[]=new Arraydemo[5]; //array of objects
	for(int i=0;i<p.length;i++)
	{
		p[i]= new Arraydemo();
		p[i].display();
	}
	
}
}
