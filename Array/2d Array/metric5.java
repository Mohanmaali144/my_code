/* 1,2,3,4,5,6,7,8,9  transpose
1 2 3
4 5 6
7 8 9

1 4 7
2 5 8
3 6 9

2 6 10
6 10 14
10 14 18
*/

import java.util.Scanner;
class Metric5
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
		{
			for(j=i+1;j<r; j++)
			{
					int temp = a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;		
			}
		}		
		System.out.println("Metrics 1\n");	
		for(i=0; i<c; i++)
		{  
			for(j=0; j<r; j++)	
				System.out.print(b[i][j]+" ");
			System.out.println("");	
		}	
		
		System.out.println("\nMetrics 2\n");	
		for(i=0; i<c; i++)
		{  
			for(j=0; j<r; j++)
			{	
				d[i][j]= a[i][j]+b[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");	
		}	
		System.out.println("\nSum of metrics\n");	
		for(i=0; i<c; i++)
		{  
			for(j=0; j<r; j++)
			System.out.print(d[i][j]+" ");
		
			System.out.println();	
		}		
	}
}	