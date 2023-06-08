
// 4/x^1  + 6/x^3 + 8/x^5  =   1.5884774
// 

import java.util.Scanner;
class Series_33
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm ");
		int n = sc.nextInt();
		
		System.out.println("Enter value of x: ");
		int n1 = sc.nextInt();
		int i=1,x=4;
		float pow=1,sum=0;
		
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=(x-3))
			{
				pow*=n1;
				j++;
			}
			sum+=x/pow;
			
			System.out.print(x+"/"+n1+"^"+(x-3));
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// 4/x^1  - 4/x^3  + 8/x^5 =   1.144033

class Series_33_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm");
		int n = sc.nextInt();
		
		System.out.println("Enter value of x ");
		int n1 = sc.nextInt();
		
		int i=1,x=4;
		float pow=1,sum=0;
		
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x-3)
			{
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum-=x/pow;
				System.out.print(" - "+(x-3)+"/"+n1+"^"+x);
			}
			else
			{
				sum+=x/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print((x-3)+"/"+n1+"^"+x);
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- 4/x^1  + 6/x^3  - 8/x^5  = -1.144033

class Series_33_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm ");
		int n = sc.nextInt();
		
		System.out.println("Enter value of x");
		int n1 = sc.nextInt();
		
		int i=1,x=4;
		float pow=1,sum=0;
		
	while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x-3)
			{
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum+=x/pow;
				System.out.print(" + "+(x-3)+"/"+n1+"^"+x);
			}
			else
			{
				sum-=x/pow;
				
				System.out.print(" - "+(x-3)+"/"+n1+"^"+x);
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
