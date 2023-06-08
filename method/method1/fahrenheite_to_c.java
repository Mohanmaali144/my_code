
import java.util.Scanner;

class Fahrenheite
{
	
	public void fahrenheite()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Fahrenheit: " );
		float f = sc.nextFloat();
		float c = ((f-32)*5)/9;;
		System.out.print("Celsius : "+c); 
	}
	
	
	public static void main(String[]args)
	{
		Fahrenheite ob = new Fahrenheite();	
			ob.fahrenheite();

	}
}