
// 1!/2 + 3!/4 + 5!/6 = 22.0   

import java.util.Scanner;
class Series_27
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		int i=1,x=2;
		float sum=0,fact;
		
		while(i<=n)
		{	
			int j=1;
			fact=1;
			while(j<=x-1)
			{
				fact*=j;
				j++;	
			}
			sum+=fact/x;
			
			System.out.print(x-1+"!/"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
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
		
		int i=1,x=2;
		float sum=0,fact;
		
		while(i<=n)
		{	
			fact=1;
			int j=1;
			while(j<=x-1)
			{
				fact*=j;
				j++;
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
			i++;
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
		
		int i=1,x=2;
		float sum=0,fact;
		
		while(i<=n)
		{	
			fact=1;
			int j=1;
			while(j<=x-1)
			{
				fact*=j;
				j++;
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
			i++;
		}
		System.out.print(" = "+sum);
	}
}
