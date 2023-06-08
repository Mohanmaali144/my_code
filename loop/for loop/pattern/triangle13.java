/* 
123454321
 1234321
  12321
   121
    1
*/

import java.util.Scanner;

class Triangle13
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j,k,l;
	
	for(i=n; i>=1; i--)
	{
		for(j=i; j<n; j++)
		System.out.print(" ");
		
		for(k=1; k<=i; k++)	
			System.out.print(k);

		for(l=i; l>1; l--)	
			System.out.print((l-1));
		
		System.out.print("\n");
		
	}
}

}
