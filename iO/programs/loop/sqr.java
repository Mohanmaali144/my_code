import java.io.*;
import java.util.Scanner;

class Square
{
	public static void sqr()throws IOException
	{	
		File fob = new File("sqr.txt");
		FileOutputStream fos = new FileOutputStream(fob);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:  ");
		int n = sc.nextInt();
		int i=1;
		int sqr=0;
		while(i<=n)
		{		 
			sqr = i*i;		 
			String s1 = Integer.toString(sqr);
			byte arr[]= s1.getBytes();
			fos.write(arr);
			fos.write(32);
			i++;
		}	
		fos.close();		
	}
}

class Main {
	
	public static void main(String[]arg)throws IOException
	{
		Square ob = new Square();
		ob.sqr();
	}
}