
import java.util.Scanner;

class Aasci
{
	
	public void aasci()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		char ch = sc.next().charAt(0);
		int aasci = (int)(ch);
		System.out.print("Aasci value is : "+aasci);
	}		
	
	public static void main(String[]args)
	{
		Aasci ob = new Aasci();	
		ob.aasci();

	}
	
}