
// 1/x^2  + 3/x^4 + 5/x^6  =   0.15500686 
// 

import java.util.Scanner;
class Series_29
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm ");
		int n = sc.nextInt();
		
		System.out.println("Enter value of x: ");
		int n1 = sc.nextInt();
		int i=1,x=2;
		float pow=1,sum=0;
		
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			sum+=(x-1)/pow;
			
			System.out.print((x-1)+"/"+n1+"^"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// 1/x^2  - 3/x^4  + 5/x^6 =   0.08093279

class Series_29_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm");
		int n = sc.nextInt();
		
		System.out.println("Enter value of x ");
		int n1 = sc.nextInt();
		
		int i=1,x=2;
		float pow=1,sum=0;
		
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum-=(x-1)/pow;
				System.out.print(" - "+(x-1)+"/"+n1+"^"+x);
			}
			else
			{
				sum+=(x-1)/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print((x-1)+"/"+n1+"^"+x);
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- 1/x^2  + 3/x^4  - 5/x^6  = -0.08093279

class Series_29_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm ");
		int n = sc.nextInt();
		
		System.out.println("Enter value of x");
		int n1 = sc.nextInt();
		
		int i=1,x=2;
		float pow=1,sum=0;
		
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum+=(x-1)/pow;
				System.out.print(" + "+(x-1)+"/"+n1+"^"+x);
			}
			else
			{
				sum-=(x-1)/pow;
				
				System.out.print(" - "+(x-1)+"/"+n1+"^"+x);
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
