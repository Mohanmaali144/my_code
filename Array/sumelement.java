import java.util.Scanner;
class SumElement
{
	public static void main(String[]args)
	{		
		Scanner sc = new Scanner(System.in);
	
		int a[]=new int[5];
		int b[]=new int[5];
		int i=0,j=0,m=2;
		System.out.println("Enter eliment in array: ");	
		for(i=0; i<5; i++)
			a[i]= sc.nextInt();	
			
		for(i=0,j=4; i<5; i++,j--)
			b[i] = a[i]+a[j];
			
		for(i=0; i<5; i++)
			System.out.println("a["+i+"] = "+ b[i]);
	}	
}	
		