/* 	 	* * * * *
		* * * * *
		* * * * *
		* * * * *
		* * * * *
*/

import java.util.Scanner;

 class HollowSqr
 {
 public static void main(String[]args)
 {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter range: ");
	int n = sc.nextInt();
	int i,j;
	for(i=1; i<=n; i++)
	{	
		for(j=1; j<=n-1; j++)
		{	
			if(i==1 || i==n || i==j)
			System.out.print("* ");		
		}
		System.out.print("\n");

	}
	
 }
 }