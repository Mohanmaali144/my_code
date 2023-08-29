import java.io.*;
import java.util.Scanner;
class Fibo {

	public void fibo()throws IOException
	{
		File fobj = new File("fibo.txt");
		FileOutputStream fos = new FileOutputStream(fobj);
		Scanner sc = new Scanner(System.in);
		int a=0,b=1,c=0;
		System.out.println("Enter a range");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			String s = Integer.toString(c);
			byte arr[]=s.getBytes();
			fos.write(arr);
			fos.write(32);
			a=b;
			b=c;
			c=a+b;
		}
		fos.close();
	}
}
class Main {
	
	public static void main(String []args) throws IOException
	{
		Fibo ob = new Fibo();
		ob.fibo();
	}
}