/* 
* * * * *
  * * * *
    * * *
      * *
        *
*/

import java.util.Scanner;

class Triangle4
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j,k;
	
	for(i=n; i>=1; i--)
	{
		for(j=i; j<n; j++)
			System.out.print("  ");
		
		for(k=i; k>=1; k--)
			System.out.print("* ");
		
		System.out.println("");
	}
}

}
