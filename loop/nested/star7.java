/*			 
	*
    *
  * * *
  * * *
* * * * *
* * * * *
*/

import java.util.Scanner;

class Star7
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a range:");
		int n = sc.nextInt();
		int i,j;
		
			for(i=1; i<=n; i+=2)
			{	
				for(j=i; j<n; j++)	
					System.out.print(" ");
				
				for(j=1; j<=i; j++)	
					System.out.print("* ");
				System.out.println("");
				
				for(j=i; j<n; j++)	
					System.out.print(" ");
				
				for(j=1; j<=i; j++)	
					System.out.print("* ");
			System.out.println("");	
			}

	}

}
