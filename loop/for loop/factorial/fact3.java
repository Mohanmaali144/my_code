//  - 1! + 2! - 3! + 4! - 5! = -101

import java.util.Scanner;
class Fact3
{
	public static void main(String[]args)
	{
		int fact=1,i,n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1; i<=n; i++,fact*=i)
		{
			if(i%2==0)
			{	sum+=fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(i+"!");
			}
			
			else
			{	
				sum-=fact;				
				System.out.print(" - "+i+"!");
			}		
		}
		
		System.out.println(" = "+sum);
	}
}