
import java.util.Scanner;

class Circle3
{
	
	public void redius()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Circumference of circle: " );
		float c = sc.nextInt();
		float r = c/(2*3.14f);
		System.out.print("Redius of circle : "+r);
	}
	
	public static void main(String[]args)
	{
	Circle3 ob = new Circle3();	
		ob.redius();

	}
}