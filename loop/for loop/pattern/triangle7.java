/* 
	1
   12
  123
 1234
12345
*/

import java.util.Scanner;

class Triangle7
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j,k;
	
	for(i=1; i<=n; i++)
	{
		for(j=i; j<n; j++)
			System.out.print("  ");
		
		for(k=1; k<=i; k++)
			System.out.print(k+" ");
		
		System.out.print("\n");
	}
}

}
