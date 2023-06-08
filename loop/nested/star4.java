/*			 
		*
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/

import java.util.Scanner;

class Star4
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a range:");
		int n = sc.nextInt();
		int i,k,j;
		
			for(i=1; i<=n; i++)
			{
				for(j=i; j<n; j++)
					System.out.print("  ");
				for(k=1; k<=i*2-1; k++)					
					System.out.print("* ");
				
				System.out.println("");
			}
			
	

	}

}
