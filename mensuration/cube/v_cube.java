//volume of cube

import java.util.Scanner;
import java.lang.String;
import java.lang.System;

class VolumeCube{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter edge: ");
		float edge = sc.nextFloat();
		float v=(edge*edge*edge);
		System.out.println("volume  = "+v);

	}

}

