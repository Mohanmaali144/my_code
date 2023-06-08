/* 
1 2 3 4 5
  2 3 4 5
    3 4 5
      4 5
        5
*/

import java.util.Scanner;

class Triangle5
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
			System.out.print(k+" ");
		
		System.out.println("");
	}
}

}
