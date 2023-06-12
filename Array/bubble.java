// bubble short

import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int a[] = new int [5];
		System.out.println("Enter Element");
		int i,j;
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}

		int n=5;
		for(i=0;i<n; i++)
		{
			for(j=0; j<n-1-i;j++)
				if(a[j]>a[j+1])
				{
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}		
		} 
	
		for(i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
	}	
}	