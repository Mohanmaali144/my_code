
// 4/2! + 6/4! + 8/6! =   2.261111  

import java.util.Scanner;
class Series_31
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		int i,x=4;
		float sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x-2;j++)
			{
				fact*=j;
			
			}
			sum+=x/fact;
			
			System.out.print(x+"/"+(x-2)+"!");
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}




// 4/2! - 6/4!  + 8/6! =    1.7611111

class Series_31_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm");
		int n = sc.nextInt();		
		int i,x=4;
		float sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			
			for(int j=1;j<=x-2;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum-=x/fact;
				System.out.print(" - "+x+"/"+(x-2)+"!");
			}
			else
			{
				sum+=x/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"/"+(x-2)+"!");
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- 4/2!  + 6/4!  - 8/6!/ =  -1.7611111 

class Series_31_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		int i,x=4;
		float sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			
			for(int j=1;j<=x-2;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum+=x/fact;
				System.out.print(" + "+x+"/"+(x-2)+"!");
			}
			else
			{
				sum-=x/fact;
				
				System.out.print(" - "+x+"/"+(x-2)+"!");
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
