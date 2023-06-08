// volume of recatngle

import java.util.Scanner;
import java.lang.String;
import java.lang.System;

class VolumeRectangle{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lenth of rectengal");
		float l = sc.nextFloat();
		System.out.println("Enter with of rectengal");
		float w = sc.nextFloat();
		System.out.println("Enter hight of rectengal");
		float h = sc.nextFloat();
		float v=l*w*h;
		System.out.println("volume  = "+v);

	}

}
