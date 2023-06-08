
import java.util.Scanner;

class Rectangle1
{
	
	public void area()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter lenth: " );
		int lenth = sc.nextInt();
		System.out.print("Enter width: ");
		int width = sc.nextInt();
		int area = lenth*width;
		System.out.print("Area of rectangle : "+area);	
	}
	
	public static void main(String[]args)
	{
		Rectangle1 ob = new Rectangle1();	
			ob.area();

	}
}