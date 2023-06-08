// height of cylinder 

import java.util.Scanner;

class HeightCylinder
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter radius: " );
		float r = sc.nextInt();
		System.out.print("Enter area: " );
		float a = sc.nextInt();
		float h = a/(2*3.14f*r)-r;

		System.out.print("Height of cylinder : "+h);
	}
}
