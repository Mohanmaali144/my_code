import java.io.*;
import java.util.Scanner;
class Palindrom
{
	public static void palindrom()throws IOException
	{
		Scanner sc = new Scanner(System.in);

		File fob = new File("palindrom.txt");
		FileOutputStream fos = new FileOutputStream(fob);
		System.out.println("Enter range number:   ");
		int n = sc.nextInt();
		int x=11;
		while(x<=n)
		{		
			int re=0,rev=0,temp=x;
			while(x>0)
			{
				re=x%10;
				rev = (rev *10)+re;
				x/=10;
			}
			if(temp==rev)
			{
				String st = Integer.toString(temp);
				byte arr[]= st.getBytes();
				fos.write(arr);	
				fos.write(32);
			}
			x=temp;
			x++;
		}
		fos.close();
	}
}
class Main	{
	
	public static void main(String[]args)throws IOException
	{
		Palindrom ob =new Palindrom();
		ob.palindrom();
	}
}