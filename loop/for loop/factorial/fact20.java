// 2/1! - 4/2! + 6/3! - 8/4! + 10/5! = 0.74999994

import java.util.Scanner;
class Fact20
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int j=2,i,n = sc.nextInt();
		float fact=1,sum=0;
		for(i=1; i<=n; i++,j+=2,fact*=i)
		{
			
			if(i%2==0)
			{
				sum-=(j/fact);
				if(i>1)
					System.out.print(" - ");
				System.out.print(j+"/"+i+"!");
			}
			
			else
			{
				sum+=(j/fact);
					if(i>1)
						System.out.print(" + ");
				System.out.print(j+"/"+i+"!");
			}
		}
		
		System.out.println(" = "+sum);
	}
}