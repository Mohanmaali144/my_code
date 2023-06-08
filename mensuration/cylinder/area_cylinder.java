// area of cylinder

import java.util.Scanner;

class CylinderArea
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter radius: " );
		float r = sc.nextInt();
		float area = 2*3.14f*r+2*3.14f*(r*r);
		System.out.print("Area of cylinder : "+area);
	}
}
