import java.io.*;
import java.util.Scanner;
class StringClass
{
	public void string()throws IOException
	{
		Scanner sc = new Scanner(System.in);	
		File fob = new File("string1.txt");
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
		StringClass ob =new StringClass();
		ob.string();
	}
}