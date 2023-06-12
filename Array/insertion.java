//insertion sort
import java.util.Scanner;
class Inser
{
	public static void main(String[]args)
	{		
		Scanner sc = new Scanner(System.in);
		int a[] = new int [20];
		int i=0,j=0;
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter Element");			
		int temp=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			temp=a[i];
			for(j=i-1; j>=0 && a[j]>temp; j--)
			{
				 a[j+1]= a[j];	 
			}
			a[j+1]=temp;
		}			
		for(i=0; i<n;i++)
		{
			System.out.print(a[i]+" ");
		}		
		
	
	}
}	
		