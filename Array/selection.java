import java.util.Scanner;
class Selection
{
	public static void main(String[]args)
	{		

		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		int i=0,j=0;
	
		System.out.println("Enter Element");
		for(i=0; i<5;i++)
			a[i]=sc.nextInt();
		
			
		for(i=0; i<5; i++)
		{
			for(j=i+1; j<5; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
						a[i] = a[j];
						a[j]=temp;
				}	
			}
		}
			
		for( i=0; i<5; i++)
			System.out.print(a[i]+" ");
		
	
	}
}	
		