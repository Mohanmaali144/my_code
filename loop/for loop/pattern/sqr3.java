/* 
12345
12345
12345
12345
12345	
*/

import java.util.Scanner;

class Sqr3
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,k;
	
	for(i=1; i<=n; i++)
	{
		
		for(k=1; k<=n; k++)
			System.out.print(k);
		
		System.out.print("\n");
	}
}

}
