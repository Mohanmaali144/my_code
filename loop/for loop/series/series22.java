
// 1/x^1  + 2/x^3 + 3/x^5  =  0.41975307


import java.util.Scanner;
class Series_22
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter value of x: ");
		int n1 = sc.nextInt();
		int i,x=1;
		float pow=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			pow=1;
			
			for(int j=1;j<=x;j++)
			{
				pow*=n1;
			}
			sum+=i/pow;
			
			System.out.print(i+"/"+n1+"^"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// 1/x^1  - 2/x^3  + 3/x^5 =   0.27160496

class Series_22_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm");
		int n = sc.nextInt();
		
		System.out.println("Enter value of x ");
		int n1 = sc.nextInt();
		
		int i,x=1;
		float pow=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			pow=1;
			
			for(int j=1;j<=x;j++)
			{
				pow*=n1;
			}
			if(i%2==0)
			{
				sum-=i/pow;
				System.out.print(" - "+i+"/"+n1+"^"+x);
			}
			else
			{
				sum+=i/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print(i+"/"+n1+"^"+x);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- 1/x^1  + 2/x^3  - 3/x^5  = -0.27160496

class Series_22_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm ");
		int n = sc.nextInt();
		
		System.out.println("Enter value of x");
		int n1 = sc.nextInt();
		
		int i,x=1;
		float pow=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			pow=1;
			
			for(int j=1;j<=x;j++)
			{
				pow*=n1;
			}
			if(i%2==0)
			{
				sum+=i/pow;
				System.out.print(" + "+i+"/"+n1+"^"+x);
			}
			else
			{
				sum-=i/pow;
				
				System.out.print(" - "+i+"/"+n1+"^"+x);
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
