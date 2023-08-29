import java.io.*;
import java.util.Scanner;

class Main {
	public static void main(String[]args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ernter a number");
		int n = sc.nextInt();
		
		int i=1,j=0; 
		
		File fobj = new File("odd.txt");
		FileOutputStream fos = new FileOutputStream(fobj);
		
		for(i=1,j=0; i<=n;i++)
		{		
			j=2*i-1;
			String s = Integer.toString(j);
			byte arr[]= s.getBytes();
			fos.write(arr);
			fos.write(32);
			//fos.flush();			
		}
		fos.close();
		
	}

}