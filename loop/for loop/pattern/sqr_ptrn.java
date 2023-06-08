/* 	 	* * * * *
		* * * * *
		* * * * *
		* * * * *
		* * * * *
*/

import java.util.Scanner;

 class Sqr
 {
 public static void main(String[]args)
 {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter range: ");
	int n = sc.nextInt();
	int i,j;
	for(i=1; i<=n; i++)
	{	
		for(j=1; j<=5; j++)
		System.out.print("* ");
		
		System.out.print("\n");

	}
	
 }
 }