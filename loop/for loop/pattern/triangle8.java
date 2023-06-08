/* 
54321
4321
321
21
1
*/

import java.util.Scanner;

class Triangle8
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j;
	
	for(i=n; i>=1; i--)
	{
		for(j=i; j>=1; j--)	
			System.out.print(j);
		System.out.print("\n");
	}
}

}
