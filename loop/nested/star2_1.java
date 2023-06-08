/*  
    *
   * *
  * * *
 * * * *
* * * * *
*/
import java.util.Scanner;

class Star2_1
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a range:");
		int n = sc.nextInt();
		int i,k;
		
			for(i=0; i<n; i++)
			{   			
				for(k=1; k<=n; k++)
				{ 	
			        if(k<n-i)	
						System.out.print(" ");
			
					else
						System.out.print("* ");
				
				}
			 System.out.println("");
			}
	

	}

}
