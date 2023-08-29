// check file exists or not
import java.io.*;
import java.util.Scanner;
import java.myexception.FileAllreadyExistsException;
class FileExists
{
	public static void isExists()throws IOException
	{
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter file name ");			
		String fname = sc.next();	
		
		File fn = new File(fname);
		
		try{
			if(fn.exists())
			{
				throw new FileAllreadyExistsException(" can not creat file");
			}
			else{
				fn.createNewFile();
			}
		}
		catch(FileAllreadyExistsException ref)
		{
			System.out.println(ref);
		}
	}
}
class Main	{
	
	public static void main(String[]args)throws IOException
	{
		FileExists ob =new FileExists();
		ob.isExists();
	}
}