import java.io.*;
import java.util.Scanner;
class Dynamic
{
	public static void dynamic()throws IOException
	{
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter file name ");	
		String fname = sc.next();
		File fob = new File(fname+".txt");
		FileOutputStream fos = new FileOutputStream(fob);
		System.out.println("Enter a string");	
		String s = sc.next();
		byte arr[]= s.getBytes();
		fos.write(arr);		
		fos.close();
	}
}
class Main	{
	
	public static void main(String[]args)throws IOException
	{
		Dynamic ob =new Dynamic();
		ob.dynamic();
	}
}