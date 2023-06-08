/* 1,2,3,4,5,6,7,8,9
sum
2 6 10
6 10 14
10 14 18
*/

import java.util.Scanner;
class Metric4
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[5][5];
		int	b[][]=new int [5][5];
		int	d[][]=new int [5][5];
		System.out.println("Enter row");
		int r = sc.nextInt();
		
		System.out.println("Enter coloum");
		int c = sc.nextInt();
		int i,j;
		System.out.println("Enter eliment: ");
		for(i=0; i<c; i++)
			for( j=0; j<r; j++)
			{
				a[i][j]=sc.nextInt();
				b[i][j]=a[i][j];
			}	
			
		for(i=0;i<c; i++)
			for(j=i+1;j<r; j++)
			{
				int temp = a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}	
		
		for(i=0; i<c; i++)
		{  
			for(j=0; j<r; j++)
				d[i][j]= a[i][j]+b[i][j];	
		}	

		for(i=0; i<c; i++)
		{  
			for(j=0; j<r; j++)
			System.out.print(d[i][j]+" ");
			
			System.out.println();	
		}		
	}
}	