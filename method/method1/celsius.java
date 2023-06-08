
import java.util.Scanner;

class Celsius
{
	
	public void celsius()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter celsius: ");
		float c = sc.nextFloat();
		float f = (c*9)+32;
		System.out.println("celsius to fahrenheit = "+c);
	}
	
	
	public static void main(String[]args)
	{
		Celsius ob = new Celsius();	
			ob.celsius();

	}
}