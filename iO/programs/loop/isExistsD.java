// check file exists or not
import java.io.*;
import java.util.Scanner;
class DirectoryExists
{
	public static void isExists()throws IOException
	{
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter Directory name ");			
		String fname = sc.next();	
		File fn = new File(fname);
		System.out.println(fn.exists());		
	}
}
class Main	{
	
	public static void main(String[]args)throws IOException
	{
		DirectoryExists ob =new DirectoryExists();
		ob.isExists();
	}
}