/* 
12345
1234
123
12
1
*/

import java.util.Scanner;

class Triangle10
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j;
	
	for(i=n; i>=1; i--)
	{
		for(j=1; j<=i; j++)	
			System.out.print(j);
		
		System.out.print("\n");
	}
}

}
