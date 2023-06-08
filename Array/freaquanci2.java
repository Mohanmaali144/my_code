import java.util.Scanner;
class Frequanci2
{
	public static void main(String[]args)
	{		

		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		int i=0, count=1;
	
		System.out.println("Enter Element");
		for(i=0; i<5;i++)
			a[i]=sc.nextInt();
		
		for( i=0; i<5; i++)
		{	count=1;
			for(int j=i+1; j<5; j++)
			{	
				if(a[i]==a[j])
				{	
					count++;
					a[j]=-1;
					
				}
				
			}
			
			if(a[i]!=(-1))
				System.out.println("Element "+a[i]+" = "+count+" Time");
		}	
	
	}
}	
		