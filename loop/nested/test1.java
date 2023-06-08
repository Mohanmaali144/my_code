/* 
*
* *
* * * *
* * * * * * *
* * * * * * * * * * *

*/

import java.util.Scanner;

class Test1
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a range:");
		int n = sc.nextInt();
		int i,j,k=1;
			
		for(i=1; i<=n; i++)
		{ 	
			for(j=1; j<=k; j++)
			{
				System.out.print("* ");	
			}
			k=k+i;
			System.out.println("");
		}
	}

}
