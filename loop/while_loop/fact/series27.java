// - 1/1! + 3/2! - 5/3! + 7/4! - 9/5! = -0.11666666

import java.util.Scanner;
class Series27
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int j=1,i=1,n = sc.nextInt();
		float fact=1,sum=0;
		while(i<=n)
		{
			fact*=i;
			if(i%2==0)
			{
				sum+=(j/fact);
				if(i>1)
					System.out.print(" + ");
				System.out.print(j+"/"+i+"!");
			}
			
			else
			{
				sum-=(j/fact);
					
				System.out.print(" - "+j+"/"+i+"!");
			}
			j+=2;
			i++;
		}
		
		System.out.println(" = "+sum);
	}
}