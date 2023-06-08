
import java.util.Scanner;

class Density
{
	
	public void density()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mass");
		float m = sc.nextFloat();
		System.out.println("Enter volume");
		float v = sc.nextFloat();
		double d=m/v;
		System.out.println("Density is = "+d);
	}
	
	
	public static void main(String[]args)
	{
		Density ob = new Density();	
			ob.density();

	}
}