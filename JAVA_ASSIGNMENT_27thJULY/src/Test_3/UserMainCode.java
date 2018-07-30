package Test_3;

public class UserMainCode {
	static boolean checkTripplets(int[] b)
 	{
 	
 	int i=0;
       int m =b.length;
       for(i=0;i<m;++i)
       {
       	if(i==(m-2))
       	break;
       	if((b[i]==b[i+1])&&(b[i]==b[i+2]))
       	return true;
       	
       }
 	return false;
 	}
}
