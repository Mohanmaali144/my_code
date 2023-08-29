import java.io.*;
import java.util.Scanner;
class Dic
{
	public static void dyr()throws IOException
	{
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter directory name ");	
		
		
		String fname = sc.next();	
		File fd = new File(fd);
		fd.mkdir();
		System.out.println(fd.exists());		
	}
}
class Main	{
	
	public static void main(String[]args)throws IOException
	{
		Dic ob =new Dic();
		ob.dyr();
	}
}