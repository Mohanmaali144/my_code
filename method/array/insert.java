
// uncomplete
import java.util.Scanner;
class Find
{  
	public int find(int b[])
	{	
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter length of array");
		int i, size = sc.nextInt();		
		System.out.println("Enter Elememnt");
		for(i=0; i<size; i++)
			b[i]=sc.nextInt();
				
		System.out.println("Enter inserting Elememnt");
		int insert = sc.nextInt();
		
		System.out.println("Enter index ");
		int index = sc.nextInt();
		int flag = 0;
		for(i=0; i<size; i++)
		{
			if(f==b[i])
			{
				System.out.println("Element found in a["+i+"]"+b[i]);
				flag = 1;
				break;
			}
		}	
		if(flag==0)
			System.out.println("Element Not found");
		return 0;		
	}	
	public static void main(String[]args)
	{	
		int a[]=new int [10];
		Find ob = new Find();
		ob.find(a);		
	}	
}