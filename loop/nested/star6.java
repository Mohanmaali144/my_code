/*			 
*
* * *
* * * * *
* * * * * * *
* * * * * * * * *
* * * * * * *
* * * * *
* * *
*
*/

import java.util.Scanner;

class Star6
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a range:");
		int n = sc.nextInt();
		int i,k;
		
			for(i=1; i<=n; i++)
			{			
				for(k=1; k<=i*2-1; k++)					
					System.out.print("* ");
				
				System.out.println("");
			}
			for(i=n-1; i>=1; i--)
			{			
				for(k=1; k<=i*2-1; k++)					
					System.out.print("* ");
				
				System.out.println("");
			}
			
	

	}

}
