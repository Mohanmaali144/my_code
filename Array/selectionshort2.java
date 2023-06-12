// Selection short
import java.util.Scanner;
class SelectionShort2
{
	public static void main(String[]args)
	{		
		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		int i=0,j=0;
	
		System.out.println("Enter Element");
		for(i=0; i<5;i++)
		{
			a[i]=sc.nextInt();	
		}
			
		for(i=0;i<5;i++)
		{
			int min = a[i];
			int pos=i;
			for(j=i+1; j<5; j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					pos=j;
				}
			}
			a[pos]=a[i];
			a[i]=min;
		}	
		
		for(i=0; i<5;i++)
		{
			System.out.print(a[i]+" ");
		}		
		
	
	}
}	
		