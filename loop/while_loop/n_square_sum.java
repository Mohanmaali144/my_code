/*sum of n naturel num square */

import java.util.Scanner;
class SquareSum
{
public static void main(String[]arg)

{
Scanner sc = new Scanner(System.in);

System.out.println("Enter any number:   ");
int n = sc.nextInt();
int i=1;
int sqr=0,sum=0;

	while(i<=n)
	{		 
		sqr = i*i;		 
		sum = sum+sqr;
		i++;
	}
	System.out.println("some of Square = "+sum);
}
}