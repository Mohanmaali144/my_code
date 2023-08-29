import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String args[])throws IOException
	{
		File f = new File("testFile.txt");
		
		FileWriter fw = new FileWriter(f);
		char[] ch = new char[(int)f.length()];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{	
			ch[i]=sc.next().charAt(0);
		}
		fw.write(ch);
		
		
		
		
		
		FileReader fr = new FileReader(f);
		fr.read(ch);
		
		for(char ch1 : ch)
		{
			System.out.println(ch1);
		}
	}
}