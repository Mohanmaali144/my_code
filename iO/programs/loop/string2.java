import java.io.*;
import java.util.Scanner;
class String2
{
	public static void string()throws IOException
	{
		Scanner sc = new Scanner(System.in);	
		File fob = new File("string2.txt");
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
		String2 ob =new String2();
		ob.string();
	}
}