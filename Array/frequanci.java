import java.util.Scanner;
class Frequanci
{
	public static void main(String[]args)
	{		

		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		int i=0, count=1, temp=0;
	
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
					System.out.print("a["+i+"]");
					System.out.print(" , a["+j+"] : ");
				}
				
			}	
				 System.out.println("Element "+a[i]+" = "+count+" Time");
		}	
		//System.out.println("repetetion find "+count +" time" );
	}
}	
		