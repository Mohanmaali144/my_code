// area of circle

import java.util.Scanner;

class Circle
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter redius: " );
		float r = sc.nextInt();


		float area = 3.14f*(r*r);

		System.out.print("Area of circle : "+area);
	}
}
