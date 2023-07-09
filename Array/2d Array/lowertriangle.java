// complete

import java.util.Scanner;
class Triangle
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[3][3];			
		System.out.println("Enter row");
		int r = sc.nextInt();	
		System.out.println("Enter coloum");
		int c = sc.nextInt();
		int i,j;
		System.out.println("Enter eliment: ");
		for(i=0; i<r; i++)
		{	for( j=0; j<c; j++)
			{
				a[i][j]=sc.nextInt();		
			}
		}
		System.out.println("-------------------------------------------------");	
		for(i=0; i<r; i++)
		{
			for(j=0;j<=i; j++)
			{	
				System.out.print(a[i][j]+" ");	
			}
			System.out.println();	
		}
	}		
}
	