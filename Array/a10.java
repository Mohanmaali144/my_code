// String Array
import java.util.Scanner;
class A10
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);		
		int i;
		
		String a[]= new String[5];
		
		
		System.out.println("Enter Element: ");
		for(i=0; i<5; i++)
			a[i]=sc.next();
	
		
		for(i=0; i<5; i++)	
			System.out.println("a["+i+"]= "+a[i]);
			
		
		
	}
}	