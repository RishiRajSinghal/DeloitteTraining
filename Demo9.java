package Day7;
import java.io.File;
import java.io.IOException;
public class Demo9 {
public static void main(String[] args) throws IOException {
	File file = new File("c:\\data.txt");
	File file2 = new File("c:\\mydata");
	if(file.exists())
		
	{
		file.length();
		file.delete();
		System.out.println("file deleted");
	}
	else
	{
		boolean result = file2.mkdir();
		if(result)
		{
			System.out.println("file created inside mydata");
		file2.createNewFile();
		//file.createNewFile();
		System.out.println("file created");
	}
	}
}
}
