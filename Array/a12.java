
import java.util.Scanner;
class A12
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);		
		int i;
		
		float a[]= new float[5];
		
		
		System.out.println("Enter Element: ");
		for(i=0; i<5; i++)
			a[i]=sc.nextFloat();
	
		
		for(i=0; i<5; i++)	
			System.out.println("a["+i+"]= "+a[i]);
			
		
		
	}
}	