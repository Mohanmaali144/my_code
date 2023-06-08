//celsius to fahreheit

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class Cels
{
	public static void main(String[]args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter celsius: ");
		float c = sc.nextFloat();
		float f = (c*9)+32;
		System.out.println("celsius to fahrenheit = "+c);
	}
}