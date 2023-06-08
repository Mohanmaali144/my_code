import java.util.Scanner;
class CountElement
{
	public static void main(String[]args)
	{		

		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		int i=0, count=0, temp=0;
	
		System.out.println("Enter Element");
		for(i=0; i<5;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Enter counting Element");
		temp=sc.nextInt();
		for( i=0; i<5; i++)
		{	
			if(a[i]==temp)
			{	
				count++;
				System.out.println("a["+i+"]");
			}
		}	
		System.out.println("repetetion find "+count +" time" );
	}
}	
		