/* 
12345
 1234
  123
   12
    1
*/

import java.util.Scanner;

class Triangle11
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j,k;
	
	for(i=n; i>=1; i--)
	{
		for(j=n; j>i; j--)
		System.out.print(" ");
		
		for(k=1; k<=i; k++)	
			System.out.print(k);
		
		System.out.print("\n");
	}
}

}
