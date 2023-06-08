
// 1!/x^2  + 3!/x^4 + 5!/x^6  =  0.34979427


import java.util.Scanner;
class Series_37
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
			sum+=fact/pow;
			
			System.out.print(x+"!/"+n1+"^"+(x+1));
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// 1!/x^2  - 3!/x^4  + 5!/x^6 =  0.20164609

class Series_37_1
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
				sum-=fact/pow;
				System.out.print(" - "+x+"!/"+n1+"^"+(x+1));
			}
			else
			{
				sum+=fact/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"!/"+n1+"^"+(x+1));
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// - 1!/x^2 + 3!/x^4 - 5!/x^6 = -0.20164609

class Series_37_2
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
				sum+=fact/pow;
				System.out.print(" + "+x+"!/"+n1+"^"+(x+1));
			}
			else
			{
				sum-=fact/pow;
				
				System.out.print(" - "+x+"!/"+n1+"^"+(x+1));
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}

