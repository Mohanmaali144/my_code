/* 

*/

import java.util.Scanner;

class Series1
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i=1;
	
	
		while(i<=n)
		{	int j=1;
			while(j<=5)
			{	System.out.println(i+" "+j);
				j++;
			}
			i++;
		}	
}

}
