
import java.util.Scanner;

class Cube1
{
	
	public void area()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Edge: " );
		int edge = sc.nextInt();
		float area = 6*(edge*edge);
		System.out.print("Area of Cube: "+area);
	}
	
	public static void main(String[]args)
	{
	Cube1 ob = new Cube1();	
		ob.area();

	}
}