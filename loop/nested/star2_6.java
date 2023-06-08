/*  
	1
    1
  3 3 3
  3 3 3
5 5 5 5 5  
*/
import java.util.Scanner;

class Star2_6
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a range:");
		int n = sc.nextInt();
		int i,j;
		int k=1,l=n-1;
			for(i=1; i<=n; i++)
			{	
				
				if(i>1 && i%2!=0)
				{
					l-=2;
				}					
				for(j=1; j<=l; j++)
				{	
					System.out.print(" ");
				}
				if(i>1 && i%2!=0)
				{	
					k=k+2;
				}
				for(j=1; j<=k; j++)
				{	
					System.out.print(k+" ");
				}
				System.out.println("");
			}
	

	}

}
