/* 
	 1
    121
   12321
  1234321
 123454321
*/

import java.util.Scanner;

class Triangle12
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j,k,l;
	
	for(i=1; i<=n; i++)
	{
		for(j=i; j<=n; j++)
		System.out.print(" ");
		
		for(k=1; k<=i; k++)	
			System.out.print(k);

		for(l=i; l>1; l--)	
			System.out.print((l-1));
		
		System.out.print("\n");
		
	}
}

}
