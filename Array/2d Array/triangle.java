/// uncomplete..

import java.util.Scanner;
class Triangle
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[5][5];			
		System.out.println("Enter row");
		int r = sc.nextInt();	
		System.out.println("Enter coloum");
		int c = sc.nextInt();
		int i,j;
		System.out.println("Enter eliment: ");
		for(i=0; i<c; i++)
		{	for( j=0; j<r; j++)
			{
				a[i][j]=sc.nextInt();		
			}
		}
			
		for(i=0; i<5; i++)
		{
			for(j=0;j<5; j++)
			{	
				System.out.println();	
			}
		}
	}		
}
	