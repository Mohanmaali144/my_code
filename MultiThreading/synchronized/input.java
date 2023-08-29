import java.io.*;

class Main {
	
	
	public static void main(String args[])
	{
		InputStreamReader in  = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader (in);
		
		System.out.println("Enter a value...");
		
		int a = bf.read();
		
		System.out.println(a);
	}
}