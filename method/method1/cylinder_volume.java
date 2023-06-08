
import java.util.Scanner;

class Cylinder2
{
	
	public void volume()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		float r = sc.nextFloat();
		System.out.println("Enter Height: ");
		float h = sc.nextFloat();
		float v=3.14f*(r*r)*h;
		System.out.println("volume  = "+v);
	}
	
	public static void main(String[]args)
	{
	Cylinder2 ob = new Cylinder2();	
		ob.volume();

	}
}