/* 
*
* *
* * * *
* * * * * * *
* * * * * * * * * * *

*/

import java.util.Scanner;

class Test2
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a range:");
		int n = sc.nextInt();
		int i,j,k=1;
			
		for(i=1; i<=n; i++)
		{ 	
			if(i>2)			
			for(j=1; j<=i*i; j++)		 
			System.out.print("* ");	
			else{
				for(j=1; j<=i; j++)
				System.out.print("* ");	
				}
			System.out.println("");
		}
	}

}
