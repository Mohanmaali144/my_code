// boolean type
import java.util.Scanner;
class A11
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);		
		int i;
		
		boolean a[]= new boolean[5];
		
		
		System.out.println("Enter Element: ");
		for(i=0; i<5; i++)
			a[i]=sc.nextBoolean();
	
		
		for(i=0; i<5; i++)	
			System.out.println("a["+i+"]= "+a[i]);
			
		
		
	}
}	