// input
import java.util.Scanner;
class A6
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[5];
			
		int i;
		System.out.println("Enter eliment: ");
		for(i=0; i<a.length; i++)
			a[i]=sc.nextInt();
	
		
		for(i=0; i<a.length; i++)	
			System.out.println(a[i]);
			
		
		
	}
}	