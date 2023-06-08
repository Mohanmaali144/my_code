/* 
*
* *
* * * *
* * * * * * *
* * * * * * * * * * *

*/

import java.util.Scanner;

class Triangle9
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j,m=3,l=1;
	
	for(i=1; i<=n; i++)
	{ if(i==1)
		System.out.print("* ");
	  else if(i==2)
		  System.out.print("* * ");
		else if(i%2==0)
		{
			
			for(j=1; j<=i+m; j++)
			System.out.print("* ");
		m=m+j;
		}	
		
		else
		{ 
			for(j=1; j<=i+l; j++)
			System.out.print("* ");
		l=l+j;
		}
		
		System.out.println("");
	}
}

}
