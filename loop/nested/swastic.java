/*  
*   * * *
*   *
* * * * *
    *   *
* * *   *
*/
import java.util.Scanner;

class Swastic
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a range:");
		int n = sc.nextInt();
		int i,j;
		
		
		for(i=1; i<=n*2-1; i++)
		{
			for(j=1; j<=n*2-1; j++)
			{
				if((i==1 && j>=n)||(i==n)||(j==n)||				
				(i==n*2-1 && j<=n)||(i<=n && j==1)||
				(j==n*2-1 && i>=n))             
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
		System.out.println("");			
		}

	}

}
