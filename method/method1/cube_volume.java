
import java.util.Scanner;

class Cube2
{
	
	public void volume()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter edge: ");
		float edge = sc.nextFloat();
		float v=(edge*edge*edge);
		System.out.println("volume  = "+v);	
	}
	
	public static void main(String[]args)
	{
	Cube2 ob = new Cube2();	
		ob.volume();

	}
}