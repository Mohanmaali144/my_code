import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		File fobj = new File("primefile.txt");
		
		FileOutputStream fos = new FileOutputStream(fobj);
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a num");  
		  int n = sc.nextInt();
		  int i,j;
		  for(j=2; j<=n; j++)
		  { 
			 for(i=2; i<j; i++)
			{
			  if(j%i==0)
			  { 
				 break;
			  }
			}
			  if(i==j)
			  {
				String s=Integer.toString(j);
				byte arr[]= s.getBytes();
			  fos.write(arr);
			  fos.write(32);
			  fos.flush();
			  }
		  } 
		  fos.close();
	}
}