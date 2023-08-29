import java.io.*;
import java.nio.Buffer;

class Main {
	
	
	public static void main(String args[])throws IOException
	{
		InputStreamReader in  = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader (in);
		
		System.out.println("Enter a value...");
		
		char a = (char)(bf.read());
		
		System.out.println(a);
	}
}