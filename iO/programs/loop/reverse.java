import java.io.*;
import java.util.Scanner;
class Reverse{

	public void reverse()throws IOException
	{
		File fobj = new File("riverse.txt");
		FileOutputStream fos = new FileOutputStream(fobj);
		Scanner sc = new Scanner(System.in);
		int rev=0;
		System.out.println("Enter a number");
		int n= sc.nextInt();
		for( int i=0;n>0;i++)
		{
		   int r=n%10;
		   rev=rev*10+r;
		   n=n/10;
		}
		String s = Integer.toString(rev);
		byte arr[]=s.getBytes();
		fos.write(arr);
		fos.close();
	}
}
class Main {
	
	public static void main(String []args) throws IOException
	{
		Reverse ob = new Reverse();
		ob.reverse();
	}
}