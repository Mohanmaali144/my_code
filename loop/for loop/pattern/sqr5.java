/* 
55555
44444
33333
22222
11111
*/

import java.util.Scanner;

class Sqr5
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j;
	
	for(i=n; i>=1; i--)
	{
		for(j=1; j<=n; j++)
			System.out.print(i);
		
		System.out.print("\n");
	}
}

}
