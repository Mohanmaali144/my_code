
// x^1/2  + x^3/4 + x^5/6  =   35.625


import java.util.Scanner;
class Series_32
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter value of x: ");
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
			sum+=pow/x;
			
			System.out.print(n1+"^"+(x-3)+"/"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// x^1/4  - x^3/6  + x^5/8 =  26.625

class Series_32_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
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
			if(i%2==0)
			{
				sum-=pow/x;
				System.out.print(" - "+n1+"^"+(x-3)+"/"+x);
			}
			else
			{
				sum+=pow/x;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+(x-3)+"/"+x);
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- x^1/4  + x^3/6  - x^5/8  =  -26.625

class Series_32_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any num for power ");
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
				sum+=pow/x;
				System.out.print(" + "+n1+"^"+(x-3)+"/"+x);
			}
			else
			{
				sum-=pow/x;
				
				System.out.print(" - "+n1+"^"+(x-3)+"/"+x);
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
