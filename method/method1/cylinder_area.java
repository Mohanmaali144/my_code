
import java.util.Scanner;

class Cylinder1
{
	
	public void area()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter radius: " );
		float r = sc.nextInt();
		float area = 2*3.14f*r+2*3.14f*(r*r);
		System.out.println("Area of cylinder : "+area);
	}
	
	public static void main(String[]args)
	{
	Cylinder1 ob = new Cylinder1();	
		ob.area();

	}
}