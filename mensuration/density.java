// find the density

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class Density
{
	public static void main(String[]args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mass");
		float m = sc.nextFloat();
		System.out.println("Enter volume");
		float v = sc.nextFloat();
		double d=m/v;
		System.out.println("Density is = "+d);
	}
}