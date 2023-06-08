
import java.util.Scanner;

class Circle2
{
	
	public void diameter()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter redius: " );
		int r = sc.nextInt();
		int area = r*2;
		System.out.print("Area of daimeter : "+area);
	}
	
	public static void main(String[]args)
	{
	Circle2 ob = new Circle2();	
		ob.diameter();

	}
}