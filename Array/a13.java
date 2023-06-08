
import java.util.Scanner;
class A13
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);		
		int i;
		
		double a[]= new double[5];
		
		
		System.out.println("Enter Element: ");
		for(i=0; i<5; i++)
			a[i]=sc.nextDouble();
	
		
		for(i=0; i<5; i++)	
			System.out.println("a["+i+"]= "+a[i]);
			
		
		
	}
}	