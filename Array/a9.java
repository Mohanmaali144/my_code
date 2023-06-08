// char Array
import java.util.Scanner;
class A9
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);		
		int i;
		
		char a[]= new char[5];
		
		
		System.out.println("Enter Element: ");
		for(i=0; i<5; i++)
			a[i]=sc.next().charAt(0);
	
		
		for(i=0; i<5; i++)	
			System.out.println("a["+i+"]= "+a[i]);
			
		
		
	}
}	