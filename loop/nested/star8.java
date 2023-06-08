/*			 
	1
    1
  3 3 3
  3 3 3
5 5 5 5 5
5 5 5 5 5
*/

import java.util.Scanner;

class Star8
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a range:");
		int n = sc.nextInt();
		int i,k,j;
		
			for(i=1; i<=n; i+=2)
			{	
				for(j=i; j<n; j++)	
					System.out.print(" ");
				
				for(j=1; j<=i; j++)	
					System.out.print(i+" ");
				System.out.println("");
				
				for(j=i; j<n; j++)	
					System.out.print(" ");
				
				for(j=1; j<=i; j++)	
					System.out.print(i+" ");
			System.out.println("");	
			}

	}

}
