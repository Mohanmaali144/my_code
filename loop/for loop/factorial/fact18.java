//  - 1!/2 + 2!/4 - 3!/6 + 4!/8 - 5!/10 = -10.0

import java.util.Scanner;
class Fact18
{
	public static void main(String[]arg)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int j=2,i,n = sc.nextInt();
		float fact=1,sum=0;
		for(i=1; i<=n; i++,j+=2,fact*=i)
		{
			if(i%2==0)
			{
				sum+=(fact/j);
				if(i>1)
				System.out.print(" + ");
				System.out.print(i+"!/"+j);
			}
			else
			{
				sum-=(fact/j);
				System.out.print(" - "+i+"!/"+j);
			}
		}
		
		System.out.println(" = "+sum);
	}
}