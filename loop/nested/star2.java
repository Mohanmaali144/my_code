/* 
 
    *
   * *
  * * *
 * * * *
* * * * *
*/

import java.util.Scanner;

class Star2
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
				for(k=1; k<=i; k++)
					System.out.print(" *  ");
				
				System.out.println("");
			}
	

	}

}
