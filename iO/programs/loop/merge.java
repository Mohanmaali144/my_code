import java.io.*;
import java.util.Scanner;
class Main {

	public static void main(String args[])throws IOException
	{
		File fobj = new File("merge.txt");
		FileOutputStream fos = new FileOutputStream(fobj,true);
		
		FileInputStream fin = new FileInputStream("cube.txt");
		FileInputStream fin2 = new FileInputStream("riverse.txt");
		
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