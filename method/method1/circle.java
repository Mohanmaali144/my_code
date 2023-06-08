
import java.util.Scanner;

class Circle1
{
	
	public void area()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter redius: " );
		float r = sc.nextInt();
		float area = 3.14f*(r*r);
		System.out.print("Area of circle : "+area);		
	}
	public static void main(String[]args)
	{
	Circle1 ob = new Circle1();	
		ob.area();

	}
}