/*sum of n naturel num square */

import java.util.Scanner;
class SquareSum2
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
		if(i<n)
		{
			System.out.print(sqr+" + ");
		}
		i++;
	}
	System.out.println(sqr+" = "+sum);
}
}