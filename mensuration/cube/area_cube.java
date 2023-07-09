// area of cube

import java.util.Scanner;

class Cube
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter Edge: " );
		int edge = sc.nextInt();

		float area = 6*(edge*edge);

		System.out.print("Area of Cube: "+area);
	}
}
