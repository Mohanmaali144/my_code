// complete..
import java.util.Scanner;
class Metric3
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
		for(i=0; i<r; i++)
			for( j=0; j<c; j++)
				a[i][j]=sc.nextInt();
		
		for(i=0; i<r; i++)
		{  
			for(j=0; j<c; j++)
				System.out.print(a[i][j]+" ");
			
			System.out.println();	
		}
		System.out.println("-----------------------------------------");
		int n=0;
		if(r>c)
		{
			n=r;
		}		
		else
		{
			n=c;
		}		
		for(i=0;i<r; i++)
			for(j=i;j<n; j++)
			{
					int temp = a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;				
			}			
		for(i=0; i<c; i++)
		{  
			for(j=0; j<r; j++)
				System.out.print(a[i][j]+" ");		
			System.out.println();	
		}		
	}
}	