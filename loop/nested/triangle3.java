/* 
5 4 3 2 1
  4 3 2 1
    3 2 1
      2 1
        1
*/

import java.util.Scanner;

class Triangle3
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
		{	
			System.out.print("  ");
		}	
		for(k=i; k>=1; k--)
		{
			System.out.print(k+" ");
		}			
		System.out.println("");
	}
}

}
