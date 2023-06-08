
import java.util.Scanner;

class Circle4
{
	
	public void circumference()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		float r = sc.nextFloat();
		double c=2*(3.14)*r;
		System.out.println("Circuference of circle = "+c);
	}
	
	public static void main(String[]args)
	{
	Circle4 ob = new Circle4();	
		ob.circumference();

	}
}