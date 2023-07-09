// lateral surface 

import java.util.Scanner;

class Cylinder
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter radius: " );
		int r = sc.nextInt();

		System.out.print("Enter height: " );
		int h = sc.nextInt();
		float ans = 2*3.14f*r*h;
		System.out.print(" lateral surface : "+ans);
	}
}
