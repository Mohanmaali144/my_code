
import java.io.*;
import java.util.Scanner;
class Armstrong
{
	public static void arm() throws IOException
	{
		File fobj = new File("armstrong.txt");
		FileOutputStream fos = new FileOutputStream(fobj);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range  ");
		int n = sc.nextInt();
		int x=1;
		while(x<=n)
		{	
			int temp=x,arm=0,re=0,count=0,pow=1,i=1; 	
			while(x>0)
			{
				x=x/10;
				count++;
			}
			x=temp;
			while(x>0)
			{  
				re = x%10;
				i=1;pow=1;
				while(i<=count)
				{
					pow=pow*re;
					i++;
				}	
				arm=arm+pow;
				x=x/10;	
			}
			if(arm==temp) {
				
				String s = Integer.toString(temp);
				byte arr[]= s.getBytes();
				fos.write(arr);
				fos.write(32);
				fos.flush();			
			}
			x=temp;
			x++;
		}
		fos.close();
	}
}
class Main {
	
	public static void main(String[]arg)throws IOException
	{
		Armstrong ob = new Armstrong();
		ob.arm();
	}
}