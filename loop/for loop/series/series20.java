
// 1/1! + 2/3! + 3/5! =  1.3583333

import java.util.Scanner;
class Series_20
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter value of x: ");
		int i,x=1;
		float sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			sum+=i/fact;
			
			System.out.print(i+"/"+x+"!");
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}




// 1/1! - 2/3!  + 3/5! =    0.6916666

class Series_20_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		int i,x=1;
		float sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum-=i/fact;
				System.out.print(" - "+i+"/"+x+"!");
			}
			else
			{
				sum+=i/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(i+"/"+x+"!");
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- 1/1!  + 2/3!  - 3/5!  = -0.6916666

class Series_20_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		int i,x=1;
		float sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum+=i/fact;
				System.out.print(" + "+i+"/"+x+"!");
			}
			else
			{
				sum-=i/fact;
				
				System.out.print(" - "+i+"/"+x+"!");
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
