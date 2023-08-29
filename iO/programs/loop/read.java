import java.io.*;
import java.util.Scanner;
class Main {

	public static void main(String args[])throws IOException
	{	
		FileInputStream fin = new FileInputStream("cube.txt");
		
		int m=0;		
		while(m!=-1)
		{
			m=fin.read();
			System.out.print((char)m);
		}
		
	}
}