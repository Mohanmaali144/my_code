// circumference of circle 

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class Circuference
{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Radius: ");
		float r = sc.nextFloat();
		double c=2*(3.14)*r;

		System.out.println("Circuference of circle = "+c);
	}
}