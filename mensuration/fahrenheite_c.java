 
import java.util.Scanner;

class Fahrenheit
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Fahrenheit: " );
		float f = sc.nextFloat();
		float c = ((f-32)*5)/9
		System.out.print("Celsius : "+c); 
	}
}
