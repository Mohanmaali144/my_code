/* 
11111
22222
33333
44444
55555
*/

import java.util.Scanner;

class Sqr6
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j;
	
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=n; j++)
			System.out.print(i);
		
		System.out.print("\n");
	}
}

}
