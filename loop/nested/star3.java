/* 
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/

import java.util.Scanner;

class Star3
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a range:");
		int n = sc.nextInt();
		int i,k,j;
		
			for(i=1; i<=n; i++)
			{
				for(k=1; k<=i; k++)					
					System.out.print("* ");
				
				System.out.println("");
			}
			for(i=1; i<=n; i++)
			{
				for(k=n; k>i; k--)
					System.out.print("* ");
				
				System.out.println("");
			}
	

	}

}
