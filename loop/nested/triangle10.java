/* 
*
* *
* * * * * * * * *
* * * * * * * * * * * * * * * *

*/

import java.util.Scanner;

class Triangle10
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a range:");
		int n = sc.nextInt();
		int i,j,m=3,l=1;
			
			for(i=1; i<=n; i++)
			{ 
				  if(i==1)
					System.out.print("* ");
				  else if(i==2)
					  System.out.print("* * ");
				  else
					 {
						for(j=1; j<=i*i; j++)
						System.out.print("* ");
					 }
					
					
					System.out.println("");
			}
	}

}
