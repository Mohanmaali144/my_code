import java.util.Scanner;
class Linear1
{
	public static void main(String[]args)
	{		

		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		int i=0;
		boolean flag = false;	
		System.out.println("Enter Element");
		for(i=0; i<5;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Enter the itom you wan to searh: ");
		int item=sc.nextInt();
		for( i=0; i<5; i++)
			if(a[i]==item)
				flag = true;
					
		if(flag)
			System.out.println("Element found in the Array");
		
		else
			System.out.println("Element not found in the Array");
	}
}	
		