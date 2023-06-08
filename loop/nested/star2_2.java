/*  
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*   
*/
import java.util.Scanner;

class Star2_2
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a range:");
		int n = sc.nextInt();
		int i,j;
		int k=n*2;
			for(i=1; i<=k; i++)
			{
				if(i<=5)
				{
					for(j=1; j<=i; j++)
						System.out.print("* ");
				}
				else
				{			
					for(j=k; j>i; j--)
						System.out.print("* ");
				}
				System.out.println("");
			}
	

	}

}
