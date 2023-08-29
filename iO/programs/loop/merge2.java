import java.io.*;
import java.util.Scanner;
class Main {

	public static void main(String args[])throws IOException
	{
		File fobj = new File("merge2.txt");
		FileOutputStream fos = new FileOutputStream(fobj,true);
		
		FileInputStream fin = new FileInputStream("string1.txt");
		FileInputStream fin2 = new FileInputStream("string2.txt");
		
		int m=0;		
		while((m=fin.read())!=-1)
		{
			fos.write(m);
			fos.flush();
		}
		fos.write(10);
		m=0;
		while((m=fin2.read())!=-1)
		{
			fos.write(m);
			fos.flush();
		}
		System.out.println("file saved");
		fos.close();
	}
}