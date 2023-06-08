/* 
* *
* * * *
* * * * * *
* * * * * * * *
* * * * * * * * * *
*/

import java.util.Scanner;

class Triangle7
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j;
	
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=i*2; j++)
			System.out.print("* ");
		
		System.out.println("");
	}
}

}
