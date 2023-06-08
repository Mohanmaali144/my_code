/* 
1
21
321
4321
54321
*/

import java.util.Scanner;

class Triangle9
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j;
	
	for(i=1; i<=n; i++)
	{
		for(j=i; j>=1; j--)	
			System.out.print(j);
		System.out.print("\n");
	}
}

}
