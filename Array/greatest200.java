import java.util.Scanner;
class Greatest200
{
	public static void main(String[]args)
	{		

		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		int i=0;
	
		System.out.println("Enter Element");
		for(i=0; i<5;i++)
			a[i]=sc.nextInt();
		
		System.out.print("Element are: ");
		for( i=0; i<5; i++)
		{			
				if(a[i]>250)
				{	
					System.out.print(a[i]+" ");			
				}
		}	
	
	}
}	
		