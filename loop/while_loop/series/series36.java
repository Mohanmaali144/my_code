
// x^2/1!  + x^4/3! + x^6/5!  =   28.575

import java.util.Scanner;
class Series_36
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter value of x: ");
		int n1 = sc.nextInt();
		int i=1,x=1;
		float pow=n1,sum=0,fact;
		
		while(i<=n)
		{	
			fact=1;
			pow=n1;
			int j=1;
			while(j<=x)
			{
				fact*=j;
				pow*=n1;
				j++;
			}
			sum+=pow/fact;
			
			System.out.print(n1+"^"+(x+1)+"/"+x+"!");
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// x^2/1!  - x^4/3!  + x^6/5! =    1.5749998

class Series_36_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow,sum=0,fact;
		
		while(i<=n)
		{	
			fact=1;
			pow=n1;
			int j=1;
			while(j<=x)
			{
				fact*=j;
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum-=pow/fact;
				System.out.print(" - "+n1+"^"+(x+1)+"/"+x+"!");
			}
			else
			{
				sum+=pow/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+(x+1)+"/"+x+"!");
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- x^2/1!  + x^4/3!  - x^6/5!  =  -1.5749998

class Series_36_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0,fact;
		
		while(i<=n)
		{	
			fact=1;
			pow=n1;
			int j=1;
			while(j<=x)
			{
				fact*=j;
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum+=pow/fact;
				System.out.print(" + "+n1+"^"+(x+1)+"/"+x+"!");
			}
			else
			{
				sum-=pow/fact;
				
				System.out.print(" - "+n1+"^"+(x+1)+"/"+x+"!");
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
