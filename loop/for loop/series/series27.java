
// 1!/2 + 3!/4 + 5!/6 = 22.0   

import java.util.Scanner;
class Series_27
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		int i,x=2;
		float sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x-1;j++)
			{
				fact*=j;
			
			}
			sum+=fact/x;
			
			System.out.print(x-1+"!/"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}




// 1!/2 - 3!/4  + 5!/6 =    19.0

class Series_27_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm");
		int n = sc.nextInt();
		
		int i,x=2;
		float sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			
			for(int j=1;j<=x-1;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum-=fact/x;
				System.out.print(" - "+(x-1)+"!/"+x);
			}
			else
			{
				sum+=fact/x;
				if(i>1)
				System.out.print(" + ");
				System.out.print((x-1)+"!/"+x);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- 1!/2  + 3!/4  - 5!/6  =  -19.0

class Series_27_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		int i,x=2;
		float sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			
			for(int j=1;j<=x-1;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum+=fact/x;
				System.out.print(" + "+(x-1)+"!/"+x);
			}
			else
			{
				sum-=fact/x;
				
				System.out.print(" - "+(x-1)+"!/"+x);
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
