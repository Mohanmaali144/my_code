/* 
1 1 1 1 1
  2 2 2 2
    3 3 3
      4 4
        5
*/

import java.util.Scanner;

class Triangle6
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("Enter a range:");
int n = sc.nextInt();
int i,j,k;
	
	for(i=1; i<=n; i++)
	{
		for(j=1; j<i; j++)
			System.out.print("  ");
		
		for(k=i; k<=n; k++)
			System.out.print(i+" ");
		
		System.out.println("");
	}
}

}
