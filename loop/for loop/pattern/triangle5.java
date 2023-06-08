/* 
1
12
123
1234
12345
*/

import java.util.Scanner;

class Triangle5
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j;
	
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=i; j++)
			System.out.print(j);
		
		System.out.print("\n");
	}
}

}
