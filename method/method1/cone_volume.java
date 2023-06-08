
import java.util.Scanner;

class Cone2
{
	
	public void volume()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        float r = sc.nextFloat();
        System.out.println("Enter Height: ");
        float h = sc.nextFloat();
        float v = 3.14f * (r * r) * (h / 3);
        System.out.println("volume  = " + v);
	}
	
	public static void main(String[]args)
	{
	Cone2 ob = new Cone2();	
		ob.volume();

	}
}